import java.util.Scanner;

public class Sangyunyi_170124 {

	public static void main(String[] args) {
/*
1���� 10,000���� 7�̶�� ���ڰ� �� ��� �����°�?
7�� ���ԵǾ� �ִ� ������ ������ ī���� �ϴ� ���� �ƴ϶� 7�̶�� ���ڸ� ��� ī���� �ؾ� �Ѵ�.
(�� ������� 7707�� 3, 7777�� 4�� ī���� �ؾ� ��)
������ ���������� ���� �ڵ鸵�ϴ� ������ �׸� ����� �Ͻ���
1���� 10000 ���� loop ������ �ʰ� Ǯ�����.
 */
		//Scanner scannerInput = new Scanner (System.in);
		//System.out.print("�����Է� : ");
		//int iInput = scannerInput.nextInt();
		int iResult = 0;
		for(int idx=1; idx<=10000; idx++){
			String sTemp = String.valueOf(idx);
			for(int idy=0; idy<sTemp.length();idy++){//System.out.println(sTemp.length());
				if( sTemp.charAt(idy)=='7'){
					iResult ++;
				}
			}
		}
		System.out.println("1���� 10,000���� 7�̶�� ���ڰ� �� ��� �����°�?\n"+iResult+" ��");
	        
	}

}
