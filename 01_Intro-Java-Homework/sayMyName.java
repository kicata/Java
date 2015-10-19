import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class sayMyName {

	public static void main(String[] args) {
		
		System.out.println("Enter your first name here : ");
		 
		try{
		    BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
		    String firstName = bufferRead.readLine();
		    
		    System.out.println("Enter your family name here: ");
		    String familyName = bufferRead.readLine();
		    
		    System.out.printf("Your full name is " + firstName + " " +familyName);
		    System.out.println("");
		    
		    System.out.println("Enter your age here: ");
		    
		    int currentAge= Integer.parseInt(bufferRead.readLine());
		   
		    currentAge +=10;
		    System.out.println("Your age after 10 years will be "+currentAge);
		    
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}
