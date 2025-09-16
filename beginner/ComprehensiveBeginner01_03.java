import java.util.Random;

class ComprehensiveBeginner01_03 {
    public static void main(String[] args){
        Random manRandom = new Random();
        int man = manRandom.nextInt(3) + 1;

        Random womanRandom = new Random();
        int woman = womanRandom.nextInt(3) + 1;

        Random childRandom = new Random();
        int child = childRandom.nextInt(3) + 1;

        if ((man == 3) && (woman == 2) && (child == 2)) {
              System.out.println("manが勝ちました。");
        } 
        else if ((man == 2) && (woman == 1) && (child == 1)) {
                System.out.println("manが勝ちました。");
            }
            else if ((man == 1) && (woman == 3) && (child == 3)) {
                System.out.println("manが勝ちました。");
            }

            else if ((woman == 3) && (man == 2) && (child == 2)) {
              System.out.println("womanが勝ちました。");
        } 
        else if ((woman == 2) && (man == 1) && (child == 1)) {
                System.out.println("womanが勝ちました。");
            }
            else if ((woman == 1) && (man == 3) && (child == 3)) {
                System.out.println("womanが勝ちました。");
            }

            else if ((child == 3) && (man == 2) && (woman == 2)) {
              System.out.println("childが勝ちました。");
        } 
        else if ((child == 2) && (man == 1) && (woman == 1)) {
                System.out.println("childが勝ちました。");
            }
            else if ((child == 1) && (woman == 3) && (man == 3)) {
                System.out.println("childが勝ちました。");
            } 


            else if ((man == 3) && (child == 2) && (woman == 3)) {
                System.out.println("manとwomanが勝ちました。");
            } 
            else if ((man == 3) && (child == 3) && (woman == 2)) {
                System.out.println("manとchildが勝ちました。");
            }
            else if ((man == 2) && (child ==  3) && (woman == 3)) {
                System.out.println("childとwomanが勝ちました。");
            } 
            
            else if ((man == 2) && (child == 1) && (woman == 2)) {
                System.out.println("manとwomanが勝ちました。");
            } 
            else if ((man == 2) && (child == 2) && (woman == 1)) {
                System.out.println("manとchildが勝ちました。");
            }
            else if ((man == 1) && (child ==  2) && (woman == 2)) {
                System.out.println("childとwomanが勝ちました。");
            }

            else if ((man == 1) && (child == 3) && (woman == 1)) {
                System.out.println("manとwomanが勝ちました。");
            } 
            else if ((man == 1) && (child == 1) && (woman == 3)) {
                System.out.println("manとchildが勝ちました。");
            }
            else if ((man == 3) && (child ==  1) && (woman == 1)) {
                System.out.println("childとwomanが勝ちました。");
            }


             else if ((man == 3) && (child == 3) && (woman == 3)) {
                System.out.println("あいこです。");
            } else if ((man ==  2) && (child == 2) && (woman == 2)) {
                System.out.println("あいこです。");
            } else if ((man == 1) && (child == 1) && (woman == 1)) {
                System.out.println("あいこです。");
            }else {
                System.out.println("あいこです。");
            }
            
     System.out.println(man);
     System.out.println(woman);
      System.out.println(child);
    }
}