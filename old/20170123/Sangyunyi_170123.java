import java.util.Scanner;

public class Sangyunyi_170123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
[2017.01.23 ������ ����]
���� ���� x�� �ϻ��� ���̷��� x�� �ڸ����� ������ x�� ���������� �մϴ�. 
������� 18�� �ڸ��� ���� 1+8=9�̰�, 18�� 9�� ������ �������Ƿ� 18�� �ϻ��� ���Դϴ�.
�Է¹��� ���� ���� n�� �ϻ�������� �ƴ��� �Ǵ��ϴ� �Լ��� �ϼ��ϼ���.
������� n�� 10, 12, 18, 153, 142857.. �̸� True�� ���� 11, 13..�̸� False�� �����ϸ� �˴ϴ�.
�������� : ���ڿ��� ��ȯ���� ����.
 */
		Scanner scannerInput = new Scanner (System.in);
		System.out.print("�����Է� : ");
		int iInput = scannerInput.nextInt();
		int iResult = 0;
		
		
		while(1==1){
			int iTemp = iInput/10; 
			//System.out.println("iTemp\t"+iTemp);//System.out.println("iInput%10\t"+iInput%10);
			if(iTemp>0){//��������
				iResult += iInput%10;
				iInput = iTemp;
				//System.out.println("iResult\t"+iResult);
			}else{
				iResult += iInput;
				//System.out.println("iResult\t"+iResult);
				break;
			}
		}
		if(iResult%9==0){
			System.out.println("True");
		}else{
			System.out.println("False");
		}
	}

}
