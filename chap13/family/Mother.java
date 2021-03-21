package chap13.family;

public class Mother extends Family{
	//コンストラクタ
	public Mother(String name) {
		super("お母さん", name);
	}

	//メソッド
	@Override
	public void greet() {
		super.greet();
		System.out.println("こんにちは。今日は大根の特売日よ！");
	}


}
