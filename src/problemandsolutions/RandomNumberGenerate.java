package problemandsolutions;

import java.util.Random;

public class RandomNumberGenerate {
    //Write Java program to generate a random number between 1 to 8.
    public static void main(String[] args) {


        Random sk = new Random();
        int a;
        for (int c = 1; c <= 8; c++) {
            a = 1 + sk.nextInt(8);
            System.out.println(a + "");
        }

    }
}