import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Sample 
{
	//method to get a substring
	public String getResult(String input1,String input2)
	{
	   //indicating if input2 length is not equal to one or not a Alphabet
		if((input2.length()!=1)||(!Character.isAlphabetic(input2.charAt(0))))
		 {
		    return "Input2 is invalid";	
		 }
		else
		{
			 //finding the position of input2 in input1
			 int index = input1.indexOf(input2);
			 if(index!=-1)
			 {
				 //returning result
				 return input1.substring(index+1, input1.length());
			 }
			 else
			 {
				 //if the input2 is not exist in input1
				 return "This letter does not exist in sentence";
			 }
		}
		 
	}
	
	public static void main(String args[]) throws Exception
	{
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		String input1 = reader.readLine();
		String input2 = reader.readLine();
		
		Sample sample = new Sample();
		String result = sample.getResult(input1, input2);
		System.out.println(result);
		
		reader.close();
	}
}
