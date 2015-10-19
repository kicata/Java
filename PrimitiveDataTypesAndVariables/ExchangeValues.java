import java.io.BufferedReader;
import java.io.InputStreamReader;


public class ExchangeValues {

	public static void main(String[] args) {
		int firstVal=Integer.parseInt(getInput("Enter int value = "));
		int secondVal=Integer.parseInt(getInput("Enter int value = "));
		swapTwoValues(firstVal, secondVal);

	}
	public static void swapTwoValues(int firstValue, int secondValue) {
		int swapCont;
		swapCont=firstValue;
		firstValue=secondValue;
		secondValue=swapCont;
		
		System.out.println("First value -> "+firstValue);
		System.out.println("Second value -> "+secondValue);
	}
	public static String getInput(String messageToUser){
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(messageToUser);
		System.out.flush();
		try {
			return bf.readLine();
		} catch (Exception e) {
			return "Error : "+ e.getMessage();
		}
	}
	

}
