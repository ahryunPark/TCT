package com.lgcns.LCP01;

public class JungHyunSeok_20170117 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// System.out.println("Hello, World~~");
		
        
				String input = "aaabbcccccca";
        String result = "";
        int count = 0;
        
        char tmp = input.charAt(0);
        count++;
        
        for ( int i = 1; i < input.length(); i++ ) {
            
            if ( input.charAt(i) != tmp ) {
            	result += tmp + "" + count;
                count = 0;
                
                tmp = input.charAt(i);
                count++;
                
            } else {
                count++;
            }
            
            if ( i == input.length()-1 ) {
            	result += tmp + "" + count;
            }
            	
        }
        
        System.out.println(result);

	}

}

/*���ڿ� ���� �˰��� (LCP ���⹮��)
���ڿ��� �Է¹޾Ƽ�, ���� ���ڰ� ���������� �ݺ��Ǵ� ��쿡 �� �ݺ� Ƚ���� ǥ���Ͽ� ���ڿ��� �����ϱ�.
��, �ѹ��� �ݺ��Ǵ� ���ڴ� ���� ����  �״�� ǥ���Ұ� 
�Է� ����: aaabbcccccca
��� ����: a3b2c6a
�Է� ����: abbcccccca
��� ����: ab2c6a
�Է� ����: apple
��� ����: ap2le*/

