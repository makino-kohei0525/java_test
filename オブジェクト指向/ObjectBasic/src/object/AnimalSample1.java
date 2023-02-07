package object;

class AnimalSample1 {
	//フィールド宣言
	// 名前
	public String name;
	//速度
	public int speed;
	//体長を追加
	public double height;

	// コンソール出力メソッド
	public void write() {
		System.out.println("動物名：" + this.name);
		System.out.println("体長：" + this.height + "m");
		System.out.println("速度：" + this.speed + "km/h");
	}

	// 名前を設定するメソッド
	public void setName(String na) {
		this.name = na;
	}

	// 名前を取得するメソッド
	public String getName() {
		return this.name;
	}

	// 速度を設定するメソッド
	public void setSpeed(int sp) {
		this.speed = sp;
	}

	// 速度を取得するメソッド
	public int getSpeed() {
		return this.speed;
	}

	// 体長を設定するメソッド
	public void setHeight(double he) {
		this.height = he;
	}

	// 体長を取得するメソッド
	public double getHeight() {
		return this.height;	
	}
}

