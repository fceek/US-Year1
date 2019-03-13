package WarmUp1;

public class WarmUp1 {

    public static void main(String[] args) {
        Code runner = new Code() ;

        System.out.println(
                runner.startOz("zoxx")
        );
    }

}

class Code {

    public Code(){};

    public boolean sleepIn(boolean weekday, boolean vacation) {
        return (!weekday) || vacation;
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return (aSmile == bSmile);
    }

    public int sumDouble(int a, int b) {
        if (a==b) return 4*a;
        else return a+b;
    }

    public int diff21(int n) {
        if (n >= 21) return 2*(n-21);
        else return 21-n;
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        return talking && (hour > 20 || hour <7);
    }

    public boolean makes10(int a, int b) {
        return a == 10 || b == 10 || a+b == 10;
    }

    public boolean nearHundred(int n) {
        return (n < 111 && n > 89) || (n < 211 && n > 189);
    }

    public boolean posNeg(int a, int b, boolean negative) {
        return ( a*b < 0 && !negative) || (a < 0 && b < 0 && negative);
    }

    public String notString(String str) {
        if (str.length() < 3) return "not " + str;
        if (str.substring(0,3).equals("not")) return str;
            else return "not " + str;
    }

    public String missingChar(String str, int n) {
        return str.substring(0,n) + str.substring(n+1);
    }

    public String frontBack(String str) {
        if (str.length() <= 1) return str;
        return str.charAt(str.length()-1) + str.substring(1,str.length()-1) + str.charAt(0);
    }

    public String front3(String str) {
        String theFront;
        if (str.length()<3) theFront = str;
            else theFront = str.substring(0,3);

        return theFront + theFront + theFront;
    }

    public String backAround(String str) {
        char theChar = str.charAt(str.length()-1);
        return theChar + str + theChar;
    }

    public boolean or35(int n) {
        return (n % 3 == 0) || (n % 5 == 0);
    }

    public String front22(String str) {
        String theFront;
        if (str.length()<3) theFront = str;
            else theFront = str.substring(0,2);

        return theFront + str + theFront;
    }

    public boolean startHi(String str) {
        if (str.length()<2) return false;
        return (str.substring(0,2).equals("hi"));
    }

    public boolean icyHot(int temp1, int temp2) {
        return (temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0);
    }

    public boolean in1020(int a, int b) {
        return (a <= 20 && a >= 10) || (b <= 20 && b >= 10);
    }

    public boolean hasTeen(int a, int b, int c) {
        return (a <= 19 && a >= 13) || (b <= 19 && b >= 13) || (c <= 19 && c >= 13);
    }

    public boolean loneTeen(int a, int b) {
        return ((a <= 19 && a >= 13) && (b > 19 || b < 13)) || ((b <= 19 && b >= 13) && (a > 19 || a < 13));
    }

    public String delDel(String str) {
        if (str.length() < 4) return str;
            else if (str.substring(1,4).equals("del")) return str.charAt(0) + str.substring(4);
                else return str;
    }

    public boolean mixStart(String str) {
        if (str.length() < 3) return false;
        return str.substring(1,3).equals("ix");
    }

    public String startOz(String str) {
        if (str.length() >= 2) {
            String expStr = str.substring(0, 2);
            if (expStr.equals("oz")) return "oz";
            else if (str.charAt(0) == 'o') return "o";
            else if (str.charAt(1) == 'z') return "z";
            else return "";
        }
        else if (str.equals("o")) return "o";
            else return "";
    }

}
