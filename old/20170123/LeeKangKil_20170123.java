package com.lgcns.lkk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

public class Test {

	public static void main (String arg[]) throws IOException  {
		run();
	}

	public  static void run(){
		
		/*
		���� ���� x�� �ϻ��� ���̷��� x�� �ڸ����� ������ x�� ���������� �մϴ�. 
		������� 18�� �ڸ��� ���� 1+8=9�̰�, 18�� 9�� ������ �������Ƿ� 18�� �ϻ��� ���Դϴ�.
		�Է¹��� ���� ���� n�� �ϻ�������� �ƴ��� �Ǵ��ϴ� �Լ��� �ϼ��ϼ���.
		������� n�� 10, 12, 18, 153, 142857.. �̸� True�� ���� 11, 13..�̸� False�� �����ϸ� �˴ϴ�.
		 */
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isr);

		System.out.println("Input Number : "  );
		
		try{
			String strInput = in.readLine();
			
			int num = Integer.valueOf(strInput).intValue(); 
			int temp = num; 
			int currVal = num;
			
			int digit = 0; // �ڸ���
			int digitVal = 1;
			int sum = 0;
			
			boolean result =false;

			
			while(temp>0){
				temp/=10;
				digit ++;
				digitVal *=10;
			}
			
			for(int i=digit;i>0;i--)
			{
				digitVal/=10;
				sum += (currVal/digitVal);
				currVal = currVal%digitVal;
			}
			if(num%sum == 0) result = true;
			
			System.out.println(result);
			
			
		
		}catch (IOException e){
			
		}
		
	}

}
