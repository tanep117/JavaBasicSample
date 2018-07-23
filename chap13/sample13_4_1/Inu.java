package chap13.sample13_4_1;

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

	public void shippo() {
		System.out.println("犬はしっぽを振ります");
	}
}
