package FactoryMethod;

public class NSX extends CarProduct {
	public NSX(){
		super();
		mModel = "NSX";
	}

	@Override
	public void run() {
		System.out.println("ホンダの最強スポーツカー。最速でドリフトします。");
	}

}
