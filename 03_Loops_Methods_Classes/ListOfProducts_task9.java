import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class ListOfProducts_task9 {

	public static void main(String[] args) {
		try (BufferedReader fileReader = new BufferedReader(new FileReader(
				"InputProduct.txt"));) {
			ArrayList<Product> products = new ArrayList<Product>();
			while (true) {
				String line = fileReader.readLine();
				if (line == null) {
					break;
				} else {
					String[] lineStr = line.split(" ");
					Product curnProduct = new Product(lineStr[0],
							Double.parseDouble(lineStr[1]));
					products.add(curnProduct);
				}
			}

			Collections.sort(products);

			try (BufferedWriter writer = new BufferedWriter(new FileWriter(
					"Output.txt"))) {
				for (Product product : products) {
					String currentLine = product.getPrice() + " "
							+ product.getName();
					writer.write(currentLine);
					writer.newLine();

				}
				System.out.println("Done check directory");
			} catch (IOException ioex) {
				System.err.println("Error in writing file");
			}

		} catch (IOException ioex) {
			System.err.println("Error");
		}
	}

}
