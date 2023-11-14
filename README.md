# InputGenerator
This is part of a personnel approach to apply mutation and syntax based testing to test a specific feature of a web application: AirBnb was used as an example here.

**The feature under test was the search function** were a user selects the place, check in and checkout dates as well as the numbers of people looking for accomodation.

To do so, I needed **first a lot of inputs**, and **mutating those inputs** to see how the web app would treat those queries.

**1- Input generation:**
 Since the inputs have different components but share the same structure, first a grammar was written using Antlr. Antlr analyzes this grammar and generates some classes based on it. 
 Lexer and Parser were the two important ones in my case. So, we first give a sample input, based on the sample input Antlr will build a parse tree. And we would then visit this parse tree
 and perform specific operations in each node; especifically generating more inputs for a specific component. At last we would gather those little chuncks to create a full input 
 as the web app is waiting for.

 **2- Input Mutation:**
 Now that inputs were generated, mutating them is a painful process if not automated. So Radamsa was used to provide some sort of input fuzzing. A bash script was written to perform
 some specific mutations using the seed number after carefully selecting the seed number after different trials. 

 Like that all those inputs were able to be fed to testcases (junit tests and selenium ones); and an important observation was being made; it's that providing a non sense place
 to look for accomodation gives non sense results. Considering this as a bug or not is a big question and depends on the requirements of the webapp.
 


