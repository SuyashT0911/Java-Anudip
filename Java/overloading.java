public class overloading {
    int add(int a, int b){
        return(a+b);
    }
    double add(double a, double b){
        return (a+b);
    }
    public static void main(String[] args) {
        overloading o= new overloading();
        System.out.println(o.add(4,6));
        System.out.println(o.add(4.5,5.5));
    }
}
