public class bmiindex {
    public bmiindex(double feet,int weight){
        double height=feet/3.281;
        double BMI=(weight/(height*height));
        System.out.println(BMI);
    }
    public static void main(String[] args) {
        bmiindex obj1=new bmiindex(6,70);
    }
}
