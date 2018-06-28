package chap11.sample11_1;

public class SampMain11_1_2 {

	/*
	 * 継承のサンプルプログラムです
	 */
	public static void main(String[] args) {

		/*
		 * ポリモーフィズムを使ってみる
		 */
		System.out.println("************************");

		Doubutsu[] doubutsu = new Doubutsu[4];
		doubutsu[0] = new Inu("ポチ");
		doubutsu[1] = new Neko("ミケ");
		doubutsu[2] = new Inu("セバスチャン");
		doubutsu[3] = new Saru("モンチッチ");

		for(int i=0; i<doubutsu.length; i++) {
			doubutsu[i].showStatus();
			doubutsu[i].naku();
			System.out.println("---------------------------");
		}

	}

}
