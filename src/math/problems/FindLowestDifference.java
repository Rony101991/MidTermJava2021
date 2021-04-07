package math.problems;

public class FindLowestDifference {
    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int[] a = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] b = {18, 25, 41, 47, 17, 36, 14, 19};
        int lowestNumber =Integer.MAX_VALUE;

        for(int i =0;i<a .length;i++){
            if(lowestNumber > a[i]){
                lowestNumber= a[i];
            }
        }
        for(int i =0;i<b.length;i++){
            if(lowestNumber > b[i]){
                lowestNumber= b[i];
            }
        }
        System.out.println("lowest numbers is :" + lowestNumber);
    }

}



