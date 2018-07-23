package chap13.sample13_4_1;

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

	public void tsume() {
		System.out.println("猫は爪でひっかきます");
	}

}
