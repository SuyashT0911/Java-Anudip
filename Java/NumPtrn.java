public class NumPtrn {
    public static void main(String[] args) {
        int numb = 1;
        for (int i = 0; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(numb);
                numb++;
            }
            System.out.println();
        }
    }
}
