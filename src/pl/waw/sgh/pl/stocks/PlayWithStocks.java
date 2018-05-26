package pl.waw.sgh.pl.stocks;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlayWithStocks extends Company{


    public PlayWithStocks(String name, String open, String close) {
        super(name, open, close);
    }

    public static String getBaseName(String fileName) { //get filename without extension
        int index = fileName.lastIndexOf('.');
        if (index == -1) {
            return fileName;
        } else {
            return fileName.substring(0, index);
        }
    }

    public static void skipLines(Scanner s, int lineNum){ //skip first n lines in file
        for(int i = 0; i < lineNum;i++){
            if(s.hasNextLine())s.nextLine();
        }
    }



    public static void main(String[] args) throws IOException {

        File folder = new File("/Users/piotrparulski/IdeaProjects/CP_summer_2018/src/pl/waw/sgh/pl/companies");
        File[] listOfFiles = folder.listFiles();

        String[] tablica2 = new String[listOfFiles.length];


        for (int i = 0; i < listOfFiles.length; i++) { //preparing list of files
            if (listOfFiles[i].isFile()) {
                tablica2[i] = getBaseName(listOfFiles[i].getName());
            } else if (listOfFiles[i].isDirectory()) {
                System.out.println("Directory " + listOfFiles[i].getName());
            }
        }

        for(int j = 0; j < tablica2.length; j++) {

            File f1 = new File("/Users/piotrparulski/IdeaProjects/CP_summer_2018/src/pl/waw/sgh/pl/companies/" + tablica2[j] + ".csv");
            List<Company> compList = new ArrayList<>();


            Scanner s = new Scanner(f1);
            skipLines(s, 1);
            while (s.hasNextLine()) {
                String data[] = s.nextLine().split(","); //getting the data to calculate on

                compList.add(new Company(getBaseName(f1.getName()), data[1], data[4]));

            }

            s.close();

            System.out.println(compList);


            String[] tablica = new String[compList.size()];

            for (int i = 0; i < compList.size(); i++) { //change to string to write to file in new column
                tablica[i] = toPercenteage(compList.get(i).getChange()).replaceAll(",",".");
                //change to string, change to nice % format, change comma to dot
                System.out.println(tablica[i]);
            }



            BufferedReader br = null;
            BufferedWriter bw = null;
            final String lineSep = System.getProperty("line.separator");

            try {
                File file = new File("/Users/piotrparulski/IdeaProjects/CP_summer_2018/src/pl/waw/sgh/pl/companies/" + tablica2[j] + ".csv");
                File file2 = new File("/Users/piotrparulski/IdeaProjects/CP_summer_2018/src/pl/waw/sgh/pl/companies/" + tablica2[j] + "1.csv");

                br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file2)));
                String line;
                int i = 0;

                for (line = br.readLine(); line != null; line = br.readLine(), i++) {

                    if (i == 0) {
                        String addedColumn = String.valueOf("Change(%)"); //adding header
                        bw.write(line + "," + addedColumn + lineSep);
                    } else {
                        String addedColumn = String.valueOf(tablica[i - 1]); //adding change data
                        bw.write(line + "," + addedColumn + lineSep);
                    }
                }

            } catch (Exception e) {
                System.out.println(e);
            } finally {
                if (br != null)
                    br.close();
                if (bw != null)
                    bw.close();
            }


        }

        System.out.println("Columns added!");
    }


    }




