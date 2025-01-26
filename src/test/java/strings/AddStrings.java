package strings;

//K-th Bit is Set or Not

public class AddStrings {
	public static void main(String[] args) {
		System.out.println(addStrings("0", "0"));
	}

	public static String addStrings(String num1, String num2) {
		int i = num1.length() - 1;
		int j = num2.length() - 1;
		int extra = 0;

		StringBuilder sb = new StringBuilder();
		while (i >= 0 || j >= 0 || extra != 0) {
			int cur = extra;
			if (i >= 0) {
				cur += num1.charAt(i)-'0';
			}
			if (j >= 0) {
				cur += num2.charAt(j)-'0';
			}
			if (cur >= 10) {
				extra = cur / 10;
				sb.append(cur % 10);
			}
			else {
				sb.append(Integer.toString(cur));
				extra = 0;
			}
			i--;
			j--;
		}
		return sb.reverse().toString();

	}
}
