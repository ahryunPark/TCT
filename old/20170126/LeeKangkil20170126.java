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
	������ ���� ������ �迭��
	[a1,a2,a3...,an,b1,b2...bn]
	������ ���� ���·� �ٲٽÿ�
	[a1,b1,a2,b2.....an,bn]
	������ ������ �ӿ���븮�� ��Ź�ؿ�
		 */
		

		String input[] = {"a1", "a2", "a3", "b1", "b2", "b3"};
		//String input[] = {"1", "2", "3", "4", "5", "6"};
		
		String result[] = new String[input.length+1];
		for(int i=0; i<input.length;i++)
		{
			result[i] = input[input.length/2*(i%2)+i/2];
		}
		
		for(int i=0; i<input.length;i++){
			System.out.print(result[i] + " ");
		}
		
	}

}
