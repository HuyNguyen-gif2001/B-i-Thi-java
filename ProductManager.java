package test.BKD02;

import java.util.*;

public class ProductManager {
   List<Product> product;

public ProductManager() {
	this.product = new ArrayList<>();
}

public void addProduct(Product product) {
	 this.product.add(product);
}   

public void printDetails() {
	 this.product.forEach(product -> System.out.println(product.toString()));
}

public float getRealPrice(String idProduct) {
	Product product = this.product.stream().
            filter(pro -> pro.getIdProduct().equals(idProduct)).findFirst().orElse(null);
	 if (product == null) {
		 return 0;
	 }
	return (product.getPrice()-((product.getPrice()*product.getTax()/100)));
}

public void showInfor() {
	
	System.out.println("Sau khi sắp xếp");
	
	Collections.sort(product,new Comparator<Product>() {

		@Override
		public int compare(Product o1, Product o2) {
		   if(o1.getPrice() < o2.getPrice()) {
			   return 1;
		   } else if (o1.getPrice() > o2.getPrice()) {
			   return -1;
		   } else {
			   return 0;
		   }
		}
		
	});
	
	this.product.forEach(product -> System.out.println(product.toString()));
}

}
