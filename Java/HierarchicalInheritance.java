class A{
    public void Aprinter(){
        System.out.println("Class A");
    }
}
class B extends A{
    public void Bprinter(){
        System.out.println("Class B");
    }
}
class C extends A{
    public void Cprinter(){
        System.out.println("Class C");
    }
}
class D extends A{
    public void Dprinter(){
        System.out.println("Class D");
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args) {
        B b1 = new B();
        b1.Aprinter();
        b1.Bprinter();

        C c1 = new C();
        c1.Aprinter();
        c1.Cprinter();

        D d1 = new D();
        d1.Aprinter();
        d1.Dprinter();
    }
}
