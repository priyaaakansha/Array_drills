import java.util.*;;
public class array_5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows :");
		int rows=sc.nextInt();
	
  	System.out.println("Enter the no of columns:");
		int col=sc.nextInt();
		
    int[][] arr = new int[rows][col];
		
    System.out.println("Enter the elements of array");
		for(int i=0; i<rows;i++)
        {            
          for(int j=0; j<col;j++)
          {
            arr[i][j]=sc.nextInt();
            if(arr[i][j]>=0 && arr[i][j]<99 ) // max two digit element
            {
              continue;
            }

            else
              {
            	System.out.println("Invalid number, enter less than 100");
            	arr[i][j]=sc.nextInt();
              }
          }
        }
		System.out.print("\n Data you entered : \n");
		for(int i=0; i<rows;i++)
        {            
          for(int j=0; j<col;j++)
          {
            System.out.print(arr[i][j]+" ");

          }
          System.out.println();
        }
		System.out.println("After multiplying odd no. by 2:");
		for(int i=0; i<rows;i++)
        {            
          for(int j=0; j<col;j++)
        {
              if(arr[i][j]%2!=0)
              {
              arr[i][j] = arr[i][j]*2;
          }
              System.out.print(arr[i][j]+" ");
          }
          System.out.println();
    }
	}

}
