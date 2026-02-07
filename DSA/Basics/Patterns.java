public class Patterns {
    // Hollow Rectangle Pattern
    public static void Hollow_Rectangle(int row, int col) {
        for (int i = 0; i < row; i++) { // prints rows
            for (int j = 0; j < col; j++) {
                if (i == 0 || i == row - 1 || j == 0 || j == col - 1) { // prints columns
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // Inverted Half Pyramid Pattern
    public static void Inverted_Half_Pyramid(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Inverted Half pyramid with numbers
    public static void Inverted_Half_Pyramid_Numbers(int row) {
        for (int i = 0; i <= row; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print(j);
            }
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void floydTriangle(int n) {
        int counter=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void BinaryTriangle(int n) {
        int counter=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                // if(counter%2==0){                //if else use kr k bhi ho gya
                //     System.out.print(0);
                // }else{
                //     System.out.print(1);
                // }
                // int res=(counter % 2 == 0) ? 0 : 1;              //ternary operator se bhi ho gya
                // System.out.print(res);
                System.out.print(counter%2);                       //or ye to kamaal hi ho gya
                counter++;
            }
            System.out.println();
        }
    }

    public static void butterflyPattern(int n){
        for(int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //reversing pattern
        for(int i=n;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void rhombus(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollowRhombus(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<i; j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

        public static void diamondPattern(int n){
            for(int i=1;i<=n;i++){
                for(int j=n;j>=i+1;j--){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
            //reverse pattern of above
            for(int i=n;i>=1;i--){
                for(int j=n;j>=i+1;j--){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    public static void main(String args[]) {
        // System.out.println("-> Hollow Rectangle Pattern");
        // Hollow_Rectangle(4, 6);
        // System.out.println("-> Inverted Half Pyramid Pattern");
        // Inverted_Half_Pyramid(5);
        // System.out.println("-> Inverted Half pyramid with numbers");
        // Inverted_Half_Pyramid_Numbers(5);
        // System.out.println("Floyd's Triagnle");
        // floydTriangle(5);
        // BinaryTriangle(5);
        // butterflyPattern(4);
        // rhombus(5);
        // hollowRhombus(5);
        diamondPattern(4);
    }
}
