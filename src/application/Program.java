package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		product.name = input.nextLine();
		System.out.print("Price: $");
		product.price = input.nextDouble();
		System.out.print("Quantity in stock:");
		product.quantity = input.nextInt();
		
		System.out.println("\nProduct data:");
		System.out.print(product.name + ", $" + product.price + ", units: " + product.quantity + ", Total: $" + product.totalValueInStock());
		
		System.out.println();
		System.out.print("\nEnter the number of products to be added in stock: ");
		int addQuantity = input.nextInt();
		product.addProduct(addQuantity);
		
		System.out.println("Product data:");
		System.out.print(product.name + ", $" + product.price + ", units: " + product.quantity + ", Total: $" + product.totalValueInStock());
		
		System.out.println();
		System.out.print("\nEnter the number of products to be removed from stock: ");
		int removeQuantity = input.nextInt();
		product.removeProduct(removeQuantity);
		
		System.out.println("\nProduct data:");
		System.out.print(product.name + ", $" + product.price + ", units: " + product.quantity + ", Total: $" + product.totalValueInStock());
		
		input.close();
	}

}
