package Giris;


public class polindromikKelime {

    static boolean ispalindromik(String str) {
        int i=0;
        int j=str.length()-1;

        while (i<j){
            if (str.charAt(i)!=(str.charAt(j))){
                return false;
            }
            i++;
            j--;
        }
        return true;

    }
    static boolean ispalindrome(String strr){
        String revarse="";
        for (int i=strr.length()-1;i>=0;i--) {
            revarse += strr.charAt(i);
        }

            return strr.equals(revarse);
        }

    public static void main(String[] args) {
        System.out.println(ispalindrome("mik"));

    }

}

