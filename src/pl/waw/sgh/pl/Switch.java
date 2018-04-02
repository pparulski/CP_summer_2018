package pl.waw.sgh.pl;

public class Switch {

    private final static String CONST_A = "A"; //final !!!
    private final static String CONST_B = "B"; //final !!!
    private final static String CONST_C = "C"; //final !!!


    public static void main(String[] args) {

        //CONST = "B"; we can't reassign the value

        String s = "A";

        switch (s) {
            case CONST_A :
                System.out.println("s is A");
                break;
            case CONST_B:
                System.out.println("s is B");
                break;
            case CONST_C:
                System.out.println("s is C");
                break;
            default:
                System.out.println("s is not A or B or C");
        }
    }
}
