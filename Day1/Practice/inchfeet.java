public class inchfeet {
    private int inch;
    private int feet;
    public void dimension(int inches)
    {
        this.feet=inches/12;
        this.inch=inches%12;
        feetinch();
    }
    public void feetinch()
    {
        System.out.println(this.feet+"."+this.inch);
    }
    public static void main(String[] args) {
        inchfeet obj1=new inchfeet();
        obj1.dimension(73);
    }
}
