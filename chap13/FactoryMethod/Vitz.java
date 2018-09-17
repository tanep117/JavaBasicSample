package FactoryMethod;

public class Vitz extends CarProduct {

	public Vitz(){
		super();
		mModel = "ビッツ";
	}

	@Override
	public void run(){
		System.out.println("低燃費でゆっくり走ります。");
	}

}
