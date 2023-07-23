grammar SearchGrammar;
program: query;
query: place WS checkIn WS checkOut WS nbreGuests;
place: oneWord | multiWord| withStreetAddress;
oneWord: UPPERLETTER (UPPERLETTER | LOWERLETTER)*;//like Canada
multiWord: oneWord (WS oneWord)*;//like United States +
withStreetAddress: DIGIT DIGIT cardinal WS ((UPPERLETTER LOWERLETTER) WS)+ ',' oneWord ',' province WS oneWord;
cardinal: 'th' | 'st' | 'rd' | 'nd';
province: UPPERLETTER UPPERLETTER;
checkIn: month '.' (DIGIT | DIGIT DIGIT);
checkOut: month '.' (DIGIT | DIGIT DIGIT);
nbreGuests: adult WS children WS infant WS pet WS;
adult: NBRE;
children: NBRE;
infant: '1'|'2'|'3'|'4'|'5';
pet: '1'|'2'|'3'|'4'|'5';
month: 'Aug' | 'Sep' | 'Oct' | 'Nov' | 'Dec';
NBRE: '1'|'2'|'3'|'4'|'5'|'6'|'7'|'8'| '9'|'10'|'11'|'12'|'13'|'14'|'15'|'16+';
UPPERLETTER:'A' .. 'Z';
LOWERLETTER:'a' .. 'z';
DIGIT: '0' .. '9';
LETTER: LOWERLETTER | UPPERLETTER;
WS: [ \t\r\n]+;

//Valid Inputs according to grammar:
/*
Canada Jun.1 Apr.2 1 1 1 1 ; // Valid
Ottawa Sep.21 Dec.52 1 1 1 0 ; // Invalid Dec.52??
Abchwks Feb.31 May.12 2 1 0 0 ; // Invalid Feb.31 ?? Name of place??
United States Oct.5 Oct.12 0 0 1 0 ; // Valid
Unheg Fjejh Jan.12 May.19 2 0 0 0 ; // Invalid name of place ??
 **/
// Invalid inputs according to grammar
 /*

 Ground string mutators:
 1- change the 'C' to K
    Kanada Jun.1 Apr.2 1 1 1 1 ;
    Ottawa Sep.21 Dek.52 1 1 1 0 ;
    Abkhwks Feb.31 May.12 2 1 0 0 ;
    United States Oct.5 Oct.12 0 0 1 0 ;
    Unheg Fjejh Jan.12 May.19 2 0 0 0 ;

 1- change 5 to 0

    Canada Jun.1 Apr.2 1 1 1 1 ; // Valid
    Ottawa Sep.21 Dec.02 1 1 1 0 ; // Invalid Dec.52??
    Abchwks Feb.31 May.12 2 1 0 0 ; // Invalid Feb.31 ?? Name of place??
    United States Oct.0 Oct.12 0 0 1 0 ; // Valid
    Unheg Fjejh Jan.12 May.19 2 0 0 0 ;

 **/


