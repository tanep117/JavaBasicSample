package chap13.sample13_1_2;

import java.util.Scanner;

public class SampleMain13_1_3 {
	/*
	 * ポリモーフィズムを使わないで書いてみる
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//戦士と魔法使いのインスタンス化
		Fighter fighter = new Fighter();
		Wizard wizard = new Wizard();

		//攻撃技のインスタンス化
		SwordAttack swordAttack = new SwordAttack();
		Poison poison = new Poison();
		FireBall fireBall = new FireBall();
		Heal heal = new Heal();

		//プレーヤーを選択する。
		int pNum = inputPlayer(sc);

		//攻撃技を選択する。
		int aNum = inputAttack(sc);


		//攻撃をする
		System.out.println("-----------------");
		if(pNum==1) {
			//戦士の攻撃
			switch (aNum) {
			case 1:
				fighter.setAttack(swordAttack);
				fighter.Attack();
				break;
			case 2:
				fighter.setAttack(poison);
				fighter.Attack();
				break;
			case 3:
				fighter.setAttack(fireBall);
				fighter.Attack();
				break;
			case 4:
				fighter.setAttack(heal);
				fighter.Attack();
				break;
			}
		} else {
			//魔法使いの攻撃
			switch (aNum) {
			case 1:
				wizard.setAttack(swordAttack);
				wizard.Attack();
				break;
			case 2:
				wizard.setAttack(poison);
				wizard.Attack();
				break;
			case 3:
				wizard.setAttack(fireBall);
				wizard.Attack();
				break;
			case 4:
				wizard.setAttack(heal);
				wizard.Attack();
				break;
			}
		}

		sc.close();
	}

	public static int inputPlayer(Scanner sc) {
		System.out.println("攻撃するプレーヤーを選択してください。");
		System.out.print("1:戦士  2:魔法使い > ");
		String stInNum = sc.nextLine();
		try {
			int num = Integer.parseInt(stInNum);
			if(num==1 || num==2) {
				return num;
			}
			return inputPlayer(sc);
		} catch (NumberFormatException e) {
			System.out.println("数値を入力して下さい。");
			return inputPlayer(sc);
		}
	}

	public static int inputAttack(Scanner sc) {
		System.out.println("攻撃技を選択してください。");
		System.out.print("1:刀攻撃  2:毒  3:ファイヤーボール  4:回復 > ");
		String stInNum = sc.nextLine();
		try {
			int num = Integer.parseInt(stInNum);
			if(num>=1 && num<=4) {
				return num;
			}
			return inputAttack(sc);
		} catch (NumberFormatException e) {
			System.out.println("数値を入力して下さい。");
			return inputAttack(sc);
		}
	}
}
