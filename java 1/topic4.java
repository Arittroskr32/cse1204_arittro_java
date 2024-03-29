class Number {
    int x;
    static int y;

    void setdata(int a, int b) {
        this.x = a;
        this.y = b;
    }

    static void setdata1(int a, int b) {
        // x=a which cannot access x here.
        y = b;
    }

    void getdata() {
        System.out.println("x is:" + x + " and y is :" + y);
    }

    static void getdata1() {
        System.out.println("y is :" + y);
        // cannot access x here
        // System.out.println("x is :" + x);
    }
}

public class topic4 {
    public static void main(String[] args) {
        Number num = new Number();
        num.setdata(10, 5);
        num.setdata1(12, 57);
        num.getdata();
        num.getdata1();
    }
}
