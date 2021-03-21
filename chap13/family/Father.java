package chap13.family;

public class Father extends Family {
	//コンストラクタ
	public Father(String name) {
		super("お父さん", name);
	}

	@Override
	public void greet() {
		super.greet();
		System.out.println("おはようございます。いい天気ですね。");
	}


}
