public class evenCnt {
    int count;

    public static void main(String[] args) {
        example e1 = new example();
        example e2 = new example();
        example e3 = new example();
        //only one copy of count is exists and is 
    }
}

class example {
    static int count = 0;

    example() {
        count++;
        System.out.println(count);
    }
}