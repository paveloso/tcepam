package tcepam.week5.tsk1;

import java.io.*;
import java.util.Scanner;

public class TheApp {

    public void createFile() {
        System.out.println("Name of file you want to create?");
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        File file = new File("C:/Users/postscriptum/Desktop/" + fileName + ".txt");

        try {
            if (file.createNewFile()) {
                System.out.println("File " + fileName + ".txt created succesfuly");
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deleteFile() {
        System.out.println("Name of file you want to delete?");
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        File file = new File("C:/Users/postscriptum/Desktop/" + fileName + ".txt");

        try {
            if (file.delete()) {
                System.out.println("File " + fileName + ".txt deleted succesfuly");
            } else {
                System.out.println("Delete operation failed");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addToFile() {
        System.out.println("Name of file you want to use?");
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();

        if (new File("C:/Users/postscriptum/Desktop/" + fileName + ".txt").exists()) {

            File file = new File("C:/Users/postscriptum/Desktop/" + fileName + ".txt");
            System.out.println("What do you want to append?");
            Scanner sc = new Scanner(System.in);
            String textToAdd = sc.nextLine();
            try {
                FileWriter fileWriter = new FileWriter(file, true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                PrintWriter printWriter = new PrintWriter(bufferedWriter);

                printWriter.println(textToAdd);
                printWriter.close();

            } catch (IOException e) {
                e.printStackTrace();
            }


        } else {
            try {
                throw new FileNotFoundException();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

        }
    }
} 
