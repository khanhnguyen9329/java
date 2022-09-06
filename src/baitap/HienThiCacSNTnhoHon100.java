package baitap;

public class HienThiCacSNTnhoHon100 {
    public static void main(String[] args) {
//       int number = 2 ;
//        while (number < 100)
        for (int j = 2; j < 100; j++) {
            boolean check = true;
            for (int i = 2; i < j; i++) {
                if (j % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check == true) {
                System.out.println(j + "là số nt");

            }

        }

    }

}

