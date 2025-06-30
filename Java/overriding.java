class Animal{
    void sound(){
        System.out.println("Animal");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog");
    }
}
public class overriding{
    public static void main(String[] args) {
        Animal A= new Dog();
        A.sound();
    }
}