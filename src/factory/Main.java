package factory;

import factory.impl.ConcreteFactory;
import factory.impl.ConcreteProductA;
import factory.impl.ConcreteProductB;

public class Main {

	public static void main(String[] args){
		Factory factory = new ConcreteFactory();
		Product p1 = factory.createProduct(ConcreteProductA.class);
		Product p2 = factory.createProduct(ConcreteProductB.class);
		
		p1.msg();
		p2.msg();
	}
}
