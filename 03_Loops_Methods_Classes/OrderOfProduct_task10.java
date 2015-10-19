import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class OrderOfProduct_task10 {

	public static void main(String[] args) {
		ArrayList<Product> products = new ArrayList<>();
		try (Scanner input = new Scanner(
				new FileReader("InputProductOrder.txt"))) {
			while (input.hasNextLine()) {
				products.add(new Product(input.next(), input.nextDouble()));
			}
			double result = 0;
			try (Scanner inputOrder = new Scanner(new FileReader("Order.txt"))) {
				while (inputOrder.hasNextLine()) {
					double productQuantity = inputOrder.nextDouble();
					String productName = inputOrder.next();
					for (Product product : products) {
						if (product.getName().equals(productName)) {
							result += productQuantity * product.getPrice();
						}
					}
				}
			}
			try (BufferedWriter writer = new BufferedWriter(new FileWriter(
					"OutputOrder.txt"))) {
				writer.write(Double.toString(result));
				System.out.println("done check project directory");
			}
		} catch (IOException e) {
			System.err.println("Error reading input file ");
		}

	}

}
