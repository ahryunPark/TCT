
public class KimHyeRyoung_20170119 {

	public static void main(String[] args) {
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
			407
		 */
		System.out.println("[������]");
		
		int x,y,z = 0;
		int power = 3;
		for ( int idx = 100; idx < 1000 ; idx++ ) {
			x = idx/100;
			y = (idx - x*100)/10;
			z = idx - x*100 - y*10;
			
			if ( idx == (int)Math.pow(x, power) + (int)Math.pow(y, power) + (int)Math.pow(z, power) ) {
				System.out.println(idx);
			}
		}
	}
}
