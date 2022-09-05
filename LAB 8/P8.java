package OOPS_LAB.P8;

import java.io.*;
import java.util.*;

interface PerformOperation {
    boolean check(int input);
}

class operatorCheck {
    public static boolean checker(PerformOperation op, int num) {
        return op.check(num);
    }

    public static PerformOperation isOdd(){
        return input -> input % 2 != 0;
    }

    public static PerformOperation isPrime(){
        return input ->{ for (int i = 2; i * i <= input; i++) {
            if (input % i == 0) {
                return false;
            }
        }
            return true;
        };
    }

    public static PerformOperation isPalindrome() {
        return input -> input == Integer.parseInt(new StringBuilder(String.valueOf(input)).reverse().toString());
    }
}

public class P8 {
    public static void main(String[] args) throws IOException {
        operatorCheck opCheck = new operatorCheck();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nTests;
        try
        {
            nTests = Integer.parseInt(br.readLine());
        }catch (NumberFormatException e){
            nTests = Integer.parseInt(br.readLine());
        }
        PerformOperation operation;
        boolean res = false;
        String ans = null;
        StringBuilder outputBuilder = new StringBuilder();
        while (nTests-- > 0) {
            System.out.println("\n1. isODD()");
            System.out.println("2. isPRIME()");
            System.out.println("3. isPALINDROME()");
            String s = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(s);
            int choice = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            switch (choice) {
                case 1 -> {
                    operation = opCheck.isOdd();
                    res = opCheck.checker(operation, num);
                    ans = res ? "ODD" : "EVEN";
                }
                case 2 -> {
                    operation = opCheck.isPrime();
                    res = opCheck.checker(operation, num);
                    ans = res ? "PRIME" : "COMPOSITE";
                }
                case 3 -> {
                    operation = opCheck.isPalindrome();
                    res = opCheck.checker(operation, num);
                    ans = res ? "PALINDROME" : "NON PALINDROME";
                }
                default -> ans = "INVALID CHOICE";
            }
            outputBuilder.append(num).append(" : ").append(ans).append("\n");
        }
        System.out.println("\n\nRESULT:\n" + outputBuilder);
    }
}
