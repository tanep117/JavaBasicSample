package chap13.family;

public class Child extends Family {
	public Child(String name) {
		super("子ども", name);
	}

	@Override
	public void greet() {
		super.greet();
		System.out.println("おばちゃんこんちわ。ポケモンやってる？");
	}

}
