package factory.impl;

import factory.Factory;
import factory.Product;

public class ConcreteFactory extends Factory{

	@Override
	public <T extends Product> T createProduct(Class<T> clazz) {
		// TODO Auto-generated method stub
		Product product = null;
		try {
			product = (Product) Class.forName(clazz.getName()).newInstance();
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return (T) product;
	}

	

}
