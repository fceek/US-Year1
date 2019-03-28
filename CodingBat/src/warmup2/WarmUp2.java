package warmup2;

public class WarmUp2 {

    public static void main(String[] args) {
        Code runner = new Code() ;

        System.out.println(
                runner.noTriples(new int[]{1,1,2,2,1})
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
        boolean found9 = false;
        if (nums.length <= 4) {
            for (int index: nums) {
                if (index == 9) found9 = true;
            }
        }
        else {
            for (int i = 0; i < 4; i++) {
                if (nums[i] == 9) found9 =true;
            }
        }

        return found9;
    }

    public boolean array123(int[] nums) {
        if (nums.length < 3) return false;
        for (int i = 0; i <= nums.length - 3; i++) {
            if (nums[i] == 1 && nums[i+1] == 2 && nums[i+2] == 3) return true;
        }
        return false;
    }

    public int stringMatch(String a, String b) {
        if (a.length() < 2|| b.length() < 2) return 0;
        int matchCount = 0;
        int shorter = a.length();
        if (a.length() > b.length())  shorter = b.length();
        for (int i = 0; i <= shorter - 2; i++) {
            String sample = a.substring(i,i+2);
            if (sample.equals(b.substring(i,i+2))) matchCount++;
        }

        return matchCount;
    }

    public String stringX(String str) {
        if (str.length() < 3) return str;
        String procStr = "";
        for (int i = 1; i <= str.length() - 2; i++) {
            if (str.charAt(i) != 'x') procStr += str.charAt(i);
        }
        procStr = str.charAt(0) + procStr + str.charAt(str.length() - 1);
        return procStr;
    }

    public String altPairs(String str) {
        String procStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (i % 4 < 2) procStr += str.charAt(i);
        }
        return procStr;
    }

    public String stringYak(String str) {
        int len = str.length();
        if (len < 3) return str;
        String procStr = "";
        int flag = 0;
        for (int i = 1; i < len - 1 ; i++) {
            if (str.charAt(i-1) == 'y' && str.charAt(i+1) == 'k') {
                procStr += str.substring(flag,i-1);
                i += 2;
                flag = i;
            }
        }
        procStr += str.substring(flag,len);
        return procStr;
    }

    public int array667(int[] nums) {
        if (nums.length < 2) return 0;
        int matchCount = 0;
        for (int i = 0; i < nums.length -1 ; i++) {
            if (nums[i] == 6 && (nums[i+1] == 7 || nums[i+1] == 6)) matchCount++;
        }
        return matchCount;
    }

    public boolean noTriples(int[] nums) {
        for
        return
    }
}