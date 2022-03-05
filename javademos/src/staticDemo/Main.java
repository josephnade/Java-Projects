package staticDemo;

import staticDemo.ProductValidator.SomethingElse;

public class Main {
	public static void main(String[] args) {
		ProductManager manager = new ProductManager();
		SomethingElse.delete();
		Product product = new Product(1, "Mouse", 250);
		manager.add(product);
		//Static fonksiyonlar �al��t���nda constructorlar �al��maz fakat �al��t�rmak istiyorsak static diye tekrar bi constructor kurmak gerekir.
		//inner classlar genelde bir class � b�l�mlere ay�rmak i�in kullan�l�r!
		DatabaseHelper.Connection.createConnection();
		DatabaseHelper.Crud.create();
		DatabaseHelper.Connection.closeConnection();
	}

}
