package com.lgcns.LCP01;

import java.util.Arrays;

public class JungHyunSeok_20170125 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] str = new String[]{"test","war","holiday","window","project"};
		
		Arrays.sort(str);
		
		if ( str.length % 2 == 0 ) {
			
			System.out.println(str[str.length/2-1]);
			
		} else {
			
			System.out.println(str[str.length/2]);
		}

	}

}

/*[2017.01.25 ������ ����]
���ڿ� �߾Ӱ� ���ϱ�
�Է��� ���ڿ� ����Ʈ�� ������������ �������� �� �߾ӿ� �ش��ϴ� ���ڿ��� ����Ͻÿ�.
(��, ���ڿ� ����Ʈ�� ������ ¦���� ���, �߾ӿ� �ش��ϴ� �� ���ڿ� �� �տ� �ִ� ���ڿ��� ����Ѵ�.)
��¿���
input : test, war, holiday, window, project
median : test
input : apple, peach, fly, money, room, cow, test, air, dog, spider
median : fly
*/
