package level1.test;

// 길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요. 예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.

public class Subak {
	public static String solution(int n) {
		String answer = "";
		StringBuilder sb = new StringBuilder();
		String s = "수박";
		
		if(n == 1) {
			return "수";
		}
		
		if (n % 2 == 0) {
			for (int i = 0; i < n / 2; i++) {
				sb.append(s);
			}
		} else {
			for (int i = 0; i < n / 2; i++) {
				sb.append(s);
			}
			sb.append("수");
		}
		answer = sb.toString();
		return answer;
	}


	public static void main(String[] args) {
		System.out.println(Subak.solution(1));
	}

}
