package pl.waw.sgh;

public class Booleans {

    public static void main(String[] args) {

        boolean p = true;
        boolean q = false;

        //AND
        boolean res = p && q;

        //OR
        boolean res1 = p || q;

        // XOR
        boolean res2 = p ^ q;

        // Negation
        boolean res3 = !res2;

        //res1==true
        if (res1) {
            System.out.println("res1 is true");
        }


        //shift + cmd + strzalka zaznaczanie kodu
        System.out.println("res=" + res);
        //shift + strzalka na koniec linii
        System.out.println("res=" + res1);
        //ctrl + strzalka kolejne slowo
        System.out.println("res=" + res2);

    }
}
