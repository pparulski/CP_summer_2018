package pl.waw.sgh.pl;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import javax.xml.crypto.Data;
import java.util.Date;

public class Numbers {

    public static void main(String[] args) { // psvm
        int b;
        b = 9;
        int a = 5;

        int c = a + b;

        Integer aa = a;
        aa = 5656*a;
        // + - * /
        int a1 = b % a;
        System.out.println("a1=" + a1);

        // add 1 to a1
        a1++;
        //substract 1 from a1
        a1--;

        //int a2 = a1++;
        int a2 = ++a1;

        System.out.println("a2=" + a2);

        Float f1 = 353.5f;
        Double d1 = 755.6d;

        //Float f2 = f1 + d1; won't work
        Double d2 = f1 + d1; //resulting type is of better precision

        Long l1 = 54L; //object
        int i1 = 35234;
        //Integer i2 = i1 + l1; won't work
        long l2 = i1 + l1; //long is datatype of better precision than int
        byte b1 = 56;
        short s1 = 342;
        long l3 = b1 * s1;

        //  Long.valueOf(12) - convert from  long to Long (object)
        int i3 = Long.valueOf(l2).intValue();
        int i4 = l1.intValue();

        long l4 = 2993289382982928899L; // "zawija" od nowa z zakresu
        System.out.println("l4=" + l4);
        int i5 = Long.valueOf(l4).intValue();
        System.out.println("i5=" + i5);



        Date curDate = new Date();
        System.out.println(System.currentTimeMillis());
        System.out.println(curDate);

        Double dd = 5.367347*1e20;
        Long dd2 = Math.round(dd);

        System.out.println(dd);
        System.out.println(dd2);

        double dd4 = Math.pow(2.0,4.0);
        //Math.
    }
}
