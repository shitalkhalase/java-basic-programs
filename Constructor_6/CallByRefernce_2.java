package Constructor_6;

public class CallByRefernce_2 {
	int p;
	int q;

	public static void main(String[] args) {
		
		CallByRefernce_2 obj = new CallByRefernce_2();
		 obj.p=10;
		 obj.q=20;
		 obj.swap(obj);
		 System.out.println(obj.p);
		 System.out.println(obj.q);
		 
		 

	}
	public void swap(CallByRefernce_2 t) {
		int temp;
		temp=t.p;
		t.p=t.q;
		t.q=temp;
		
	}
	

}
