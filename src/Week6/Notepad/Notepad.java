package Week6.Notepad;

import java.io.*;
import java.util.Scanner;

public class Notepad {

    public static void main(String[] args) {

        createFile();
    }

    static void createFile() {
        File file = new File("src/Week6/Notepad/Notepad.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("File created successfully");
                writeFile(file);
                readFile(file);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.print("Your last saved text: ");
            readFile(file);
            writeFile(file);
        }

    }

    static void writeFile(File file) {
        Scanner input = new Scanner(System.in);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            System.out.print("The text you want to save: ");
            bufferedWriter.write(input.nextLine());
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    static void readFile(File file) {
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            //System.out.print("The text you saved: ");
            while ((line= bufferedReader.readLine())!=null) {
                System.out.print(line+ " ");
            }
            System.out.println();
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
