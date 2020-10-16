package app.invoice;

public class Invoice {
	private String number;
	private String description;
	private int quantity;
	private double price;
	
	public Invoice(String modelNumber, String modelDescription, int modelQuantity, double modelPrice) {
		this.setNumber(modelNumber);
		this.setDescription(modelDescription);
		this.setQuantity(modelQuantity);
		this.setPrice(modelPrice);
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		if(quantity < 0) {
			this.quantity = 0;
		} else {
			this.quantity = quantity;			
		}
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(price < 0) {
			this.price = 0;
		} else {
			this.price = price;			
		}
	}
	
	public double getTotalPrice() {
		return getQuantity() * getPrice();
	}
}
