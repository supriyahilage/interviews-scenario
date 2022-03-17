import java.util.Arrays;

public class AnagramDemo {

	public static void main(String[] args) {
		
		String s1 = "abcd";
		String s2 = "dcba";
		
		char a[]=s1.toCharArray();
		char b[]=s2.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		boolean result = Arrays.equals(a, b);
		
		if(result==true)
		{
			System.out.println("Strings are anagram ");
		}
		else
		{
			System.out.println("Strings are not anagram");
		}
		
	} 
	
}
