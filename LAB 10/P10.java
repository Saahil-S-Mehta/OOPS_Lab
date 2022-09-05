package OOPS_LAB.P10;

import java.util.Scanner;


public class P10 {

    public static void main(String[] args){
        while (true) {
            System.out.print("""
                    \n--------------------------------------------------------------------------------------------------
                  
                    1) Find the Penultimate word of a sentence.
                    2) Swap a string "python" with "java" in a given string.
                    3) Split a string into a number of substrings.
                    4) EXIT.
                    \nEnter Choice: """);
            switch (new Scanner(System.in).nextInt()) {
                case 1: getPenultimateWord();
                        break;
                case 2: wordReplace();
                        break;
                case 3: getSubStrings();
                        break;
                default:  return;

            }
        }
    }

    private static void getSubStrings() {
        System.out.print("\n\nEnter The Sentence: ");
        Scanner inLine = new Scanner(System.in);
        String sentence = inLine.nextLine();
        String delimiter = "";
        System.out.print("\nDefault Delimiter is \" \" (space)\n Press y to continue with default or Enter Custom Delimiter: ");
        delimiter = inLine.next();
        if(delimiter.equalsIgnoreCase("y"))
            delimiter = " ";
        for(String subString: sentence.split(delimiter)){
            System.out.print("\n"+subString);
        };
    }

    private static void getPenultimateWord() {
        System.out.print("\n\nEnter The Sentence: ");
        Scanner inLine = new Scanner(System.in);
        String sentence = inLine.nextLine();
        String penUlt;
        try {
            penUlt = sentence.split(" ")[sentence.split(" ").length - 2];
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.print(e + "\nERROR!!! Enter A Sentence of minimum two words.\n");
            penUlt = "NULL";
        }
        System.out.println("\nPenultimate Word: "+ penUlt);
    }

    private static void wordReplace() {
        System.out.print("\n\nEnter The Sentence: ");
        Scanner inLine = new Scanner(System.in);
        String sentence = inLine.nextLine();
        int index = 0;
        String[] words = sentence.split(" ");
        for(String word: words){
            if(word.equalsIgnoreCase("java"))
                words[index] = "Python";
            else if(word.equalsIgnoreCase("python"))
                words[index] = "Java";
            index++;
        }
        StringBuilder sentenceBuilder = new StringBuilder();
        for(String word: words)
            sentenceBuilder.append(word).append(" ");
        sentence = sentenceBuilder.toString();
        System.out.println("Modified Sentence: "+ sentence);
    }

}