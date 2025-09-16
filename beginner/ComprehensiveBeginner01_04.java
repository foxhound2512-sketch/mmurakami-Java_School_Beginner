class ComprehensiveBeginner01_04 {
        public static void main(String[] args) {
            System.out.print("何段>");
            int inputNum = new java.util.Scanner(System.in).nextInt();
            // 2. 終了させるための処理を書く
             if (inputNum > 5) {
                System.out.println("1 ~ 5までの整数を入力してください。");
                System.exit(0);
            }
             // 3. の処理を書く
            for (int i = 1; i <= inputNum; i++) { 
                // スペースを出力（右寄せ用）
                for (int j = 1; j <= inputNum - i; j++) {
                  System.out.print(" ");
                }
                // アスタリスクを出力（階段の段）
                for (int k = 1; k <= i; k++) {
                  System.out.print("*");
                }
                // 改行
                System.out.println();
            }
        }
    }
    