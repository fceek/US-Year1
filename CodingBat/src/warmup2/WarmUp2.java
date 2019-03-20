package warmup2;

public class WarmUp2 {

    public static void main(String[] args) {
        Code runner = new Code() ;

        System.out.println(
                runner.stringBits("Heeololeo")
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

}