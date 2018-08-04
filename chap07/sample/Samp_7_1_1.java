package chap07.sample;

public class Samp_7_1_1 {

	public static void main(String[] args) {

		//カレーと肉まんを現実のモノとして実体化させます。
		//（インスタンス化）
		Syokuhin curry = new Curry();
		Syokuhin nikuman = new Nikuman();
		Syokuhin bento = new Bento();


		//電子レンジを現実のモノとして実体化させます。
		//（インスタンス化）
		Denshirenji denshirenji = new Denshirenji();

		//調理前の食品の温度を測ります。
		System.out.println(curry);
		System.out.println(nikuman);
		System.out.println(bento);

		//ここから調理をはじめます。
		//電子レンジに食品を入れます
		denshirenji.setSyokuhin(bento);
		//電子レンジを実行します
		denshirenji.execution();

		//温めた後の温度を測ります。
		System.out.println(curry);
		System.out.println(nikuman);
		System.out.println(bento);

	}

}
