package chap13.family;

public class Main {

	public static void main(String[] args) {

		//ポリモーフィズムを使っていない
		Father father = new Father("マスオ");
		Mother mother = new Mother("サザエ");
		Child child = new Child("タラ");

		father.greet();
		mother.greet();
		child.greet();

		System.out.println("*****************************");

		//ポリモーフィズムを使いたい
		Family[] family = {
				new Father("マスオ"),
				new Mother("サザエ"),
				new Child("タラ")
		};

		for(int i=0; i<family.length; i++) {
			family[i].greet();
		}


	}

}
