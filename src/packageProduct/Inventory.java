package packageProduct;

import java.util.ArrayList;

public class Inventory {

	ArrayList<Product> listProduct;

	public boolean addProduct(Product objProduct) {
		if (listProduct == null) {
			listProduct.add(objProduct);
			return true;
		} else {
			for (Product product : listProduct) {
				if (product.getId() != objProduct.getId()) {
					listProduct.add(objProduct);
					return true;
				} else {
					if (product.getPrice() == objProduct.getPrice()) {
						Product oldProduct = listProduct.get(objProduct.getId());
						oldProduct.setQuantity(oldProduct.getQuantity() + objProduct.getQuantity());
						return true;
					} else {
						return false;
					}
				}
			}
		}
		return false;
	}

	public void removeProduct(int id) {
		listProduct.remove(id);
	}

	public void increaseQuantity(int id, int quantity) {
		Product objProduct = listProduct.get(id);
		objProduct.setQuantity(objProduct.getQuantity() + quantity);
	}

	public void decreaseQuantity(int id, int quantity) {
		Product objProduct = listProduct.get(id);
		if (objProduct.getQuantity() <= quantity) {
			listProduct.remove(id);
		} else {
			objProduct.setQuantity(objProduct.getQuantity() - quantity);
		}
	}

	public Float inventoryValue() {
		Float inventoryValue = 0f;
		for (Product product : listProduct) {
			inventoryValue += product.getPrice() * product.getQuantity();
		}
		return inventoryValue;
	}

	public void show() {
		for (Product product : listProduct) {
			System.out.println("Id: " + product.getId() + "\tPrice: " + product.getPrice() + "\tQuantity: "
					+ product.getQuantity());
		}
	}

}
