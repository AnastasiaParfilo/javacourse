package ua.com.course;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RunProgram {
    public static void start() throws IOException {
        System.out.println("Welcome to \"Arrays\" program!");
        System.out.println("Please enter!");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String line = reader.readLine();
            while (true) {
                System.out.println();
                caseLogic(reader);
            }
        }catch (Exception e) {
            System.out.println("error: " + e);
        }
    }

    private static void caseLogic(BufferedReader reader) throws IOException {
        String check="";
        do {
            System.out.println("\nPlease enter the number you want to check -->");
            String line = reader.readLine();

            int length = line.length();

            boolean flag = true;
            for (int i = 0; i < length / 2; i++) {
                if (!(line.charAt(i) == line.charAt(length - 1 - i))) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("Number: " + line + " is PALINDROME!!!");
            } else {
                System.out.println("Number: " + line + " is NOT palindrome.");
            }

            System.out.println("\nIf you want to check number again, please enter 1");
            System.out.println("If you want exit, please enter 0");

            check = reader.readLine();

        }while (check.equals("1"));

        System.out.println("\nThanks for using!");
        System.exit(0);
    }
}
