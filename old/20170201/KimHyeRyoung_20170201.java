import java.util.Random;

public class KimHyeRyoung_20170201_v2 {
	/**
		[2017.02.01 ������ ����]
	����: �ֻ��� ����
	�� ���� �ֻ����� ���� ���� �ջ�, ����մϴ�.
	[����]
	��� �Լ��� �̿��� �������ּ���.
	��, �� �ֻ����� ���� ���� ��� �ѹ� �� �����ϴ�.
	�ֻ��� ���� 1~6 ���� ����
	[��� ����]
	3 3
	6 6
	5 4
	27 ��ŭ ����!
    */
	
	public static void main(String[] args) {
		System.out.println(DiceGame() + " ��ŭ ����!");
	}
	
	static int DiceGame() {
		Random rd1 = new Random();
		Random rd2 = new Random();
		int num1, num2;
		
		int sum = 0;
		while ( 1 == 1 ) {
			num1 = rd1.nextInt(6) + 1;
			num2 = rd2.nextInt(6) + 1;
			System.out.println(num1 + " " + num2);
			if ( num1 == num2 ) {
				sum += num1 + num2;
			} else {
				sum += num1 + num2;
				break;
			}
		}
		
		return sum;
	}
}
