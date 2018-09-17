package FactoryMethod;

public class Prius extends CarProduct {

	public Prius() {
		super();
		mModel = "プリウス";
	}

	@Override
	public void run(){
		System.out.println("ハイブリットカーの代名詞。低燃費で走ります。");
	}

}
