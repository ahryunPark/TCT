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
		1���� 10,000���� 7�̶�� ���ڰ� �� ��� �����°�?
		7�� ���ԵǾ� �ִ� ������ ������ ī���� �ϴ� ���� �ƴ϶� 7�̶�� ���ڸ� ��� ī���� �ؾ� �Ѵ�.
		(�� ������� 7707�� 3, 7777�� 4�� ī���� �ؾ� ��)
		 */
		
		
		int sum =0; 
		for (int i=0; i<10000;i++){
			String temp  = String.valueOf(i);
			for(int j=0; j<temp.length();j++){
				if(temp.charAt(j)=='7' ) sum ++;
				
			}
		}
		System.out.println(sum);
		
		
		
		
	}

}
