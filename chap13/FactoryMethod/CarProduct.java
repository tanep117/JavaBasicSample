package FactoryMethod;

public abstract class CarProduct {
	protected String mModel;
	private String mColor;

	public CarProduct(){
	}

	/*
	 * ファクトリーから呼ばれる部分
	 * 全車種共通の処理
	 */
	public void paintColor(String color){
		mColor = color;
		System.out.println("ボディーの色は"+mColor+"です。");
	}

	public void assemble(){
		System.out.println(mModel+"を組み立てます。");
	}

	/*
	 * メインから呼ばれる部分
	 */
	//全車種共通の処理
	public void showModel(){
		System.out.println("車種は"+mModel+"です。");
	}

	//車種により動作の異なる部分
	public abstract void run();

}
