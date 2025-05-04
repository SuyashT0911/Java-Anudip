interface Coder{
    void WriteCode();
}
interface Tester{
    void TestCode();
}
class devOps implements Coder, Tester{
    @Override
    public void WriteCode(){
        System.out.println("Coder writes code");
    }
    @Override
    public void TestCode(){
        System.out.println("Tester test Code");
    }
    void deploy(){
        System.out.println("Deploy code");
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        devOps OP = new devOps();
        OP.WriteCode();
        OP.TestCode();
        OP.deploy();
    }
}