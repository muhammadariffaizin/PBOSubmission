package app.invoice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import app.invoice.Invoice;

public class InvoiceTest {
	static Scanner scan = new Scanner(System.in);
	
	public static void printMenus() {
		System.out.println("Choose an action :");
		System.out.println("(1) Create new Invoice");
		System.out.println("(2) Print all invoices");
	}
	
	public static void createNewInvoice(List<Invoice> invoices) {
		Invoice newInvoice = new Invoice(null, null, 0, 0);
		System.out.println("Insert number");
		newInvoice.setNumber(scan.next());
		scan.nextLine();
		System.out.println("Insert description");
		newInvoice.setDescription(scan.nextLine());
		System.out.println("Insert quantity");
		newInvoice.setQuantity(scan.nextInt());
		System.out.println("Insert price");
		newInvoice.setPrice(scan.nextDouble());
		System.out.println("Invoice has been created!");
		
		invoices.add(newInvoice);
	}
	
	public static void printAllInvoices(List<Invoice> invoices) {
		System.out.println("List of all invoices ----------------------");
		for (int i = 0; i < invoices.size(); i++) {
			System.out.println("[Invoice " + (i+1) + "]");
			System.out.println("Number : " + invoices.get(i).getNumber());
			System.out.println("Description : " + invoices.get(i).getDescription());
			System.out.println("Quantity : " + invoices.get(i).getQuantity());
			System.out.println("Price : " + invoices.get(i).getPrice());
			System.out.println("Total Price : " + invoices.get(i).getTotalPrice());
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		List<Invoice> invoices = new ArrayList<Invoice>();
		
		while(true) {
			printMenus();
			int choose = scan.nextInt();
			switch(choose) {
				case 1:
					createNewInvoice(invoices);
					break;
				case 2:
					printAllInvoices(invoices);
					break;
			}
		}
	}
}
