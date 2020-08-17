// Arrays_class_exercise
import java.util.*;
public class array_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
    
    // sorted the array in ascending order
    for(int i =0;i<n;i++)
    {
      for(int j=1;j<n;j++)
      {
        if(arr[j]<arr[i])
        {
          int temp =arr[j];
          arr[j] = arr[i];
          arr[i] = temp;
        }
      }
    }
		int diff =arr[n-1]-arr[0];
		System.out.println("The difference between highest & lowest is:"+ diff);
		}

}