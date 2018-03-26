package pl.waw.sgh;

public class Strings {
    public static void main(String[] args) {
        //quotation mark for strings
        char c = 'a';

        //will show value from the unicode table
        char d = 68;
        // debugger klikamy po lewej na brake point i uruchamiamy jako debugger funkcja step over linia po linii
        char e = 33936;

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        String s1 = "abc";
        // abc is basically three objects (integer) of a, b and c
        System.out.println(s1);
        String s2 = s1;

        System.out.println(s2);

        if (s2 == s1) { //comparing pointers (works with primitive types where pointers is a value also)
            System.out.println("s2==s1"); /*/jezeli s1 i s2 beda miec abc, ale utworzymy nowy string s2,
                                            to wskazniki beda rozne i zwroci false/*/
        }

        if (s2.equals(s1)) { //comparing values (won't work with primitive types)
            System.out.println("s2 equals s1");
        }

        s2 = s2 + "d";
        System.out.println(s2);

        String s3 = s1.concat(s2); // s1 + s2;
        String s4 = s1.replace('b', 'B');
        System.out.println(s4);
        char c1 = s1.charAt(2); // we start counting from 0
        System.out.println(c1);
        int i = "Hello World".indexOf("l"); // showing the position of the beginning of the declared substring
        System.out.println(i);
        int j = "Hello World".lastIndexOf("l"); // showing the position of the beginning of the declared substring
        System.out.println(j);


        boolean sw = "Hello World".startsWith("Hell");
        System.out.println("s1 len " + s1.length());

        String s6 = "Hello World"; //it cuts out first seven
        String s7 = s6.substring(7);
        System.out.println(s7);
        String s8 = s6.substring(0,5); //it shows only from 0 to 5 index
        System.out.println(s8);
    }
}
