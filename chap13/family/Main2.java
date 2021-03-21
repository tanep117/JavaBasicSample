package chap13.family;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Father father = new Father("マスオ");
		Mother mother = new Mother("サザエ");
		Child child = new Child("タラ");

		int input = 0;
		while(input != -1) {
			System.out.println("************************");
			System.out.println("隣のおばさんが出現した！");
			System.out.println("0:マスオ");
			System.out.println("1:サザエ");
			System.out.println("2:タラ");
			System.out.println(">");
			input = sc.nextInt();
			switch (input) {
			case 0:
				father.greet();
				break;
			case 1:
				mother.greet();
				break;
			case 2:
				child.greet();
				break;
			}
		}
	}

}
