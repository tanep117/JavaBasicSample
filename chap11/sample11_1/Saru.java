package chap11.sample11_1;

public class Saru extends Doubutsu {
	//コンストラクタの定義
	public Saru(String name){
		//親クラスのコンストラクタを呼ぶ
		super("サル", name);
	}

	//関数のオーバーライド
	@Override
	public void naku() {
		super.naku();
		System.out.println("ウッキーと鳴きます！");
	}

}
