package level1.test;

// ���̰� n�̰�, "���ڼ��ڼ��ڼ�...."�� ���� ������ �����ϴ� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ��ϼ���. ������� n�� 4�̸� "���ڼ���"�� �����ϰ� 3�̶�� "���ڼ�"�� �����ϸ� �˴ϴ�.

public class Subak {
	public static String solution(int n) {
		String answer = "";
		StringBuilder sb = new StringBuilder();
		String s = "����";
		
		if(n == 1) {
			return "��";
		}
		
		if (n % 2 == 0) {
			for (int i = 0; i < n / 2; i++) {
				sb.append(s);
			}
		} else {
			for (int i = 0; i < n / 2; i++) {
				sb.append(s);
			}
			sb.append("��");
		}
		answer = sb.toString();
		return answer;
	}


	public static void main(String[] args) {
		System.out.println(Subak.solution(1));
	}

}
