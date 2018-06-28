package chap12.sample12_2_1;

public class SwordAttack implements Attack {

	@Override
	public void exec() {
		System.out.println("刀で切りつけた。相手に30のダメージを与えた。");
	}

}
