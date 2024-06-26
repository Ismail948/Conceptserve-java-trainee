package Revision;

import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> obj1=new HashMap<>();
        obj1.put(1,"Karan");
        obj1.put(2,"Ismail");
        obj1.put(3,"Hamzah");
        obj1.put(5,"Mihir");
        int f=2;
        obj1.get(f);
        int i=0;
        for(i=1;i<=obj1.size();i++){
            try{
            System.out.print("Key:"+i);
            System.out.println("  Value: "+obj1.get(i));
            }
            catch(Exception e){
                System.out.println("Not found");
            }
        }
        for (Integer key : obj1.keySet()) {
            System.out.println("Key: " + key + ", Value: " + obj1.get(key));
        }
    }
}
