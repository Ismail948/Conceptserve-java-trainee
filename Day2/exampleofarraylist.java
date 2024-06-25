import java.util.ArrayList;
import java.util.Scanner;
public class exampleofarraylist {
    public static void main(String[] args) {
        ArrayList<Integer> abc=new ArrayList<>();
        ArrayList<Integer> def=new ArrayList<>();
        abc.add(0,3);
        abc.add(0,1);
        abc.add(1,2);
        def.add(4);
        def.add(5);
        def.add(6);
        abc.addAll(3,def);
        System.out.println("Elements of ArrayList:-->");
        for(int i=0;i<abc.size();i++){
            System.out.print(abc.get(i)+" ");
        }
        System.out.println("");
        System.out.println("Enter the value you want to check if it exists in the Arraylist");
        Scanner src=new Scanner(System.in);
        int check=src.nextInt();
        if(abc.contains(check)==true){
            System.out.println(check+" is Present at Index no.-> "+abc.indexOf(check));
        }
        else{
            System.out.println("Does not Exist");
        }
        abc.clear();
    }
}
