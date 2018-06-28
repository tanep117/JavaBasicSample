package chap11.sample11_1;

public class SampMain11_1_1 {

	/*
	 * 継承のサンプルプログラムです
	 */
	public static void main(String[] args) {

		//犬のインスタンス化
		Inu inu = new Inu("ハチ公");
		//犬のステータス表示
		inu.showStatus();
		//鳴き声表示
		inu.naku();


		System.out.println("************************");

		//猫のインスタンス化
		Neko neko = new Neko("チャトラン");
		//猫のステータス表示
		neko.showStatus();
		//鳴き声表示
		neko.naku();

		System.out.println("************************");

		//saruのインスタンス化
		Saru saru = new Saru("モンチッチ");
		//サルのステータス表示
		saru.showStatus();
		//鳴き声表示
		saru.naku();

	}

}
