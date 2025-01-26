package strings;

public class DetectCapital {
	//if 1st letter is small, all other letters should be small
//check for 1st letter - if is small letter then enters if block, if not enters else block
	//within if block - checks for second char - if small - continue, else return false
	
	//if 1st letter is small, then check for 2nd letter
	//if 2nd letter exists and if it is not small, then all other should be capital
	public static void main(String[] args) {
		System.out.println(detectCapital("FlaG"));

	}

	public static boolean detectCapital(String s) {
		if (s.length() == 1)
			return true;
		if (s.charAt(0) >= 97 && s.charAt(0)  <= 122) {
			int i = 1;
			while (i < s.length()) {
				if (s.charAt(i) >= 97 && s.charAt(i)  <= 122) {

				} else {
					return false;
				}
				i++;
			}
		} else {
			if (s.length() >= 1 && s.charAt(1) >= 97 && s.charAt(1) <= 122) {
				int i = 2;
				while (i < s.length()) {
					if (s.charAt(i)>= 97 && s.charAt(i) <= 122) {

					} else {
						return false;
					}
					i++;
				}
			} else {
				int i = 1;
				while (i < s.length()) {
					if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
						

					} else {
						return false;
					}
					i++;
				}
			}
		}
		
		return true;

	}
}
