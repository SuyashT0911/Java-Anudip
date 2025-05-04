class One {
    public void print_one() {
        System.out.println("Multi");
    }
}
class Two extends One {
    public void print_two() {
        System.out.println("level");
    }
}
class Three extends Two {
    public void print_three() {
        System.out.println("Inheritance");
    }
}
public class MultiLevelInheritance {
    public static void main(String[] args) {
        Three g = new Three();
        
        g.print_one();
        g.print_two();
        g.print_three();
    }
}