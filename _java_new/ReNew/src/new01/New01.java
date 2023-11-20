package new01;

public class New01 {

	public static void main(String[] args) {

		/*
		 * 홍길동 주민등록번호는 881122-1234567 출력형태 => 생년월일 : 881122, 성별 : 남(1,3) 여(2,4)
		 * 
		 */

		String hong = "881122-1234567";
		String sex = hong.substring(hong.indexOf("-") + 1, hong.indexOf("-") + 2);
		
		
		System.out.println("생년월일:" + hong.substring(0, hong.indexOf("-")));

		if(sex.equals("1") || sex.equals("3")){
			System.out.println("성별:" + "남");
		}else{
			System.out.println("성별:" + "여");
		}


		
			
		
	
		
	}

}
