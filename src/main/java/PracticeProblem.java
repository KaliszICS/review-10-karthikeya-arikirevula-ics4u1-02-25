public class PracticeProblem {

	public static void main(String args[]) {
	}

	public static String pyramid(int giza) {
		String result = "";

		for (int i = 1; i <= giza; i++) {
			for (int j = 0; j < giza - i; j++) {
				result += " ";
			}

			for (int b = 0; b < i; b++) {
				result += "*";
				if (b < i - 1) {
					result += " ";
				}
			}

			if (i != giza) {
				result += "\n";
			}
		}
		return result;
	}
	
	public static String square(int square) {
        String result = "";

        for (int i = 0; i < square; i++) {
            if (i == 0 || i == square - 1) {
                for (int j = 0; j < square; j++) {
                    result += "*";
                }
            } else {
                result += "*";
                for (int j = 1; j < square - 1; j++) {
                    result += " ";
                }
                result += "*";
            }
            if (i < square - 1) {
                result += "\n";
            }
        }
        return result;
	}

	public static Boolean hasLowercase(String word) {
		for (int i = 0; i < word.length(); i++) {
			if (Character.isLowerCase(word.charAt(i))) {
				return true;
			}
		}
		return false;
	}
}

