package UtilityProjects;

public class ListProd {

	private String product;
	private Double price;
	
	public ListProd(String product, Double price) {
		this.product = product;
		this.price = price;
	}
	
	public void setProduct(String product) {
		this.product = product;
	}

	public String getProduct() {
		return product;
	}

	public Double getPrice() {
		return price;
	}

	public String toString() {
		return product + ": ------------------------ R$ " + String.format("%.2f", price);  
	}
	
}
