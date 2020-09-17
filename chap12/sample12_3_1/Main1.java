package chap12.sample12_3_1;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("1:薬 2:水 3:バナナジュース 4:青汁＞");
		int in = sc.nextInt();

		Nomimono nomimono = null;

		switch(in) {
		case 1:
			nomimono = new Medicine();
			break;
		case 2:
			nomimono = new Water();
			break;
		case 3:
			nomimono = new BananaJuice();
			break;
		case 4:
			nomimono = new Aojiru();
			break;
		default:
			nomimono = new Water();
		}

		nomimono.drink();
		if(nomimono instanceof MixJuice) {
			MixJuice mj = (MixJuice) nomimono;
			System.out.println("糖度は"+ mj.getToudo() + "％です。");
		}

	}

}
