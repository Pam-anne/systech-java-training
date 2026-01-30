package com.github.pamanne.exercises.javase013.exercise1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;

public class ReadFile {
    public static void main(String[] args) {
        BufferedReader reader = null;

        try {
            if (args.length == 0) {
                throw new ArrayIndexOutOfBoundsException("No filename provided!");
            }

            String fileName = args[0];
            System.out.println("Reading file: " + fileName);
            reader = new BufferedReader(new FileReader(fileName));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Please provide a filename as an argument.");
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found. Please check the filename and try again.");
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        } finally {
            if (reader != null) {
                try {

                    reader.close();
                    System.out.println("File closed successfully.");
                } catch (IOException e) {
                    System.out.println("Error closing the file: " + e.getMessage());
                }
            }
            System.out.println("Program finished running.");
        }

    }
}
