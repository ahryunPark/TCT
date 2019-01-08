import java.util.InputMismatchException;
import java.util.Scanner;

public class KimHyeRyoung_20170216 {
	/*
	 ����� �ɽ��ؼ� ������ ���� ���� ���� ���� �ߴ�.
	[�׸��� ���� ����]
	�̷��� ���� ���� ��� � ���� �� ���� �ִ����� �ñ��� ����.
	����� 100 �� 7 ���� ���� �Ѵ�.
	�Է�
	32 ��Ʈ ���� �������� ���� �Է����� �־�����.
	���
	�� ���� ����Ѵ�.
	����� ��
	�Է�
	100
	���
	7
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������ �˰� ���� ���� �Է��ϼ���.");
		Scanner in = new Scanner(System.in);
		
		try {
			int num = in.nextInt();
			System.out.println("�Է�\n" + num);
			
			int floor = 0;
			if ( Integer.bitCount(num) < 32 ) {
				floor = floorCalculate(num);
			} else {
				System.out.println("32��Ʈ ���� ���� ������ �Է��ϼ���.");
			}
			
			System.out.println("���\n" + floor);
		} catch ( InputMismatchException ie ) {
			System.out.println("32��Ʈ ���� ���� ������ �Է��ϼ���.");
		}
	}
	
	public static int floorCalculate( int input ) {
		int floor = 1; // �ش� ��
		int cnt = 1; // �ش� ���� ���� ���� = �Ʒ� ���� ���� ����*2
		int lastNum = 1; // �ش� ���� ������ ����
		while ( input > 1 ) {
			floor++;
			cnt = cnt*2;
			lastNum += cnt;
			//System.out.println(floor + "���� ������ ���ڴ� : " + lastNum);
			
			if ( input <= lastNum ) {
				break;
			}
		}
		
		return floor;
	}

}
