package OOPS_LAB.P9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class P9 {
    static ArrayList<String> S = new ArrayList<>();
    static ArrayList<String> C = new ArrayList<>();
    static String[] A;
    public static void main(String[] args){
        while (true) {
            System.out.print("""
                    \n\n*************************************************************************************************
                    1) Add String Elements to ArrayList
                    2) Copy ArrayList to Array
                    3) Reverse ArrayList content
                    4) Get Sub list from the ArrayList.
                    5) Sort the ArrayList
                    6) Clone the ArrayList to another ArrayList
                    7) Display ArrayList
                    8) Display Aux ArrayList
                    9) Display Aux Array 
                    10) Delete Last Item from ArrayList
                    11) Clear ArrayList                  
                    Any other number to Exit: """);
            switch (new Scanner(System.in).nextInt()) {
                case 1 -> addListItem();
                case 2 -> copyListToArray();
                case 3 -> reverseArrayList();
                case 4 -> getSubList();
                case 5 -> sortList();
                case 6 -> cloneList();
                case 7 -> showList();
                case 8 -> showAuxList();
                case 9 -> showAuxArray();
                case 10 -> removeLastArrayList();
                case 11 -> clearArrayList();
                default -> {
                    return;
                }
            }
        }
    }

    private static void getSubList() {
        System.out.print("Size of ArrayList S: "+S.size()+"\nEnter Valid Index [0, "+(S.size()-1)+"]\nEnter Start Index: ");
        int startIndex = (new Scanner(System.in)).nextInt();
        System.out.print("Enter End Index of the Sublist: ");
        int endIndex = (new Scanner(System.in)).nextInt();
        if(startIndex < 0 || endIndex >= S.size()){
            System.out.println("Invalid Index!! Returning to Menu! -_-");
        }
        System.out.println("Sublist: "+S.subList(startIndex, endIndex));
    }

    private static void clearArrayList() {
        S.clear();
    }

    private static void removeLastArrayList() {
        int size = S.size();
        if(size == 0){
            System.out.println("ArrayList Empty! Add items to remove :lol:");
            return;
        }
        String delEle = S.get(size-1);
        S.remove(size-1);
        System.out.println("\n\t\""+delEle+"\" was removed.");
    }

    private static void showAuxArray() {
        System.out.println("AUX ARRAY\t-->\t"+ Arrays.toString(A));
    }

    private static void showAuxList() {
        System.out.println("AUX ARRAYLIST\t-->\t"+ C.toString());
    }

    private static void showList() {
        System.out.println("ARRAYLIST\t-->\t"+ S.toString());
    }

    private static void cloneList() {
        C.clear();
        C = (ArrayList<String>) S.clone();
    }

    private static void sortList() {
        Collections.sort(S);
    }

    private static void reverseArrayList() {
        if(!S.isEmpty())
            Collections.reverse(S);
    }

    private static void copyListToArray() {
        if(S.size() == 0){
            System.out.println("ArrayList Empty! Add items and then copy.");
            return;
        }
        A = new String[S.size()];
        A = S.toArray(A);
    }

    private static void addListItem() {
        Scanner inLine = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while(true){
            System.out.print("Enter the String: ");
            String input = inLine.nextLine();
            if(input.equalsIgnoreCase("stop")){
                S.addAll(list);
                return;
            }
            list.add(input);
        }
    }
}