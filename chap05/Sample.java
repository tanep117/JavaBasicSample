package chap05;

public class Sample {

	public static void main(String[] args) {
		System.out.println("私の名前は種村です");
		System.out.println("どうぞよろしくね。");

		System.out.println("私の名前は山田です");
		System.out.println("どうぞよろしくね。");

		System.out.println("私の名前は斉藤です");
		System.out.println("どうぞよろしくね。");

		printName("種村");
		printName("山田");
		printName("斉藤");
		printName("一郎");

		System.out.println("******************");
		int num;
		num = pow(5);
		System.out.println(num);
		num = pow(3);
		System.out.println(num);

	}

	public static void printName(String name) {
		System.out.println("私の名前は"+name+"です");
		System.out.println("どうぞよろしくね。");
		return;
	}

	public static int pow(int a) {
		return a*a;
	}

}
