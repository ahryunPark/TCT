import java.util.Arrays;

public class KimHyeRyoung_20170125 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		String[] strArrays = new String[]{"apple","peach","fly","money","room","cow","test","air","dog","spider"};
		
		Arrays.sort(strArrays);
		if ( strArrays.length%2 == 0 ) {
			System.out.println("median : " + strArrays[strArrays.length/2-1]);
		} else {
			System.out.println("median : " + strArrays[strArrays.length/2]);
		}
	}

}
