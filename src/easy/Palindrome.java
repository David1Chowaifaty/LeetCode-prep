package easy;

public class Palindrome {
    public  boolean isNumberPalindrome(int num){
        if (num < 0) {
            return false;
        }
        int reversedNum = 0;
        int tempNum = num;
        while (tempNum > 0) {
            reversedNum = (reversedNum * 10) + (tempNum % 10);
            tempNum /= 10;
        }
        return reversedNum==num;
    }

    public boolean isPalindrome(String s){
        if(s.equals("")){
            return false;
        }
        String reversedString="";
        for(int i=s.length()-1;i>=0;i--){
            reversedString+=s.charAt(i);
        }
        return s.equals(reversedString);
    }

}
