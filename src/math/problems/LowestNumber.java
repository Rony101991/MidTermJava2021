package math.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LowestNumber {

	public static void main(String[] args) {
		/*
		 * Write java solution to find the lowest number from this array.
		 */
		int  array[] = new int[]{211,110,99,34,67,89,67,456,321,456,78,90,45,32,56,78,90,54,32,123,67,5,679,54,32,65};
		int min=array[0];

		for(int x=0; x< array.length; x++)
			{
			if(array[x]<min){
				min=array[x];
			}
			}

		System.out.println("Lowest number: "+min);

	}

}
