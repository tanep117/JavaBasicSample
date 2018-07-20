package chap12.sample12_2_2;

public class SampleMain12_2_3 {

	public static void main(String[] args) {
		
		int key1 = 1;
		switch (key1) {
		case 1:
			AirPlane airPlane = new AirPlane();
			airPlane.fly();
			break;
		case 2:
			Helicopter helicopter = new Helicopter();
			helicopter.fly();
			break;
		case 3:
			Bird bird = new Bird();
			bird.fly();
			break;
		}
		
		
		/*
		 * ポリモーフィズムを使った例
		 */
		System.out.println("ポリモーフィズムを使った結果表示");

		int key2 = 1;
		SorawoTobu tobu;   //空を飛ぶインターフェース型の変数を用意
		switch (key2) {
		case 1:
			//AirP;aneは空を飛ぶinterfaceを実装しているのでtobuに代入できる
			tobu = new AirPlane();  
			break;
		case 2:
			tobu = new Helicopter();
			break;
		case 3:
			tobu = new Bird();
			break;
		default:
			tobu = null;
		}
		
		//実際にやりたい主処理は以下の１行になった
		tobu.fly();
	}

}
