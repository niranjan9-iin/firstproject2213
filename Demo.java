import java.util.*;

/*
Sample inputs and outputs
.............................................................
input={1,3,5,8,9,2,6,7,6,8,9}
output=3  //number of jumps.
..........................................................
input={1,0,1,0}
output=infinity
.....................................................\
input={1,3,9,8,9,9,1,0,1,0};
output=3
..........................................................
input={1,1,1,1,1,1}
output=5


*/



public class Mainp {

	public static void main(String[] args) {
		
		//int[] arry= {1,3,9,8,9,9,1,0,1,0};
		//int[] arry= {1,1,1,1,1,1};
		//int[] arry= {1,0,1,0,1};
		int[] arry={1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
		int size=arry.length;
		int count=0;
		int no_of_hops=0;
		int next_term=0;
		
		for(int i=0;i<size-1;i++)
		{
		if(next_term>=size-1)
		{
			break;
		}
		
			
			no_of_hops=arry[next_term];
			next_term=no_of_hops+i;
			if(no_of_hops==0)
			{
				System.out.println("infinity");
				count=0;
				break;
			}
			count++;
			
			
		}

		System.out.println(count);
		
	}

}
