package com.lgcns.LCP01;

import java.io.IOException;

public class JungHyunSeok_20170118 {
	
	/*	������ ����
	n * m ��Ŀ� maxCnt �� ���ĺ� �ֱ� �Դϴ�.
	nm ���� maxCnt �� ũ�� nm ���� �迭
	������ ���� -> ���� �迭
	�׷��� ������ A �� ä��� �Դϴ�.
	( ���ι��� �迭, ���ι��� �迭)
	
	��¿�
	3*4 �迭�� maxCnt 16 �̸� 
	(����)
	ABCD
	EFGH
	IJKL
	(����)
	ADGJ
	BEHK
	CFIL
	3*4 maxCnt 10 �̸�
	(����)
	ABCD
	EFGH
	IJIH
	(����)
	ADGJ
	BEHI
	CFIH
	3*4 maxCnt 5 �̸�
	(����)
	ABCD
	EDCB
	AAAA
	(����)
	ADCA
	BEBA
	CDAA*/

	    public static void main(String[] args) throws IOException{
	        
	    	int m= 3;
	        int n= 4;
	        int maxCnt = 16;

			String[] arrStr = new String[]{"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","X","Y","Z"};
			String[][] rset = new String[m][n];

			int k = 0;
			int cnt = 0;

			String result;

			for ( int i = 0 ; i < m ; i++ ) {
				for ( int j = 0; j < n ; j++ ) {
					if ( cnt < arrStr.length ) {
						rset[i][j] = arrStr[k];
						result = rset[i][j];
						System.out.print(result);
						k++;
						cnt++;
					}
				}
				
				System.out.println();
			}

	}

}
