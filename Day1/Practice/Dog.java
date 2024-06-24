public class Dog {
    String name;
    String breed;
    public Dog(String name,String breed){
        this.name=name;
        this.breed=breed;
        System.out.println("Name :"+name);
        System.out.println("Breed :"+breed);
    }
    void Dogset(String name,String breed){
        this.name=name;
        this.breed=breed;
    }
    void Dogget(){
        System.out.println("Name :"+this.name);
        System.out.println("Breed :"+this.breed);
    }
    public static void main(String[] args) {
        Dog obj1=new Dog("Jack","Pitbull");
        Dog obj2=new Dog("Tommy","German Shephard");
        obj1.Dogset("Oggy","Street");
        obj1.Dogget();
    }
}
