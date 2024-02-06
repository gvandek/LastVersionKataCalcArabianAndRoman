public enum Roman {
    I(1),
    II(2),
    III(3),
    IV(4),
    V(5),
    VI(6),
    VII(7),
    VIII(8),
    IX(9),
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

    public static int romanToArabic(String roman) {
        int end = roman.length() - 1;
        char[] a = roman.toCharArray();
        int result = toInt(a[end]);

        for(int i = end - 1; i >= 0; --i) {
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

    public static boolean isRoman(String proverka) {
        Roman[] var1 = values();
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            Roman number = var1[var3];
            if (number.name().equals(proverka)) {
                return true;
            }
        }

        return false;
    }
}


