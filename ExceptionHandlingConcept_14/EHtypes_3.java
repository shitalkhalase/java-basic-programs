package ExceptionHandlingConcept_14;

public class EHtypes_3 {

	int a;
	public static void main(String[] args) {
		
//RUN time Exception:
		
		                   //1.Arithmetic Exception:
		/*int a=50/0;
		System.out.println(a);*/
		
		                   //2.NullPointer Exception:
        /* EHtypes_3 obj=new EHtypes_3();
		obj=null;
		//System.out.println(obj.a);*/
		
		                   //3.NumberFormat Exception:
		String s="abc";
		int i = Integer.parseInt(s);
		
		                   //4.ArrayIndexOutOfBounds Exception:
		//int a[]= new int[2];
		//System.out.println(a[3]);
	}

}
