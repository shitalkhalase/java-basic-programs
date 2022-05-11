package operator_2_topic;

public class Logical_op {

	public static void main(String[] args) {
		//1] Logical AND :&&
		
		
		int a=10;
		int b=10;
		if(a>4 && b<4)
		{
			System.out.println("Hello world");
		}
		else 
		{
			System.out.println("Hello java");
		}
//T && T = T
//T && F = F
//F && T = F
//F && F = F


		
		//2] Logical OR:||
		
		
		int c=10;
		int d=10;
		if(c>5 || d<5)
			{
				System.out.println("Hello world");
			}
		else 
			{
				System.out.println("Hello java");
			}
//T && T = T
//T && F = T
//F && T = T
//F && F = F
		
		
		
		// 3]Logical NOT:!
		
		
			boolean m=true;
			if(!m)
					{
						System.out.println("Hello world");
					}
				else 
					{
						System.out.println("Hello java");
					}
	}
//it will give reverse value or opposite value. m=true !m=false
}
