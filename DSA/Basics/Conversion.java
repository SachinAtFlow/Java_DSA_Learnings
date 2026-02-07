public class Conversion {
    //Binary to decimal
    public static void BtoD(int n){
        int Decimal=0;
        int pow=0;
        while(n>0){
            int digit=n%10;
            int result=digit*(int)Math.pow(2,pow);
            Decimal+=result;
            n/=10;
            pow++;
        }
        System.out.println(Decimal);
    }
    public static void DtoB(int n){
        String Decimal="";
        String Binary="";
        while(n>0){
            int result=n%2;
            Decimal+=result;
            n/=2;
        }
        System.out.println(Decimal);
        for(int i=Decimal.length()-1;i>=0;i--){
            Binary+=Decimal.charAt(i);
        }
    System.out.println(Binary);
    }
    public static void DectoBin(int n){
        int binNum=0;
        int pow=0;
        while(n>0){
            int rem=n%2;
            binNum=binNum+(rem*(int)Math.pow(10,pow));
            n/=2;
            pow++;
        }
        System.out.println(binNum);
    }
    
    public static void main(String args[]){
        BtoD(111);
        DtoB(6);
        DectoBin(13);
    }
}
