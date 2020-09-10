public class Invoice {
	private String number;
	private String description;
	private int quantity;
	private double price;
	
	public Invoice(String number, String description, int quantity, double price) {
		setNumber(number);
		setDescription(description);
		setQuantity(quantity);
		setPrice(price);
	}
	
	public String getNumber() {
		return number;
	}
	
	public String getDescription() {
		return description;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setQuantity(int quantity) {
		if (quantity > 0) {
			this.quantity = quantity;
		} else {
			this.quantity = 0;
		}
	}
	
	public void setPrice(double price) {
		if (price > 0) {
			this.price = price;
		} else { 
			this.price = 0;
		}
	}
	
	public double getInvoiceAmount() {
		return price * quantity;
	}
}
		