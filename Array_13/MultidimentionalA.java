package Array_13;

public class MultidimentionalA {

	public static void main(String[] args) {
		
		try {
		int arr[][]=new int [2][3];//memory allocation will be done
		// 1st row:
		arr[0][0]=10;// initialization
		arr[0][1]=20;
		arr[0][2]=30;
		
		
		// 2st row:
		arr[1][0]=40;// initialization
		arr[1][1]=50;
		arr[1][2]=60;
		
		System.out.println(arr.length);//to find d no of rows
		System.out.println(arr[0].length);//to find no of columns
		System.out.println(arr[0][1]);//accessing elements of array
		
		
		System.out.println("For Loop start.............");
		
		for(int row=0; row<arr.length; row++)//for row
		{
			for (int col=0; col<arr[row].length; col++)//for column
			{
				System.out.println(arr[row][col]);
				
				//System.out.println(arr[2][3]);
			}
			
			System.out.println(".............");
		}
	
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
}
