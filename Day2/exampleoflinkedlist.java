import java.util.*;
public class exampleoflinkedlist {
    public static void main(String[] args) {
        LinkedList <Integer> abc= new LinkedList<>();
        abc.add(7);
        abc.add(8);
        abc.add(6);
        abc.addLast(5);
        for(int i=0;i<abc.size();i++){
            System.out.println(i+1+" element:- "+abc.get(i));;
        }
        // for (int i=0;i<abc.size();i++){
        //     int max = 0;
        //     int idOfMax = i;
        //     System.out.println(i+"number of loop");
        //    for(int j=i;j<abc.size();j++){
        //     System.out.println(abc.get(j));
        //     if(max<=abc.get(j)){
        //         max=abc.get(j);
        //         idOfMax=j;
        //     }
        //     int temp = abc.get(i);
        //     abc.set(i, abc.get(idOfMax));
        //     abc.set(idOfMax, temp);
        // }
            abc.sort(null);
            
    //     }
         System.out.println(abc);
    }
}
