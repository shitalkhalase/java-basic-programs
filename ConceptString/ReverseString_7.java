package ConceptString;

public class ReverseString_7 {

	public static void main(String[] args) {
		
		String s = "Maxgen"; //s.length()=6 but charAt=5 bcz
		String rev = "  " ;//charAt=5 bcz index startfrom 0
		
		for(int i= s.length()-1; i>=0; i--)
		{
			rev= rev + s.charAt(i);		
		}
		
		System.out.println(rev);
	}

}
