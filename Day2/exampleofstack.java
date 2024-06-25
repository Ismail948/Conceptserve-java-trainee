import java.util.*;  
public class exampleofstack {
    public static void main(String[] args) {
        Stack <Integer> stk = new Stack<>();  
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.pop();
        System.out.println("stack: " + stk);  
        for(int i=0;i<stk.size();i++){
            System.out.println(stk.elementAt(i));
        }
        //pushing elements into the stack
    }
        
}
