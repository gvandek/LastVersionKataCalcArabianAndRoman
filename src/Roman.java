public enum Roman {
    I(1),
    V(5),
    X(10),
    L(50),
    C(100);

    private int i;

    private Roman(int i) {
        this.i = i;
    }

    public int getI() {
        return this.i;
    }

    public static String convertToRoman(int number) {

        StringBuilder roman = new StringBuilder();
        Roman[] numerals = Roman.values();

        for (int i = numerals.length - 1; i >= 0; i--) {
            while (number >= numerals[i].getI()) {
                roman.append(numerals[i]);
                number -= numerals[i].getI();
            }
        }

        return roman.toString();
    }

    public static int romanToArabic(String roman) {
        int end = roman.length() - 1;
        char[] a = roman.toCharArray();
        int result = toInt(a[end]);

        for (int i = end - 1; i >= 0; --i) {
            int arabian = toInt(a[i]);
            if (arabian < toInt(a[i + 1])) {
                result -= arabian;
            } else {
                result += arabian;
            }
        }

        return result;
    }

    public static int toInt(char roman) {
        return valueOf(String.valueOf(roman)).getI();
    }

    public static boolean isRoman(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (Roman.valueOf(String.valueOf(input.charAt(i))) == null) {
                return false;
            }
        }
        return true;
    }
}



