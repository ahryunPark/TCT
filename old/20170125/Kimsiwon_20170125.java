/*
[2017.01.25 ������ ����]
���ڿ� �߾Ӱ� ���ϱ�
�Է��� ���ڿ� ����Ʈ�� ������������ �������� �� �߾ӿ� �ش��ϴ� ���ڿ��� ����Ͻÿ�.
(��, ���ڿ� ����Ʈ�� ������ ¦���� ���, �߾ӿ� �ش��ϴ� �� ���ڿ� �� �տ� �ִ� ���ڿ��� ����Ѵ�.)
��¿���
input : test, war, holiday, window, project
median : test
input : apple, peach, fly, money, room, cow, test, air, dog, spider
median : fly
 */
public class Kimsiwon_20170125 {

	public static void main( String[] args ) {
		
		//String input[] = {"test","war","holiday","window","project"};
		String input[] = {"apple", "peach", "fly", "money", "room", "cow", "test", "air", "dog", "spider"};		
		
		test(input);		
    }
	
	public  static void test(String input[]){
		
		String strResult[] = input;
		String tmpStr;
		
		for (int i = 0; i < strResult.length; i++){
			for (int j =i; j < strResult.length; j++){
				if (strResult[i].compareTo(strResult[j]) > 0 ){
					tmpStr = strResult[i];
					strResult[i] = strResult[j];
					strResult[j] = tmpStr;					
				}				
			}			
		}
		
		System.out.println("median: " + strResult[Math.round((strResult.length-1)/2)]);
	}
	

}
