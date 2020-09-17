package chap12.sample12_3_1;

public class Aojiru extends MixJuice {

	public Aojiru() {
		toudo = 0;
	}

	@Override
	public void drink() {
		System.out.println("苦い青汁を飲みましょう。");

	}

	@Override
	public int getToudo() {
		return toudo;
	}

}
