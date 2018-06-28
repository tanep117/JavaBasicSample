package chap11.sample11_1;

public class Inu extends Doubutsu {

	//コンストラクタの定義
	public Inu(String name){
		//親クラスのコンストラクタを呼ぶ
		super("犬", name);
	}

	//関数のオーバーライド
	@Override
	public void naku() {
		super.naku();
		System.out.println("ワンワンと鳴きます！");
	}
}
