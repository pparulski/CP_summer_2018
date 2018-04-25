package pl.waw.sgh.pl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadTxt {

    final static String FILE = "/Users/piotrparulski/Desktop/myFile.txt";

    public static void main(String[] args) {
        System.out.println("File separator: " + File.separator);
        File myFile = new File(FILE);
        try {
            Scanner scanner = new Scanner(myFile);
            int  i = 0;
            while (scanner.hasNext()){
                String line = scanner.nextLine();
                String[] cells = line.split(",");
                for (String el : cells) {
                    System.out.println("El: " + el);
                }
                System.out.println("New line");
                i++;
                System.out.println();
               // System.out.println("Line " + i + " : " + line);
            }
        }   catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
} // program that will interpret csv file which will contain the state of tic-tac-toe game, has anyone won? Nobody? Or is it still on? Include the possibility of extending board
