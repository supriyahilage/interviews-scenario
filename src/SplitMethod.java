import java.util.Arrays;
public class SplitMethod {

	public static void main(String[] args) {
		String str = "I'm Indian citizen...I live in India  India has 27 states";
		
		String []res = str.split("");
		
		System.out.println(Arrays.toString(res)+",");
		
		for(int i=0;i < res.length;i++)
		{
			int count=1;
			for(int j=i+1;j<res.length;j++)
			{
				if(res[i].equals(res[j]))
				{
					count=0;
				}
			}
			if(count>=1)
			{
				System.out.println(res[i]+""+count);
				}
			}
		}
		
				
	 
	

}
