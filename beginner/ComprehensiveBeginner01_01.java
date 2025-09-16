import java.util.Scanner;

class ComprehensiveBeginner01_01 {
    public static void main(String[] args ) {
        /*
        Scanner sc = new Scanner(System.in, "Shift-JIS");
        System.out.print("0、1、2を入力してください > ") ;
        int inputNum = sc.nextInt();
        int arr[] = {1,10,50};
        System.out.println("1番目の要素は" + arr[inputNum] + "で、２倍にすると" + (arr[inputNum] * 2) + "になり、3で割ったあまりは" + (arr[inputNum] & 3)  + "です。");
        System.out.println("2番目の要素は" + arr[inputNum] + "で、２倍にすると" + (arr[inputNum] * 2) + "になり、3で割ったあまりは" + (arr[inputNum] & 3)  + "です。");
        System.out.println("3番目の要素は" + arr[inputNum] + "で、２倍にすると" + (arr[inputNum] * 2) + "になり、3で割ったあまりは" + (arr[inputNum] & 3)  + "です。");
        sc.close();
        */
        Scanner sc = new Scanner(System.in, "Shift-JIS");
        System.out.print("1を入力してください > ") ;
        int a = sc.nextInt();
        System.out.print("50を入力してください > ") ;
        int b = sc.nextInt();
        System.out.print("10を入力してください > ");
        int c = sc.nextInt();

        int arr[] ={a , b , c};
        System.out.println("1番目の要素は" + arr[0] + "で、２倍にすると" + (arr[0] * 2) + "になり、3で割ったあまりは" + (arr[0] & 3)  + "です。");
        System.out.println("1番目の要素は" + arr[1] + "で、２倍にすると" + (arr[1] * 2) + "になり、3で割ったあまりは" + (arr[1] & 3)  + "です。");
        System.out.println("1番目の要素は" + arr[2] + "で、２倍にすると" + (arr[2] * 2) + "になり、3で割ったあまりは" + (arr[2] & 3)  + "です。");
    }
}