package pl.waw.sgh.pl;

public class InputArgs {
    public static void main(String[] args) {
        int i = 0;
        for (String arg: args){

            System.out.println("Arg: " + arg);
            i++;
        }
        System.out.println("Number of arguments: " + i);
    }
}
