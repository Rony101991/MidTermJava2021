package math.problems;

public class MakePyramid {


    /*   Implement a large Pyramid of stars in the screen with java.

     *
     * *
     * * *
     * * * *
     * * * * *
     * * * * * *

     */
    public static void main(String[] args) {
      //a=7 rows
        for(int a=0; a<9;a++){
            for(int b=0; b<10-a;b++){
                System.out.print(" ");
            }
            for(int c=0; c<=a; c++){
                System.out.print(" *");
            }
            System.out.println();
        }


    }
}

