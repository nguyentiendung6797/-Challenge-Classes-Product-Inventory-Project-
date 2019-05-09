package packageProduct;

public class InventoryDemo {
	public static void main(String[] args) {
		Product p1 = new Product(1, 3000.0f, 12);
		Product p2 = new Product(2, 2000.0f, 5);
		Product p3 = new Product(3, 8000.0f, 7);
		Product p4 = new Product(4, 4000.0f, 15);
		Product p5 = new Product(4, 4000.0f, 5);
		Product p6 = new Product(4, 5000.0f, 15);
		
		Inventory in = new Inventory();
		in.addProduct(p1);
		in.addProduct(p2);
		in.addProduct(p3);
		in.addProduct(p4);
		in.addProduct(p5);
		in.addProduct(p6);
		
		in.increaseQuantity(2, 3);
		in.decreaseQuantity(3, 10);
		
		in.inventoryValue();
		
		in.show();
	}
	
}
