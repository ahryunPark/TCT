import java.util.Scanner;

public class KimHyeRyoung_20170221 {
	/*
	  	�Էµ� ���ڰ� �ڿ����� ���������� �ƴ��� �Ǵ��ϴ� ���α׷��� ¥����.
		�������� : ��Ģ���� �� ������ ������ �����մϴ�.
		i.e) 25 --> True
     		 44 --> False
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�ڿ����� �Է��ϼ���. ");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		System.out.println(num + " --> " + isPowerNumber(num));
	}
	
	public static boolean isPowerNumber( int inputNum ) {
		boolean flag = false;
		for ( int inx = 1 ; inx <= inputNum ; inx++ ) {
			int temp = inputNum;
			int cnt = 0;
			while ( temp > 0 ) {
				temp = temp - inx;
				if ( cnt > inx ) {
					flag = false;
					break;
				}
				cnt++;
			}
			
			if ( temp == 0 && cnt == inx ) {
				flag = true;
				break;
			}
		}
		return flag;
	}

}
