package entities;



public class Product {
	
	private String name;
	private double price;
	private int quantity;

	public void setName(String name) {

		this.name = name;
	}


	

	public String getName() {
		return name;
	}



	public double getPrice() {
		return price;
	}



	public int getQuantity() {
		return quantity;
	}


	public void setPrice(double price) {

		this.price = price;
	}
	 
	public void setQuantity(int quantity) {

		this.quantity = quantity;
	}

	public double total() {

		return price * quantity;

	}

	public void add(int quantity) {

		this.quantity += quantity;

	}

	public void remove(int quantity) {

		this.quantity -= quantity;

	}

	public String tostring() {
		return name + ", R$ " + String.format("%.2f", price) + ", " + quantity + " unidades, Total R$ "
				+ String.format("%.2f", total());
	}

}
