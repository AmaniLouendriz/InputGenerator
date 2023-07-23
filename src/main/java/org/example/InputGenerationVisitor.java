package org.example;

import Grammar.gen.SearchGrammarBaseVisitor;
import Grammar.gen.SearchGrammarParser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class InputGenerationVisitor extends SearchGrammarBaseVisitor<String> {
    private Random random = new Random();


    @Override
    public String visitQuery(SearchGrammarParser.QueryContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append(visit(ctx.place()));
        System.out.println("place"+sb);
        sb.append(" ");
        sb.append(visit(ctx.checkIn()));
        sb.append(" ");
        sb.append(visit(ctx.checkOut()));
        sb.append(" ");
        sb.append(visit(ctx.nbreGuests()));
        return sb.toString();
    }

    @Override
    public String visitPlace(SearchGrammarParser.PlaceContext ctx) {
        /*
         * here we are generating random numbers to see according to which rule in the place we're going to
         * generate input
         * */


        int firstOrSecond = random.nextInt(2);
        /*
            0: oneWord
            1: multiWord
        **/

        ArrayList<String> places = Main.getPlaces();

        System.out.println("places -> " + places.toString());

        StringBuilder sb = new StringBuilder();
        int randomLength = random.nextInt(1, 10);// length of the generated string
        char randomUpperCase = (char) (random.nextInt(26) + 'A');
        sb.append(randomUpperCase);

        boolean isAdded = false;// in case we have to construct two oneWord entities

        for (int i = 0; i < randomLength; i++) {
            int UpperOrLower = random.nextInt(2);// determining whether to generate an upper or lower letter
            if (UpperOrLower == 0) {
                char randomUp = (char) (random.nextInt(26) + 'A');
                sb.append(randomUp);
            } else if (UpperOrLower == 1) {
                char randomLower = (char) (random.nextInt(26) + 'a');
                sb.append(randomLower);
            }
            if (firstOrSecond == 1 && i == randomLength - 1 && isAdded == false) {
                i = 0;
                isAdded = true;
                randomLength = random.nextInt(1, 10);
                sb.append(" ");
                char randomUp = (char) (random.nextInt(26) + 'A');
                sb.append(randomUp);

            }
        }

        places.add(sb.toString());

        return places.get(random.nextInt(places.size()));
    }

    @Override
    public String visitCheckIn(SearchGrammarParser.CheckInContext ctx) {
        StringBuilder sb = new StringBuilder();
        ArrayList<String> months = new ArrayList<>(Arrays.asList("Aug", "Sep", "Oct", "Nov", "Dec"));

        String singleMonth = months.get(random.nextInt(months.size()));
        sb.append(singleMonth);
        System.out.println("single month"+ singleMonth);
        sb.append(".");
        int day = random.nextInt(1, 32);
        sb.append(day);
        return sb.toString();
    }

    @Override
    public String visitCheckOut(SearchGrammarParser.CheckOutContext ctx) {
        StringBuilder sb = new StringBuilder();
        ArrayList<String> months = new ArrayList<>(Arrays.asList("Aug", "Sep", "Oct", "Nov", "Dec"));

        String singleMonth = months.get(random.nextInt(months.size()));
        sb.append(singleMonth);
        sb.append(".");
        int day = random.nextInt(1, 32);
        sb.append(day);
        return sb.toString();
    }

    @Override
    public String visitNbreGuests(SearchGrammarParser.NbreGuestsContext ctx) {
        StringBuilder sb = new StringBuilder();
        int adult = random.nextInt(1, 17);
        int children = random.nextInt(1, 17);
        int infant = random.nextInt(1, 6);
        int pet = random.nextInt(1, 6);
        sb.append(adult);
        if (adult == 16 && random.nextBoolean() ){
            sb.append("+");
        }
        sb.append(" ");
        sb.append(children);
        sb.append(" ");
        sb.append(infant);
        sb.append(" ");
        sb.append(pet);
        sb.append(" ");

        return sb.toString();
    }
}
