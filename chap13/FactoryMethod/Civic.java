package FactoryMethod;

public class Civic extends CarProduct {
	public Civic(){
		super();
		mModel = "シビック";
	}

	@Override
	public void run(){
		System.out.println("V-TECHエンジン搭載。エンジン音が魅力です。");
	}

}
