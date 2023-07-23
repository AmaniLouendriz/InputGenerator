package org.example;

import Grammar.gen.SearchGrammarLexer;
import Grammar.gen.SearchGrammarParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.io.IOException;


public class Main {

    private static  ArrayList<String> places = new ArrayList<>(Arrays.asList("Canada", "Ottawa", "France",
            "United States", "Hawaii"));

    public static void main(String[] args){
        try{
            parseInput();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void parseInput() throws IOException {
        // general skeleton
        CharStream charStream = CharStreams.fromString("United States Aug.12 Mar.2 1 1 1 1 ");

        // Create a lexer instance
        SearchGrammarLexer lexer = new SearchGrammarLexer(charStream);

        // Create a token stream from the lexer
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        SearchGrammarParser parser = new SearchGrammarParser(tokenStream);
        ParseTree tree = parser.query();

        TreePrinter.print(tree);


//        System.out.println("place "+ tree.getChild(0).getText() );
//        System.out.println("checking  "+ tree.getChild(2).getText() );
//        System.out.println("checkout  "+ tree.getChild(4).getText() );
//        System.out.println("number "+ tree.getChild(6).getText() );

        try(FileWriter fp = new FileWriter("input.txt");
            BufferedWriter writer = new BufferedWriter(fp)){
            for (int i = 0; i < 50; i++) { // Generate 50 inputs
                Collections.shuffle(places);
                InputGenerationVisitor visitor = new InputGenerationVisitor();
                String input = visitor.visit(tree);
                writer.write(input + "\n");
            }
            CustomErrorListener errorListener = new CustomErrorListener();
            parser.removeErrorListeners();
            parser.addErrorListener(errorListener);

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }

    }

    public static ArrayList<String> getPlaces(){
        return places;
    }
}

class TreePrinter {
    public static void print(ParseTree tree) {
        print(tree, "", true);
    }

    private static void print(ParseTree tree, String prefix, boolean isLast) {
        System.out.print(prefix);
        System.out.print(isLast ? "└─ " : "├─ ");
        System.out.print(tree.getClass().getSimpleName());
        System.out.print(": ");
        System.out.println(tree.getText());

        for (int i = 0; i < tree.getChildCount(); i++) {
            boolean isChildLast = (i == tree.getChildCount() - 1);
            String childPrefix = prefix + (isLast ? "    " : "│   ");
            print(tree.getChild(i), childPrefix, isChildLast);
        }
    }
}








