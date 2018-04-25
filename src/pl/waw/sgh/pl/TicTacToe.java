package pl.waw.sgh.pl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TicTacToe  {

    final static String FILE = "/Users/piotrparulski/Desktop/myFile.txt";

    public static void main(String[] args) {

        File myFile = new File(FILE);
        String[] komorki = new String[0];

        try {
            Scanner scanner = new Scanner(myFile);
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                komorki = line.split(",");


                int[] cells = new int[komorki.length];

                int j = 0;

                for (String textValue : komorki) {
                    cells[j] = Integer.parseInt(textValue);
                    j++;
                }


                /*/
                    -1 – cross
                     1 - nought
                     0 - empty
                 */
                if(((cells[0] & cells[1] & cells[2]) == -1) || ((cells[3] & cells[4] & cells[5]) == -1) || ((cells[6] & cells[7] & cells[8]) == -1)
                    || ((cells[0] & cells[3] & cells[6]) == -1) || ((cells[1] & cells[4] & cells[7]) == -1) || ((cells[2] & cells[5] & cells[8]) == -1)
                    ||((cells[0] & cells[4] & cells[8]) == -1) | ((cells[2] & cells[4] & cells[6]) == -1)){
                    System.out.println("Crosses won!");
                } else { if(((cells[0] & cells[1] & cells[2]) == 1) || ((cells[3] & cells[4] & cells[5]) == 1) || ((cells[6] & cells[7] & cells[8]) == 1)
                        || ((cells[0] & cells[3] & cells[6]) == 1) || ((cells[1] & cells[4] & cells[7]) == 1) || ((cells[2] & cells[5] & cells[8]) == 1)
                        || ((cells[0] & cells[4] & cells[8]) == 1) || ((cells[2] & cells[4] & cells[6]) == 1)){
                        System.out.println("Noughts won!");
                }
                            else {System.out.println("No one won yet!");}}



            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}