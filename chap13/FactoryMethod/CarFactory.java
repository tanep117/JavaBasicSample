package FactoryMethod;

public abstract class CarFactory {

	/*
	 * メイン処理からコールされるファクトリーの部分
	 */
	public CarProduct create(String model,String color) {
		CarProduct product = createCar(model);

		//共通概念化された、なんらかの加工をする
		//車を組み立てる
		product.assemble();
		//車に色を塗る
		product.paintColor(color);

		//製品完成
		return product;
	}

	/*
	 * オブジェクトを生成する抽象メソッド
	 */
	public abstract CarProduct createCar(String model);
}
