package pl.waw.sgh.pl;

public class WhileLoop {

    public static void main(String[] args) {
        int j = 0;

        while (j < 8) {
            System.out.println("j=" + j);
            j++;
        }
        System.out.println();

        Integer k = 1;
        do {
            System.out.println("k=" + k);
            k++;

        } while (k < 5);
    }
}
