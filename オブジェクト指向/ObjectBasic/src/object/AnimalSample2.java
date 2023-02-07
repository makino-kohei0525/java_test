package object;

import java.util.Scanner;

public class AnimalSample2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] txt = line.split(",");

		AnimalSample3.animal(txt);
		//ライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30,チンパンジー:0.94:25,シマウマ:2.4:65
	}
}