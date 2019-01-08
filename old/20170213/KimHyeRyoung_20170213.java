public class KimHyeRyoung_20170213 {
	/*
	 [2017.02.13] ������ ����
		� �ڿ��� n�� ���� ��, d(n)�� n�� �� �ڸ��� ���ڵ�� n �ڽ��� ���� ���ڶ�� ��������.
		���� ���
		d(91) = 9 + 1 + 91 = 101
		�� ��, n�� d(n)�� ���׷�����(generator)��� �Ѵ�. ���� ������ 91�� 101�� ���׷������̴�.
		
		� ���ڵ��� �ϳ� �̻��� ���׷����͸� ������ �ִµ�, 101�� ���׷����ʹ� 91 �� �ƴ϶� 100�� �ִ�. 
		�׷��� �ݴ��, ���׷����Ͱ� ���� ���ڵ鵵 ������, �̷� ���ڸ� �ε��� ������ Kaprekar�� ���� �ѹ�(self-number)�� �̸� �ٿ���. 
		���� ��� 1,3,5,7,9,20,31 �� ���� �ѹ� ���̴�.
		1 �̻��̰� 5000 ���� ���� ��� ���� �ѹ����� ���� ���϶�.
	 */
	//public static ArrayList<Integer> list;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[5000];
		for ( int idx = 0 ; idx < 5000 ; idx++ ) {
			arr[idx] = idx+1;
		}
		
		for ( int jdx = 0 ; jdx < arr.length ; jdx++ ) {
			int generator = hasGeneratorNumber(jdx);
			if ( generator < 5000 && generator > 0) {
				arr[generator-1] = 0;
			}
		}
		
		int sum = 0;
		for ( int kdx = 0 ; kdx < arr.length ; kdx++ ) {
			sum += arr[kdx];
		}
		
		System.out.println("Sum of Self-Numbers from 1 to 5000 : " + sum); // 1232365
	}
	
	public static int hasGeneratorNumber( int num ) {
		int jarisuSum = 0;
		int generatorNumber = 0;
		
		int orgNum = num;
		while ( num > 0 ) {
			int temp = num%10; // 1, 9
			jarisuSum += temp; // 0+1+9
			num = num/10;
		}
		
		generatorNumber = jarisuSum + orgNum; // d(n)
		
		return generatorNumber;
	}

}
