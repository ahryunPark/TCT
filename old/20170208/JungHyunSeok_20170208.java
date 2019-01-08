package com.lgcns.LCP01;

public class JungHyunSeok_20170208 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] list1 = { 4, 10, 15, 24, 26 };
		int[] list2 = { 0, 9, 12, 20 };
		int[] list3 = { 5, 18, 22, 30 };

		int val1 = 0;
		int val2 = 0;
		int val3 = 0;
		int minSum = Integer.MAX_VALUE;
		
		int result1 = 0;
		int result2 = 0;
		int result3 = 0;
		
		int min = 0;
		int max = 0;
		
		for(int i = 0; i < list1.length; i++){
			for( int j = 0; j < list2.length; j++){
				for(int k = 0; k < list3.length; k++){
					
					val1 = list1[i];
					val2 = list2[j];
					val3 = list3[k];
					
					int minimum = Math.max(Math.max(val1, val2),val3) -Math.min(Math.min(val1, val2),val3);
					if (minimum < minSum ){
						minSum = minimum;
						result1 = i;
						result2 = j;
						result3 = k;
					}
					 
				}
			}
		}

		max = Math.max(Math.max(list1[result1], list2[result2]),list3[result3]);
		min = Math.min(Math.min(list1[result1], list2[result2]),list3[result3]);
		System.out.println(min + "  " + max );

	}

}

/*
���ĵ� ������ ������ �ִ� K ���� List�� �ֽ��ϴ�.
�� List���� 1������ ���ڸ� �����Ͽ� ���� ���� ������ ����ϼ���.
���� ��� 
List 1: [4, 10, 15, 24, 26] 
List 2: [0, 9, 12, 20] 
List 3: [5, 18, 22, 30] 
���� ������ ��°��� [20,24] �Դϴ�.
List 1���� 24, List 2���� 20, List 3���� 22�� �������� ����Դϴ�.

*/
