package factory.impl;

import factory.Product;

public class ConcreteProductA extends Product{

	@Override
	public void msg() {
		// TODO Auto-generated method stub
		System.out.println("我是"+this.getClass().getSimpleName()+"的一员");
	}

}
