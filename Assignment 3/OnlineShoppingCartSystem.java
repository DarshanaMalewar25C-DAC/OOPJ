/*
28. Online Shopping Cart System 
Scenario: Build a simplified shopping cart system where users can add products, calculate total cost, and 
apply discounts. 
Problem Statement: 
● Class Product → instance variables: productId, name, price (Encapsulation: use private variables 
with getters/setters) 
● Abstract Class CartItem → method calculateTotalPrice() (Abstract Class: define generic 
behavior for cart items) 
● Class Cart extends CartItem → store list of products, implement calculateTotalPrice() 
● Interface Discountable → method applyDiscount(double percentage) (Interface: any item can 
have discounts applied) 
In main(), create a cart, add 3 products, apply 10% discount to one product, display total cost 
Sample Input: 
Product1 → name="Laptop", price=50000 
Product2 → name="Mouse", price=500 
Product3 → name="Keyboard", price=1200 
Sample Output: 
Applying 10% discount to Laptop 
Total Cart Price = 51800 
*/
import java.util.ArrayList;
import java.util.List;

interface Discountable {
	void applyDiscount(double percentage);
}	
abstract class CartItem {
	public abstract double calculateTotalPrice();
}

class Product implements Discountable {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
	}
	public int getProductId(){
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public double getPrice(){
		return price;
	}
	public void setPrice(double price){
		this.price=price;
	}
	
	@Override 
	public void applyDiscount(double percentage) {
        double discountAmount = (price * percentage) / 100;
        price -= discountAmount;
        System.out.println("Applying " + percentage + "% discount to " + name);
	}
}

class Cart extends CartItem{
	private Product product1;
	private Product product2;
	private Product product3;
	
	public void addProduct1(Product p) {
        product1 = p;
    }

    public void addProduct2(Product p) {
        product2 = p;
    }

    public void addProduct3(Product p) {
        product3 = p;
    }
	@Override
	public double calculateTotalPrice(){
		double total=0;
		if (product1 != null) total += product1.getPrice();
        if (product2 != null) total += product2.getPrice();
        if (product3 != null) total += product3.getPrice();
        return total;
	}
}	
	
	
class OnlineShoppingCartSystem {
	public static void main(String args[]){
		Product p1 = new Product(1, "Laptop", 50000);
        Product p2 = new Product(2, "Mouse", 500);
        Product p3 = new Product(3, "Keyboard", 1200);

		p1.applyDiscount(10); // Apply 10% discount to Laptop
		
		Cart c1 = new Cart();
		c1.addProduct1(p1);
		c1.addProduct2(p2);
		c1.addProduct3(p3);
		
		double total = c1.calculateTotalPrice();
        System.out.println("Total Cart Price = " + (double)total); 
	}
}
		
	
		




		