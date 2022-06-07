package ua.com.course;

import java.io.*;
import java.util.Scanner;

public class RunProgram {
    public static void start() throws IOException {
        System.out.println("Welcome to \"Mult_arrays & Strings\" program!");
        System.out.println("Please enter!");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String line = reader.readLine();
            while (true) {
                System.out.println();
                navigation();
                caseLogic(reader);
            }
        }catch (Exception e) {
            System.out.println("error: " + e);
        }


    }
    private static void navigation() {
        System.out.println("If you want to run task1 (sum of rows), please enter 1");
        System.out.println("If you want to run task2 (strings in file), please enter 2");
        System.out.println("If you want exit, please enter 0");
    }

    private static void caseLogic(BufferedReader reader) throws IOException {
        String line = reader.readLine();
        switch (line) {
            case "1" -> sumRows();
            case "2" -> fileString();
            case "0" -> {
                System.out.println("Thanks for using!");
                System.exit(0);
            }
        }
    }

    private static void sumRows(){
        int [][] multArray = {{1,2,3,4,5},{3,5,7},{5,6},{3,4,6,7,8}};
        int [] array=new int[multArray.length];

        System.out.println("Mult_array:\n");
        for(int i=0; i<multArray.length; i++){
            for(int j=0; j < multArray[i].length; j++){
                System.out.print(multArray[i][j]+"\t");
                array[i]+=multArray[i][j];
            }
            System.out.println();
        }

        System.out.println("\nArray:\n");
        for (int x : array) {
            System.out.print(x+"\t");
        }
        System.out.println("\n\n");

    }

    private static void fileString() throws IOException {
        FileReader fileReader= new FileReader("mult_array/src/main/java/ua/com/course/file.txt");
        Scanner scan = new Scanner(fileReader);
        StringBuilder stringBuilder = new StringBuilder();
        String result;

        while (scan.hasNextLine()) {
            stringBuilder.append(scan.nextLine()+"\n");
        }

        result=stringBuilder.toString();

        System.out.println("\n"+result+"\n");

        fileReader.close();

    }
}
