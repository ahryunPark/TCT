import java.util.Random;
import java.util.Scanner;

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


public class Sangyunyi_170202 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] iRandom = Random();		
		
		int iCount = 0;
		int iRound = 0;
		Scanner scannerInput = new Scanner (System.in);

		System.out.println("iRandom\n"+iRandom[0]+"/"+iRandom[1]+"/"+iRandom[2]);
		while(iRound<10){
			iRound++;
			int strike = 0;
			int ball = 0;
			System.out.println("3 �� ���ڸ� �Է��ϼ���");
			int[] iArray = new int[3];
			iArray[0] = scannerInput.nextInt();
			iArray[1] = scannerInput.nextInt();
			iArray[2] = scannerInput.nextInt();

			for(int idx=0;idx<3;idx++){
				for(int idy=0;idy<3;idy++){
					if( (iArray[idx] == iRandom[idy]) && (idx==idy) ){
						strike++;
					}else if( (iArray[idx] == iRandom[idy]) && (idx!=idy) ){
						ball++;
					}
				}
			}
			System.out.println(strike+"Strike "+ball+" Ball");
			if(strike==3){
				System.out.println(iRound+" ȸ���� Strike Out!!!");
				break;
			}
		}
	}
	public static int[] Random(){
		Random random = new Random();
		int[] iRandom = new int[3];
		iRandom[0] = random.nextInt(9)+1;
		iRandom[1] = random.nextInt(9)+1;
		iRandom[2] = random.nextInt(9)+1;
		while(1==1){
			if ( iRandom[0]==iRandom[1] || iRandom[0]==iRandom[2] || iRandom[1]==iRandom[2] ) {
				Random();
			} else {
				return iRandom;
			}
		}
		
	}
}


