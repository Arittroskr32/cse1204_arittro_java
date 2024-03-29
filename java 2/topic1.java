class A {
    int x;

    public A() {
        x = 0;
    }

    public A(int x) {
        this.x = x;
    }

    public int getX() {
        return x + 10;
    }
}

class B extends A {
    int x = 20;

    public B(int y) {
        this.x = y;
    }

    public int getX() {
        System.out.println(super.getX());
        // this statement to call getX() of class A in class B
        return (x + 10);
    }

    // getAX is using for display x of class A in class B
    public void getAX() {
        System.out.println(super.x);
    }
}

public class topic1 {
    public static void main(String[] args) {
        B b = new B(15);
        // to call parameterized constructor of in class B
        b.getAX();
        System.out.println(b.getX());

    }
}