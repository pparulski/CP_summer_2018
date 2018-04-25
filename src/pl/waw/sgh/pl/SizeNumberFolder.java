package pl.waw.sgh.pl;

import java.io.File;

public class SizeNumberFolder {

    public static void main(String[] args) {
        File f = new File("/Users/piotrparulski/IdeaProjects/PrimeNumbers");

        long count = 0;
        long size = 0;

        size = getFileFolderSize(f);
        count = getFileFolderCount(f);

        double sizeMB = (double) size / 1024 / 1024;
        String s = "MB";
        if (sizeMB < 1) {
            sizeMB = (double) size / 1024;
            s = "KB";
        }
        System.out.println(f.getName() + ": " + sizeMB + s);
        System.out.println(f.getName() + ": " + count + " files and directories");


    }

    public static long getFileFolderSize(File dir) {
        long size = 0;
        if (dir.isDirectory()) {
            for (File file : dir.listFiles()) {
                if (file.isFile()) {
                    size = size + file.length(); // getting the size
                } else
                    size = size + getFileFolderSize(file);
            }
        } else if (dir.isFile()) {
            size = size + dir.length();
        }
        return size;

    }


    public static long getFileFolderCount(File file){
        long count = 0;

        if(file.isDirectory()){
            File[] files = file.listFiles();
           for (int i = 0; i < files.length; i++){
                count = count + getFileFolderCount(files[i]);
            }

        }
        else if(file.isFile()){
            count++;
        }
        return count;
    }

 //exceptions!!!
    }
