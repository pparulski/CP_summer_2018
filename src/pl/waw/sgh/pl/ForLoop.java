package pl.waw.sgh.pl;

public class ForLoop {

    public static void main(String[] args) {

        for (int i=0; i<5; i++){
            System.out.println("i=" + i);
        }

        System.out.println();

        for (int i=6; i<7; i--){ // we can also define iterator outside the loop

            if (i==3) continue;
            System.out.println("i=" + i); // ctrl+c is a way to stop command line
            if (i==0) break;
        }
    }
}
