package Constructor_6;

public class CallByValue {

	public static void main(String[] args) {
		
		int x=3;
		System.out.println("value of x before calling increment function is:"  +x);
		increment(x);// call by value or pass by value
		System.out.println("value of x after calling increment function is:"  +x);
	

	}

	private static void increment(int n) {
		System.out.println("value of n before increment is:"  +n);
		n=n+1;//4
		System.out.println("value of n after increment is:"  +n);
	}

}
