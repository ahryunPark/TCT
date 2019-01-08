import java.util.Arrays;
import java.util.Random;

public class KimHyeRyoung_20170206 {
	/**
	 [2017.02.06 ������ ����]
	 ����: �ζ�!!! ���纾�ô�~
	 1) 1~45 ������ �ߺ����� �ʴ� ������ ���� 6���� �����Ͽ� ���
	 2) ������ 6���� ������ �������� Sorting�Ͽ� ���
	 
	 [����]
 	 ��, ���� 6���� ���� ������ ��.

	 [��� ����]
 	������ ���� : 23 45 7 12 38 9
	���� ��� : 7 9 12 23 38 45 
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lottoArr[] = new int[6];
		int cnt = 0;
		int lottoNumber = 0;
		String flagList = "";
		while ( true ) {
			lottoNumber = chooseLottoNumber();
			if ( cnt == 0 ) lottoArr[0] = lottoNumber;
			flagList = "";
			
			for ( int inx = cnt ; inx > 0 ; inx-- ) {
				if ( lottoNumber == lottoArr[inx-1] ) {
					flagList += "N";
				} else {
					flagList += "Y";
				}
			}
			
			if ( !flagList.contains("N") ) {
				if ( cnt < 6 ) {
					lottoArr[cnt] = lottoNumber;
					cnt++;
				} else {
					break;
				}
			}
		}
		
		System.out.print("������ ���� : ");
		for ( int jnx = 0 ; jnx < lottoArr.length ; jnx++ ) {
			System.out.print(lottoArr[jnx] + " ");
		}
		
		int tempNum = 0;
		for ( int knx = 0 ; knx < lottoArr.length ; knx++ ) {
			for ( int lnx = knx+1 ; lnx < lottoArr.length ; lnx++ ) {
				if ( lottoArr[knx] > lottoArr[lnx] ) {
					tempNum = lottoArr[knx];
					lottoArr[knx] = lottoArr[lnx];
					lottoArr[lnx] = tempNum;
				}
			}
		}
		
		System.out.print("\n���� ��� : ");
		for ( int lnx = 0 ; lnx < lottoArr.length ; lnx++ ) {
			System.out.print(lottoArr[lnx] + " ");
		}
		
	}
	
	public static int chooseLottoNumber() {
		Random random = new Random();
		int randomNum = random.nextInt(45)+1;
		return randomNum;
	}
}
