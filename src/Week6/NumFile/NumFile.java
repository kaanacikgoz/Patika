package Week6.NumFile;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class NumFile {

    public static void main(String[] args) {

        createFile();
    }

    static void createFile() {
        File numFile = new File("src/Week6/NumFile/kaan.txt");
        try {
            numFile.createNewFile();
            System.out.println("File created successfully!");
            writeFile(numFile);
            readFile(numFile);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    static void writeFile(File file) {
        String textData = "5\n10\n20\n12\n33";
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(textData);
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
            int count=0;
            while ((line=bufferedReader.readLine())!=null) {
                System.out.println(line);
                count += Integer.parseInt(line);
            }
            System.out.println("Sum of the numbers: "+count);
            bufferedReader.close();
            fileReader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
