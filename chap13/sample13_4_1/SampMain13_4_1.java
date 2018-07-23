package chap13.sample13_4_1;

public class SampMain13_4_1 {

	/*
	 * ダウンキャストのサンプルプログラムです
	 */
	public static void main(String[] args) {

		//Doubutsu配列の作成
		Doubutsu[] doubutsu = new Doubutsu[2];

		//犬のインスタンス化
		doubutsu[0] = new Inu("ハチ公");

		//猫のインスタンス化
		doubutsu[1] = new Neko("チャトラン");

		for (int i = 0; i < doubutsu.length; i++) {
			//ポリモーフィズムでステータス表示
			doubutsu[i].showStatus();
			//ポリモーフィズムで鳴き声表示
			doubutsu[i].naku();
			System.out.println("************************");
		}

		//では、犬のしっぽを振らせてみましょう。
		//doubutsu[0].shippo();  //これだとエラーになってしまう。
		if(doubutsu[0] instanceof Inu) {
			Inu inu = (Inu)doubutsu[0];  //これがダウンキャスト
			inu.shippo();
		}


		//猫の爪でひっかいてみましょう。
		//doubustu[1].tsume();   //これだとエラーになってしまう。
		if(doubutsu[1] instanceof Neko) {
			Neko neko = (Neko)doubutsu[1];  //これがダウンキャスト
			neko.tsume();
		}

	}

}
