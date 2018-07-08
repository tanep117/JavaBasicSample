package chap13.sample13_1_2;

public class SwordAttack implements Attack {

	@Override
	public void exec() {
		System.out.println("刀で切りつけた。相手に30のダメージを与えた。");
	}

}
