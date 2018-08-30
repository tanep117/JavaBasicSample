package chap05;

public class Sample5_1_2 {

	public static void main(String[] args) {
		//テレビ局一覧を作ろう！

		//イケてないバージョン
		System.out.println("1チャンネルは、NHKです。");
		System.out.println("2チャンネルは、NHK Eテレです。");
		System.out.println("3チャンネルは、空きチャンネルです。");
		System.out.println("4チャンネルは、日本テレビです。");
		System.out.println("5チャンネルは、テレビ朝日です。");
		System.out.println("6チャンネルは、TBSテレビです。");
		System.out.println("7チャンネルは、テレビ東京です。");
		System.out.println("8チャンネルは、フジテレビです。");

		//メソッドを使ったバージョン
		for(int i=1; i<=8; i++) {
			printTV(i);
		}
	}

	//チャンネル情報を印刷するメソッド
	public static void printTV(int c) {
		System.out.print(c + "チャンネルは、");
		System.out.print(TvChannel(c));
		System.out.println("です。");
	}

	//チャンネルからテレビ局を取得するメソッド
	public static String TvChannel(int c) {
		String str;

		switch (c) {
		case 1:
			str = "NHK";
			break;
		case 2:
			str = "NHK Eテレ";
			break;
		case 4:
			str = "日本テレビ";
			break;
		case 5:
			str = "テレビ朝日";
			break;
		case 6:
			str = "TBSテレビ";
			break;
		case 7:
			str = "テレビ東京";
			break;
		case 8:
			str = "フジテレビ";
			break;
		default:
			str = "空きチャンネル";
		}

		return str;
	}

}
