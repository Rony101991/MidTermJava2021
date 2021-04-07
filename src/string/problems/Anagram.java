package string.problems;


import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".


        String a ="ICEMAN";
        String b ="CINEMA";
        String c ="ABC";
        String d ="CBA";

        System.out.println(anagramMethod(a,b));
        System.out.println(anagramMethod(c,d));
        System.out.println(anagramMethod(a,c));
    }

    public static boolean anagramMethod(String k, String l) {

        char[] ArrayOfCharFromStringK = k.toCharArray();
        char[] ArrayOfCharFromStringL= l.toCharArray();
        Arrays.sort(ArrayOfCharFromStringK);
        Arrays.sort(ArrayOfCharFromStringL);

        return Arrays.equals(ArrayOfCharFromStringK,ArrayOfCharFromStringL);

    }

    }


