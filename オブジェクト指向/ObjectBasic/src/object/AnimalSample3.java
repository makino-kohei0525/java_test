package object;

public class AnimalSample3 {
	
	public static void animal(String[] txt) {
		String[] name = new String[txt.length];
		double[] height = new double[txt.length];
		int[] speed = new int[txt.length];

	    for(int i = 0;i < txt.length;i++) {
	    	String[] ani = txt[i].split(":");
	    	name[i] = ani[0];
	    	height[i] = Double.parseDouble(ani[1]);
	    	speed[i] = Integer.parseInt(ani[2]);

	    // インスタンスの生成
		AnimalSample1 animal = new AnimalSample1();
	   
	    // インスタンスフィールドの「name」に値を設定する。
		animal.setName(name[i]);
	    // インスタンスフィールドの「speed」に値を設定する。
		animal.setSpeed(speed[i]);
	    // インスタンスフィールドの「height」に値を設定する。
		animal.setHeight(height[i]);
	    // インスタンスメソッドの呼び出し
		animal.write();  
		//switch文を使う
		switch(name[i]) {
		case "ライオン":
			System.out.println("学名：パンテラ レオ");
			System.out.println();
			break;
			
		case "ゾウ":
			System.out.println("学名：ロキソドンタ・サイクロティス");
			System.out.println();
			break;

		case "パンダ":
			System.out.println("学名：アイルロポダ・メラノレウカ");
			System.out.println();
			break;

		case "チンパンジー":
			System.out.println("学名：パン・トゥログロディテス");
			System.out.println();
			break;

		case "シマウマ":
			System.out.println("学名：チャップマンシマウマ");
			System.out.println();
			break;
			
		default:
		    System.out.println("学名：不明");
		    break;
			}
	    }
	}
	
}
