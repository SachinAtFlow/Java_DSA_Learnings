public class BasicMaths {
    //Counting digit in a number
    public static void countDigit(int a){
        int count=0;
        while(a>0){
            a/=10;
            count++;
        }
        System.out.println(count);
    }

    //reversing a number
    public static int reversedNum(int a){
        int rev=0;
        while(a>0){
            rev=rev*10+(a%10);
            a/=10;
        }
        return rev;
    }

    //check a number is palindrome or not
    public static boolean isPalindrome(int a){
        if(a<0)return false;
        int num=a;
        int rev=0;
        while(a>0){
            rev=rev*10+(a%10);
            a/=10;
        }
        return  rev==num;
    }

    //finding GCD or HCF 
    // public static int GCD(int a ,int b){
    //     int divisor=a;
    //     int dividend=b;
    //     while(divisor!=0){
    //         int remainder=dividend%divisor;
    //         divisor=remainder;
    //         dividend=divisor;

    //     }
    //     return dividend;
    // }
    public static void main(String arg[]){
        countDigit(453987);
        System.out.println(reversedNum(123));
        System.out.println(isPalindrome(121));
        // System.out.println(GCD(30,50));
    }
}
