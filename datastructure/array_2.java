// Set A
import java.util.*;
public class array_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr=new int[10];
		System.out.println("Enter 10 elements in array");
		for(int i=0; i<10; i++)
		{
			arr[i]=sc.nextInt();
		}

    // Elements are even index
		System.out.println("Elements at even position are:");
    for(int i=0;i<10;i++)
    {
      if(i%2==0)
      {
        System.out.print(arr[i]+ " ")
      }
    }
    // Elements at odd index
		System.out.println("Odd elements are:");
		for(int i=0; i<10; i++)
		{
			if(arr[i]%2!=0)
			{
				System.out.print(arr[i]+" ");
			}
		}
    // Array in reverse order
		System.out.println("Reversed array elements are:");
		for(int i= 10 ; i>=1;i--)
		{
			System.oujt.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("First element: "+ arr[0] +" Last element: "+ arr[9]);
	}
}