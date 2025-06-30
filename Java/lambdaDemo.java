interface lambda{
    void say();
}
public class lambdaDemo{
    public static void main(String[] args) {
        lambda L = () -> System.out.println("Lambda is saying somthing");
        L.say();
    }
}