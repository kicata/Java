import java.io.BufferedReader;
import java.io.InputStreamReader;


public class SquareRootOfNumber {

	public static void main(String[] args) {
		
		String s = getInput("Enter a positive number ");
		int number=Integer.parseInt(s);
		double sqrtOfNum=Math.sqrt(number);
		System.out.println("the sqrt of number "+ number + " is " + sqrtOfNum);

	}

	public static String getInput(String prompt){
		   
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print(prompt);
		System.out.flush();
		try{
			return stdin.readLine();
		}catch(Exception e){
			return "Error: "+e.getMessage();
		}
	}
}
