package com.lgcns.LCP01;


public class JungHyunSeok_20170124 {


    public static void main(String[] args) {

		int count = 0;
		
		for(int i = 1 ; i < 10000; i++){
			
			String str = String.valueOf(i);
			
			for(int j = 0; j <str.length(); j++){
				
				if(str.charAt(j) == '7' )
					
					count += 1;
			}
		}
		
		System.out.println(count);
    	
    }    
}

/*1���� 10,000���� 7�̶�� ���ڰ� �� ��� �����°�?
7�� ���ԵǾ� �ִ� ������ ������ ī���� �ϴ� ���� �ƴ϶� 7�̶�� ���ڸ� ��� ī���� �ؾ� �Ѵ�.
(�� ������� 7707�� 3, 7777�� 4�� ī���� �ؾ� ��)*/
