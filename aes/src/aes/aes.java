import java.util.Scanner;

public class aes {

	static int RS = 0;
	static Double AE = 0.0, SD = 0.0;

	// Z 및 등급 산출
	public static void Calculation() {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			Double A = 0.0, Z = 0.0;

			System.out.println("\n(Z) = (원점수 - 평균) / 표준편차");
			System.out.print("원점수 입력: ");
			RS = sc.nextInt();
			System.out.print("평균 입력: ");
			AE = sc.nextDouble();
			System.out.print("표준편차 입력: ");
			SD = sc.nextDouble();

			A += (RS - AE) / SD;
			Z = (double) Math.round(A * 10000) / 10000;

			if (Z >= 1.76) {
				System.out.println("【1등급】 | Z 점수: " + Z);
			} else if (Z < 1.76 && Z >= 1.23) {
				System.out.println("『2등급』 | Z 점수: " + Z);
			} else if (Z < 1.23 && Z >= 0.74) {
				System.out.println("「3등급」 | Z 점수: " + Z);
			} else if (Z < 0.74 && Z >= 0.26) {
				System.out.println("4등급 | Z 점수: " + Z);
			} else if (Z < 0.26 && Z >= -0.26) {
				System.out.println("5등급 | Z 점수: " + Z);
			} else if (Z < -0.26 && Z >= -0.74) {
				System.out.println("6등급 | Z 점수: " + Z);
			} else if (Z < -0.74 && Z >= -1.23) {
				System.out.println("7등급 | Z 점수: " + Z);
			} else if (Z < -1.23 && Z >= -1.76) {
				System.out.println("8등급 | Z 점수: " + Z);
			} else {
				System.out.println("9등급 | Z 점수: " + Z);
			}
		}
	}

	// (가고 싶은) 대학교 및 전문대 리스트
	public static void List() {
		System.out.printf("○○전문대 ");
		System.out.printf("●●전문대 ");
		System.out.printf("◎◎전문대 ");
		System.out.printf("◇◇과학기술대학교 ");
		System.out.printf("□□□대학교 ");
		System.out.printf("■■대학교 ");
		System.out.printf("etc.. ");
	}

	public static void main(String[] args) {
		
		while (true) {
			List();
			System.out.println("\n성취평가제 과목의 석차등급 산출하는 코드");
			System.out.println(
					"1 |  3.0 ~ 1.76\n2 |  1.76 ~ 1.23\n3 |  1.23 ~ 0.74\n4 |  0.74 ~ 0.26\n5 |  0.26 ~ -0.26\n6 | -0.26 ~ -0.74\n7 | -0.74 ~ -1.23\n8 | -1.23 ~ -1.76\n9 | -1.76 ~ -3.0");
			Calculation();
		}
	}
}
