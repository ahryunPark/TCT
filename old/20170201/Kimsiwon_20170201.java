/*
 [2017.02.01 ������ ����]
����: �ֻ��� ����
�� ���� �ֻ����� ���� ���� �ջ�, ����մϴ�.
[����]
��� �Լ��� �̿��� �������ּ���.
��, �� �ֻ����� ���� ���� ��� �ѹ� �� �����ϴ�.
�ֻ��� ���� 1~6 ���� ����
[��� ����]
3 3
6 6
5 4
27 ��ŭ ����!
static int DiceGame() {
    //�ۼ��ϼ��� ^^
}
public static void main(String[] args) {
         System.out.println(DiceGame());
}
 */
public class Kimsiwon_20170201 {
	public static void main( String[] args ) {	
		
		System.out.println(DiceGame());		
    }
	
	static int DiceGame() {
			
		int first = (int) Math.round(Math.random()*6 + 0.5);
		int second = (int) Math.round(Math.random()*6 + 0.5);
		
		System.out.println("first: " + first + " / second: " + second);
		
		int result = first + second;
		
		if (first == second){
			result = result + DiceGame();
		}
		
		return result;
	}
	

}
