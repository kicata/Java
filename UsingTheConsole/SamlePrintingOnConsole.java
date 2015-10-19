public class SamlePrintingOnConsole {

	public static void main(String[] args) {
		// Menu print
		double beerPrice = 1.20;
		String beerName = "Stela";
		double fantaPrice = 2.20;
		String fanta = "fanta";
		double rakiaPrice = 4.50;
		String rakiaBrand = "Muskatova";
		System.out.println("Menu: ");
		System.out.printf("1. %s - %.2f%n", beerName, beerPrice);
		System.out.printf("2. %s - %.2f%n", fanta, fantaPrice);
		System.out.printf("3. %s - %.2f%n", rakiaBrand, rakiaPrice);

	}

}
