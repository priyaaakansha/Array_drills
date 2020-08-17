// Array 3 SET A
import java.util.*;
public class array_3{
  static void  sum_ofelements(int[] arr) {  
    int sum=0;
        for(int i=0; i<5; i++)
        {
            sum= sum+arr[i];
        }
        System.out.println("The sum of all elements is:"+ sum);
  }

  static void  sum_alternate(int[] arr) {   
        int sum2 =0, sum3=0;

        for(int i=0; i<5; i++)
        {
            if(i%2==0)
            {
                sum2=sum2+arr[i];
            }
            else
            {
                sum3=sum3+arr[i];
            }
        }
        System.out.println("Sum of elements at even index: "+sum2);
        System.out.println("Sum of elements at odd index "+sum3);
  }
    static void  second_high(int[] arr) {  
    for (int i = (arr.length - 1); i >= 0; i--)
        {
        for (int j = 1; j<=i; j++)
        {
        if (arr[j-1] > arr[j])
        {
        int temp = arr[j-1];
        arr[j-1] = arr[j];
      arr[j] = temp;
        } 
        } 
}
System.out.println("Second highest element is: "+arr[3]);
  }

    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
        int[] arr =new int[5];
        System.out.println("Enter 5 elements in array");
        for(int i=0; i<5; i++)
        {
            arr[i]=sc.nextInt();
        }
    System.out.println("Enter your preferred choice");
        System.out.println("Sum of all elements, press 1");
    System.out.println("Sum of alternate elements, press 2");
    System.out.println("Second highest elements in the array, press 3");
    int choice = sc.nextInt();
    switch(choice)
    {
      case 1: 
      sum_ofelements(arr);
      break;
      case 2: 
      sum_alternate(arr);
      break;
      case 3:
      second_high(arr);
            break;
    }
  }
}