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
		���ڿ� �߾Ӱ� ���ϱ�
		�Է��� ���ڿ� ����Ʈ�� ������������ �������� �� �߾ӿ� �ش��ϴ� ���ڿ��� ����Ͻÿ�.
		(��, ���ڿ� ����Ʈ�� ������ ¦���� ���, �߾ӿ� �ش��ϴ� �� ���ڿ� �� �տ� �ִ� ���ڿ��� ����Ѵ�.)
		��¿���
		input : test, war, holiday, window, project
		median : test
		input : apple, peach, fly, money, room, cow, test, air, dog, spider
		median : fly
		 */
		
		//String input[] = {"test","war","holiday","window","project"};
		String input[] = {"apple", "peach", "fly", "money", "room", "cow", "test", "air", "dog", "spider"};
		for(int i=0; i<input.length;i++)
		{
			for(int j=i;j<input.length;j++)
			{
				if(input[i].compareTo(input[j])>0){
					String temp = input[i];
					input[i] =input[j];
					input[j] = temp;
				}
				
			}
		}
		System.out.println("median : " + input[input.length/2-(input.length+1)%2]);
		
	}

}
