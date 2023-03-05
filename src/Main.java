import easy.Palindrome;

public class Main {
    public static void main(String[] args) {
        Palindrome p=new Palindrome();
        if(p.isNumberPalindrome(121)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        int nb=121;
        if(p.isPalindrome(Integer.toString(nb))){
            System.out.println("S: true");
        }else{
            System.out.println("S: false");
        }


    }
}