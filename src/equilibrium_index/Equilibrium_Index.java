package equilibrium_index;

import java.util.Scanner;
/**
 * You are given an array A of integers of size N.
Your task is to find the equilibrium index of the given array
The equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.
If there are no elements that are at lower indexes or at higher indexes, then the corresponding sum of elements is considered as 0.

PS:
If there is no equilibrium index then return -1.
If there are more than one equilibrium indexes then return the minimum index.

 */
public class Equilibrium_Index {

		private static int equilibrium_index(int[] array)
		{
	        if(array.length==1)
	        {
	            return 1;
	        }
	        int total_sum=0;
	        int i=0;
	        for(i=0;i<array.length;i++)
	        {
	            total_sum+=array[i];
	        }
	        int left_sum=0;
	        for(i=0;i<array.length;i++)
	        {
	            if(left_sum==total_sum-array[i])
	            {
	                return i;
	            }
	            left_sum+=array[i];
	            total_sum-=array[i]; 
	        }
	      
	        return -1;
	 }
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scanner=new Scanner(System.in);
			int array_size=scanner.nextInt();
			int array[]=new int[array_size];
			for(int i=0;i<array_size;i++)
			{
				array[i]=scanner.nextInt();
			}
			System.out.println(equilibrium_index(array));
		}	
}
/*
 	Input
		A = [-7, 1, 5, 2, -4, 3, 0]

	Output
		3

	Input
		A = [1, 2, 3]

	Output
		-1
*/
