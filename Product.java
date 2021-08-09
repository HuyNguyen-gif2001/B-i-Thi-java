package test.BKD02;

public class Product {
	  protected String idProduct;
	  protected String nameProduct;
	  protected float price;
	  protected float tax;
	  protected float realPrice;
	  
	  
	  
	public Product(String idProduct, String nameProduct, float price, float tax) {
		super();
		this.idProduct = idProduct;
		this.nameProduct = nameProduct;
		this.price = price;
		this.tax = tax;
		
	}
	
	public String getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(String idProduct) {
		this.idProduct = idProduct;
	}
	public String getNameProduct() {
		return nameProduct;
	}
	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getTax() {
		return tax;
	}
	public void setTax(float tax) {
		this.tax = tax;
	}
    

	public float getRealPrice() {
		return realPrice = getPrice()-((getPrice()*getTax()/100));
	}

	public void setRealPrice(float realPrice) {
		this.realPrice = realPrice;
	}

	@Override
	public String toString() {
		return "Product [ID Product =" + idProduct + ", Name Product=" + nameProduct + ", Price=" + price + ", Tax=" + tax +"%"
				+"]";
	}
}
	  

