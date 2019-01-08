import java.util.Random;
import java.util.Scanner;

public class KimHyeRyoung_20170202 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 [2017.02.02 ������ ����]
		���� : �߱����� 
		��ǻ�Ͱ� ������ ������ ���� 3���� �Է¹��� ���� 3���� ���Ͽ� Strike, Ball ����� ����մϴ�.
		3�� ���ڸ� ��� ���߸� strike out ���� ���� ����!!
		[����]
		��ǻ�Ͱ� ������ ������ ���� 3���� ���� �ߺ��Ǹ� �ȵ˴ϴ�.
		�Է¹޴� ���� 3���� ����, ��ǻ�Ͱ� ������ ������ ���ڿ� "�ڸ���, ���ڰ� ������ ��Ʈ����ũ" "���ڰ� ���� �ڸ����� �ٸ��� ��" �� ����մϴ�.
		��ǻ�Ͱ� ������ ������ ���ڿ� �Է¹޴� ���ڰ� ��ġ�ϸ� ������ ����Ǹ� �õ�Ƚ���� �Բ� �������� �޽����� ����մϴ�.
		[��� ���� > ��ǻ�Ͱ� ������ ������ ���� 4 5 1 �� ���]
		3 �� ���ڸ� �Է��ϼ���
		1
		4
		6
		0 Strike 2 Ball
		3 �� ���ڸ� �Է��ϼ���
		4
		1
		6
		1 Strike 1 Ball
		3 �� ���ڸ� �Է��ϼ���
		4
		1
		5
		1 Strike 2 Ball
		3 �� ���ڸ� �Է��ϼ���
		4
		5
		1
		3 Strike 0 Ball
		4 ȸ���� Strike Out!!!
		 */
		
		String pcRst = makePCNumber();
		String[] pcStr = pcRst.split(",");
		int pcNum1 = Integer.parseInt(pcStr[0]);
		int pcNum2 = Integer.parseInt(pcStr[1]);
		int pcNum3 = Integer.parseInt(pcStr[2]);
		System.out.println("��ǻ�Ͱ� ���� ���� : " + pcNum1 + " " + pcNum2 + " " + pcNum3);
		int[] pcNumArr = {pcNum1, pcNum2, pcNum3};
		
		int strikeCnt = 0;
		int ballCnt = 0;
		int cnt = 1;
		Scanner input = new Scanner(System.in);
		
		while ( true ) {
			if ( strikeCnt == 3 ) {
				cnt = cnt-1;
				break;
			} else {
				strikeCnt = 0;
				ballCnt = 0;
				System.out.println("3�� ���ڸ� �Է��ϼ���.");
				int inputNum1 = input.nextInt();
				int inputNum2 = input.nextInt();
				int inputNum3 = input.nextInt();
				int[] inputNumArr = {inputNum1,inputNum2,inputNum3}; 
				
				for ( int i = 0 ; i < pcNumArr.length ; i++ ) {
					for ( int j = 0 ; j < inputNumArr.length ; j++ ) {
						if ( pcNumArr[i] == inputNumArr[j] ) {
							if ( i != j ) {
								ballCnt++;
							} else {
								strikeCnt++;
							}
						}
					}
				}
			}
			
			System.out.println(strikeCnt + " Strike, " + ballCnt + " Ball");
			cnt++;
		}
		System.out.println(cnt + "ȸ���� Strike Out!!!" );
	}
	
	public static String makePCNumber() {
		Random rd = new Random();
		int pcNum1 = rd.nextInt(9);
		int pcNum2 = rd.nextInt(9);
		int pcNum3 = rd.nextInt(9);
		
		while ( true ) {
			if ( pcNum1 == pcNum2 || pcNum1 == pcNum3 || pcNum2 == pcNum3 ) {
				makePCNumber();
			} else {
				break;
			}
		}
		
		return pcNum1+","+pcNum2+","+pcNum3;
	}
}
