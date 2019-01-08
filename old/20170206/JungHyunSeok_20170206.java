package com.lgcns.LCP01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JungHyunSeok_20170206 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<Integer>();
		List<Integer> lotto = new ArrayList<Integer>();
		
		for(int i=1; i<=45; i++){
			list.add(i);
		}
		
		Collections.shuffle(list);
		
		for(int j=1; j<=6; j++){
			lotto.add(list.get(j));
		}
		
		Collections.sort(lotto);
		
		System.out.print(lotto);
		
	}

}

/*
[2017.02.06 ������ ����]
����: �ζ�!!! ���纾�ô�~
1) 1~45 ������ �ߺ����� �ʴ� ������ ���� 6���� �����Ͽ� ���
2) ������ 6���� ������ �������� Sorting�Ͽ� ���
[����]
��, ���� 6���� ���� ������ ��.
[��� ����]
������ ���� : 23 45 7 12 38 9
���� ��� : 7 9 12 23 38 45
*/

