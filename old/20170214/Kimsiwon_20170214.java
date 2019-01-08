import java.util.ArrayList;

/*
[2017.02.14 ������ ����]
0~9������ ���ڷ� �� ���ڸ� �Է� �޾��� ��, 
�� �Է� ���� 0~9������ ���ڰ� ���� �� �� ���� ���� ������ Ȯ���ϴ� �Լ��� ���Ͻÿ�.
[����]
������ ������ �ٲ� �� ����.
��, 0~9������ ���ڰ� ��� ���ԵǾ�� ��.
[��� ����]
�Է� : 0123456789 01234 01234567890 6789012345 012322456789
��� : true false false true false
*/

public class Kimsiwon_20170214 {
	public static void main( String[] args ) {
		
		String input = "0123224567895"; //0123456789 01234 01234567890 6789012345 0123224567895;
		
		if(run(input)){
			System.out.println("Input: " + input + "/ Result: True");		
		}else{
			System.out.println("Input: " + input + "/ Result: False");
		}
    }
	
	public static boolean run(String Input){
		boolean result = false;
		boolean checkNotExist = true;
		ArrayList<String> inputSplit = new ArrayList<String>();
		int i = 0;
		String splitString = "";
		
		if(Input.length() == 10){
			result = true;
			
			while(checkNotExist && i < 9){
				splitString = Input.substring(i,i+1);
				
				if(inputSplit.contains(splitString)){
					result = false;
					checkNotExist = false;					
				}else{
					inputSplit.add(splitString);
					i = i + 1;
				}				
				
			}
			
		}
		
		return result;
	}
}
