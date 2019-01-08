package com.lgcns.LCP01;

public class JungHyunSeok_20170214 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		isDuplicate("0123456789");
		isDuplicate("01234");
		isDuplicate("01234567890");
		isDuplicate("6789012345");
		isDuplicate("012322456789");
    }

    private static void isDuplicate(String num){

        int[] arr = new int[10];
        boolean result = true;

        if (num.length() != 10){
            result = false;
            
        }else{
        	
            for (int i = 0; i < num.length(); i++){
                arr[num.charAt(i) - '0']++;
                if (arr[num.charAt(i) - '0'] > 1){
                    result = false;
                    break;
                }
            }
        }

        System.out.println(num + " : " + result);

	}

}
/*
[2017.02.14 ������ ����]
0~9������ ���ڷ� �� ���ڸ� �Է� �޾��� ��, 
�� �Է� ���� 0~9������ ���ڰ� ���� �� �� ���� ���� ������ Ȯ���ϴ� �Լ��� ���Ͻÿ�.
[����]
������ ������ �ٲ� �� ����.
��, 0~9������ ���ڰ� ��� ���ԵǾ�� ��.
[��� ����]
�Է� : 0123456789 01234 01234567890 6789012345 012322456789
��� : true false false true false

*/



