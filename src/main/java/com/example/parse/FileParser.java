package com.example.parse;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Scanner;

public class FileParser {

    public String parse(String name) {
        try {
            File myObj = new File("/Users/karthikgaddam/Downloads/browserstack/src/main/java/com/example/parse/text.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                return data;
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }
        return null;
    }

    public static void main(String[] args) {
        FileParser fp = new FileParser();
        fp.parse("text.txt");
    }

}
