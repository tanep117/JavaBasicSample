package chap12.sample12_2_1;

public class Heal implements Attack {

	@Override
	public void exec() {
		System.out.println("癒しの効果でHPが100回復した");
	}

}
