package com.lgcns.LCP01;

import java.util.Random;

public class JungHyunSeok_20170201 {
	
	static int DiceGame() {
	    //�ۼ��ϼ��� ^^
		
		Random random = new Random();
		
		int a = 0;
		int b = 0;
		int sum = 0;
		
		a = random.nextInt(6) + 1;
		b = random.nextInt(6) + 1;
			
		System.out.println(a + " " + b);
		
		sum = a + b;
		
		if ( a == b ) {
			return sum + DiceGame();
		} 
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.out.println(DiceGame() + " ��ŭ ����!");

	}

}
/*
[2017.02.01 ������ ����]
����: �ֻ��� ����
�� ���� �ֻ����� ���� ���� �ջ�, ����մϴ�.
[����]
��� �Լ��� �̿��� �������ּ���.
��, �� �ֻ����� ���� ���� ��� �ѹ� �� �����ϴ�.
�ֻ��� ���� 1~6 ���� ����
[��� ����]
3 3
6 6
5 4
27 ��ŭ ����!
static int DiceGame() {
    //�ۼ��ϼ��� ^^
}
public static void main(String[] args) {
         System.out.println(DiceGame());
}

*/
