package com.lgcns.lkk;


import java.io.IOException;
import java.lang.Math;

public class Test {

	public static void main (String arg[]) throws IOException  {
		System.out.println(DiceGame());
	}

	static int DiceGame(){
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
		 */

		int a = (int) (Math.round(Math.random()*10)%6+1);
		int b = (int) (Math.round(Math.random()*10)%6+1);
		int result = a+b;
		
		System.out.print(a);
		System.out.println(" "+b);
		
		if (a==b) result+= DiceGame();
		
		return result;

		
	}

}
