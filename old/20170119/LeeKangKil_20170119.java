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

			for(int i=100; i<=1000; i++){

				String strNum = String.valueOf(i);
				int a = 0;
				int sum = 0 ;
				
				for(int j=0; j<strNum.length();j++){
					a = (Integer.valueOf(strNum.charAt(j)).intValue()-48);
					sum += a*a*a;
				}
				
				if(sum == i) System.out.println(i);
		
     }
}	

}
