package ConceptString;

public class StringPalindrom_8 {

	public static void main(String[] args) {
		

		String s = "madam";
		String rev = "" ;
		
		for(int i= s.length()-1; i>=0; i--)
		{
			rev=rev+ s.charAt(i);		
		}
		System.out.println(rev);
		if (s.equals(rev))
		{
			System.out.println(" Palindrom String");

		}
		else
		{
			System.out.println("not Palindrom String");
		}
		
	}

}
