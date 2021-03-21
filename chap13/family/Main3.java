package chap13.family;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Family[] family = {
				new Father("マスオ"),
				new Mother("サザエ"),
				new Child("タラ")
		};

		int input = 0;
		while (input != -1) {
			System.out.println("************************");
			System.out.println("隣のおばさんが出現した！");
			for (int i = 0; i < family.length; i++) {
				System.out.println(i + ":" + family[i].getName());
			}
			System.out.println(">");
			input = sc.nextInt();
			if(input<0 || input >=family.length) {
				break;
			}
			family[input].greet();  //ここがポリモーフィズム
		}
	}
}
