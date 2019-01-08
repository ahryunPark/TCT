package com.lgcns.lkk;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Test {

	public static void main (String arg[]) throws IOException  {
		run();
	}

	static void run(){
		/*
	[2017.02.13] ������ ����
		� �ڿ��� n�� ���� ��, d(n)�� n�� �� �ڸ��� ���ڵ�� n �ڽ��� ���� ���ڶ�� ��������.
		���� ���
		d(91) = 9 + 1 + 91 = 101
		�� ��, n�� d(n)�� ���׷�����(generator)��� �Ѵ�. ���� ������ 91�� 101�� ���׷������̴�.
		� ���ڵ��� �ϳ� �̻��� ���׷����͸� ������ �ִµ�, 101�� ���׷����ʹ� 91 �� �ƴ϶� 100�� �ִ�. 
		�׷��� �ݴ��, ���׷����Ͱ� ���� ���ڵ鵵 ������, 
		�̷� ���ڸ� �ε��� ������ Kaprekar�� ���� �ѹ�(self-number)�� �̸� �ٿ���. ���� ��� 1,3,5,7,9,20,31 �� ���� �ѹ� ���̴�.
		1 �̻��̰� 5000 ���� ���� ��� ���� �ѹ����� ���� ���϶�.
		 */
	
		int sum =0;
		System.out.print("Result : "  );
		for(int i=1; i<5000;i++){
			
			if(checkSelfNum(i)){
				System.out.print(i + " " );
				sum += i;
			}
		}
		System.out.println("\nResult Sum : " + sum);
	}
	
	public static boolean checkSelfNum(int n){
		
		boolean result = true;
		for(int i=1; i<=n; i++){
			String temp = Integer.toString(i);
			int subSum=0;
			for(int j=0; j<temp.length();j++){
				subSum += (int)(temp.charAt(j)) -48;
			}
			subSum += i;
			
			if(subSum == n) {
				result = false;
			}
		}
		
		return result;
	}

}
