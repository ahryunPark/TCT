package com.lgcns.LCP01;

public class JungHyunSeok_20170119 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*		<������ ����>
		���� 12:55
		 100���� 1000 ������ ���� �� �� �ڸ����� �ش��ϴ� ������ ���� ���� �ش� ���ڿ� ������ ���ڸ� ����Ѵ�.
		  ex) 153 = 1x1x1 + 5x5x5 + 3x3x3
		= 1 + 125 + 27
		[����]
		1) Armstrong Number ����Ѵ�.
		[������]
		153
		370
		371
		407*/
		

		int a = 0;
		int b = 0;
		int c = 0;
		int sum = 0;
		String str = "";
		
		for (int i = 100; i < 1000; i++){
			str = Integer.toString(i);
			
            a = Integer.parseInt( str.substring( 0, 1 ) );
            b = Integer.parseInt( str.substring( 1, 2 ) );
            c = Integer.parseInt( str.substring( 2 ) );

            sum = a*a*a + b*b*b + c*c*c;
			
			if(i == sum){
				System.out.println(i);
			}
			
		}
		
	}

}
