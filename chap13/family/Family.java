package chap13.family;

public abstract class Family {
	//フィールド
	private String kind;  //父、母、子
	private String name;  //名前

	//コンストラクタ
	public Family(String kind, String name) {
		this.kind = kind;
		this.name = name;
	}

	//メソッド
	public String getKind() {
		return kind;
	}

	public String getName() {
		return name;
	}

	public void greet() {
		System.out.println(kind + "さん（名前：" + name + "）は、おばさんに挨拶しました。");
	}
}
