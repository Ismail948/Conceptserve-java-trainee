public class throwserr {
    static void thrr (int i)throws ArrayIndexOutOfBoundsException{
        if(i<5){
            throw new ArrayIndexOutOfBoundsException("Hello"); 
        }
        if (i>5){
            throw new ArrayIndexOutOfBoundsException("World");
        }
    }
    public static void main(String[] args) {
        throwserr obj1= new throwserr();
        obj1.thrr(6);
    }
}
