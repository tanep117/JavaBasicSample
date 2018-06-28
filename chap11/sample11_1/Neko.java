package chap11.sample11_1;

public class Neko extends Doubutsu {

	//猫のコンストラクタ
	public Neko(String name) {
		//親のコンストラクタを呼ぶ
		super("猫", name);
	}

	//関数のオーバーライド
	@Override
	public void naku() {
		super.naku();
		System.out.println("ニャーニャーと鳴きます！");
	}

}
