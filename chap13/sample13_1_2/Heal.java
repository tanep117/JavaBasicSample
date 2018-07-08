package chap13.sample13_1_2;

public class Heal implements Attack {

	@Override
	public void exec() {
		System.out.println("癒しの効果でHPが100回復した");
	}

}
