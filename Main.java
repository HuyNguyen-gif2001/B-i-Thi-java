package test.BKD02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        while(true) {
        	System.out.println("Quản Lý Khách Hàng");
        	System.out.println("Enter 1: Nhập sản phẩm");
        	System.out.println("Enter 2: Tính chiết khẩu của sản phẩm");
        	System.out.println("Enter 3: In ra danh sách sản phẩm");
        	System.out.println("Enter 4: In ra danh sách sản phẩm đã sắp xếp");
        	System.out.println("Enter 5: Thoát");
        	String line = scanner.nextLine();
        	
        	switch(line) {
        	      case "1": {
        	    	  System.out.println("Enter ID Product:");
        	    	  String idProduct = scanner.nextLine();
        	    	  System.out.println("Enter Name Product:");
        	    	  String nameProduct = scanner.nextLine();
        	    	  System.out.println("Enter Price:");
        	    	  float price = scanner.nextFloat();
        	    	  System.out.println("Enter Tax:");
        	    	  float tax = scanner.nextFloat();
        	    	  
        	    	  Product product = new Product(idProduct,nameProduct,price,tax);
        	    	  productManager.addProduct(product);
        	    	  scanner.nextLine();
        	    	  
        	    	  break;
        
        	      }
        	      case "2":{
        	    	  System.out.println("Enter ID Product");
   				      String idProduct = scanner.nextLine();
   				      System.out.println("Price Real: " + productManager.getRealPrice(idProduct) + "$");
   			          break;
        	    	  
        	      }
        	      case "3":{
        	    	  productManager.printDetails();
        	    	  break;
        	      }
        	      case "4":{
        	    	  productManager.showInfor();
        	    	  break;
        	      }
        	      
        	      case "5":{
        	    	  return;
        	      }
        	      default:
        	    	  System.out.println("Invalid");
        	    	  continue;
        	}
        }

	}

}
