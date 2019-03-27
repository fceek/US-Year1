package warmup2;

public class WarmUp2 {

    public static void main(String[] args) {
        Code runner = new Code() ;

        System.out.println(
                runner.arrayCount9(new int[]{1, 9, 9,3,9})
        );
    }

}

class Code {
    public String stringTimes(String str, int n) {
        String largerStr = "";
        for (int i = 0; i < n; i++) {
            largerStr += str;
        }

        return largerStr;
    }

    public String frontTimes(String str, int n) {
        String largerStr = "";
        if (str.length() <= 3) {
            for (int i = 0; i < n; i++) {
                largerStr += str;
            }
        }
        else {
            for (int i = 0; i < n; i++) {
                largerStr += str.substring(0,3);
            }
        }

        return largerStr;
    }

    public int countXX(String str) {
        int xxCount = 0;
        if (str.length() < 2) return 0;
        for (int i = 0; i < str.length()-1; i++) {
            if ("xx".equals(str.substring(i,i+2))) xxCount++;
        }

        return xxCount;
    }

    public boolean doubleX(String str) {
        int findX = str.indexOf('x');
        if (str.length() < 2) return false;
        if (findX == -1 || findX == str.length()-1) return false;
        return ("xx".equals(str.substring(findX,findX+2)));
    }

    public String stringBits(String str) {
        String procStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) procStr += str.charAt(i);
        }
        return procStr;
    }

    public String stringSplosion(String str) {
        String procStr = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j <= i; j++) {
                procStr += str.charAt(j);
            }
        }

        return procStr;
    }

    public int last2(String str) {
        if (str.length() <= 2) return 0;
        int lastCount = 0;
        String lastStr = str.substring(str.length()-2,str.length());
        for (int i = 0; i < str.length()-2; i++) {
            if (lastStr.equals(str.substring(i,i+2))) lastCount++;
        }
        return lastCount;
    }

    public int arrayCount9(int[] nums) {
        int nineCount = 0;
        for (int index: nums) {
            if (index == 9) nineCount++;
        }
        return nineCount;
    }

    public boolean arrayFront9(int[] nums) {

    }


}