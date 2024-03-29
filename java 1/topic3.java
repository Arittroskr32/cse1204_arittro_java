class Data {
    private int x;

    public void setdata(int a) {
        this.x = a;
    }

    public int getdata() {
        return x;
    }
}

public class topic3 {
    public static void main(String[] args) {
        Data aa = new Data();
        // aa.x=10;
        aa.setdata(10);
        System.out.println(aa.getdata());
    }
}
