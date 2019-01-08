package com.lgcns.LCP01;


public class JungHyunSeok_20170213 {

	public static void main(String[] args) {

        boolean[] generator = new boolean[5000];

        int a,b,c,d,sum = 0;

        for(int i = 1; i < 5000; i++){
            
            a = i % 10;
            b = (i/10) % 10;
            c = (i/100) % 10;
        	d = (i/1000) % 10;
        	
            sum = a+b+c+d+i;

            if((1 <= sum) && (sum < 5000)){
            	generator[sum] = true;
            }
        }

        int total = 0;

        for(int j = 1; j < 5000; j++){
            
        	if(generator[j]==false){
                total += j;
        	}
        }

        System.out.println("Total : " + total);
		
	}

}
/*
[2017.02.13] ������ ����
� �ڿ��� n�� ���� ��, d(n)�� n�� �� �ڸ��� ���ڵ�� n �ڽ��� ���� ���ڶ�� ��������.
���� ���
d(91) = 9 + 1 + 91 = 101
�� ��, n�� d(n)�� ���׷�����(generator)��� �Ѵ�. ���� ������ 91�� 101�� ���׷������̴�.
� ���ڵ��� �ϳ� �̻��� ���׷����͸� ������ �ִµ�, 101�� ���׷����ʹ� 91 �� �ƴ϶� 100�� �ִ�. 
�׷��� �ݴ��, ���׷����Ͱ� ���� ���ڵ鵵 ������, 
�̷� ���ڸ� �ε��� ������ Kaprekar�� ���� �ѹ�(self-number)�� �̸� �ٿ���. 
���� ��� 1,3,5,7,9,20,31 �� ���� �ѹ� ���̴�.
1 �̻��̰� 5000 ���� ���� ��� ���� �ѹ����� ���� ���϶�.
*/
