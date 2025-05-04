class solarSystem{
    void All_Revolves(){
        System.out.println("Planet revolves in solar System");
    }
}
class Earth extends solarSystem{
    void Earth_revolves(){
        System.out.println("Earth revolves solar system");
    }
}
class Mars extends solarSystem{
    void Mars_revolves(){
        System.out.println("Mars revolves solar system");
    }
}
class Moon extends Earth{
    void Moon_revolves(){
        System.out.println("Moon revolves arround Earth");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        Earth e = new Earth();
        Mars m = new Mars();
        Moon o = new Moon();
        e.All_Revolves();
        e.Earth_revolves();

        m.All_Revolves();
        m.Mars_revolves();

        o.All_Revolves();
        o.Moon_revolves();
    }
}
