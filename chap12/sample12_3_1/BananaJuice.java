package chap12.sample12_3_1;

public class BananaJuice extends MixJuice {

	public BananaJuice() {
		toudo = 100;
	}

	@Override
	public void drink() {
		System.out.println("おいしいバナナジュースを飲みましょう。");

	}

	@Override
	public int getToudo() {
		return toudo;
	}

}
