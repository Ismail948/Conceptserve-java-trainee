public class exampleofpolymorphism {
    void Car(){
        String [] a={"BMW","Mercedes","Toyota","Hyundai"};
        System.out.println("Cars :");
        for(int i=0;i<a.length;i++){
            System.out.println("->"+a[i]);
        }
    }
    void Dog(){
        String [] b={"German Shephard","Husky","Pitbull"};
        System.out.println("Dogs :");
        for(int i=0;i<b.length;i++){
            System.out.println("->"+b[i]);
        }
    }  
    public static void main(String args[]){
        exampleofpolymorphism obj1= new exampleofpolymorphism();
        //Same object is used for different functionalities;
        obj1.Car();
        obj1.Dog();
    }  
}

