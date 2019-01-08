
public class KimHyeRyoung_20170214 {
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
	public static void main(String[] args) {
		String numStr = "0a23165789";
		System.out.println(checkUseOnce(numStr));
	}
	
	public static String checkUseOnce( String input ) {
		StringBuffer sb = new StringBuffer();
		String result = "";
		if ( !isNumber( input ) ) { // �������� üũ
			result = "false";
		} else if ( input.length() != 10 ) { // 0~9 10�ڸ� ���� ���� üũ
			result = "false";
		} else {
			for ( int idx = 0 ; idx < input.length() ; idx++ ) {
				String chr = input.substring(idx,idx+1);
				if ( sb.indexOf(chr) > 0 ) {
					result = "false";
					break;
				} else {
					sb.append(chr);
					result = "true";
				}
			}
		}
		
		return result;
	}
	
	public static boolean isNumber( String input ) {
		try {
			Double num = Double.parseDouble(input);
			return true;
		} catch ( NumberFormatException ne ) {
			ne.getMessage();
			return false;
		}
	}

}
