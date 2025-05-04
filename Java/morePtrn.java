public class morePtrn {
    public static void main(String[] args) {
        // int numb = 1;
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
                // numb++;
            }
            System.out.println();
        }
    }
}
