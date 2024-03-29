interface AI {
    void PrintA();
}

interface BI {
    void PrintB();
}

interface CI {
    void PrintC();
}

class A implements AI {
    public void PrintA() {
        System.out.println("This is in class A");
    }
}

class B extends A {
    public void PrintB() {
        System.out.println("This is in class B");
    }
}

class C extends B {
    public void PrintC() {
        System.out.println("This is in class C");
    }
}

public class topic2 {
    public static void main(String[] args) {
        C obj = new C();
        obj.PrintA();
        obj.PrintB();
        obj.PrintC();
    }
}
