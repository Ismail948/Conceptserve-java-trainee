import java.util.*;
public class exampleofstringbuffer {
    public static void main(String[] args) {
        StringBuffer abc=new StringBuffer("Hello");
        System.out.println(abc.capacity());
        System.out.println(abc.length());
        System.out.println(abc);
        abc.deleteCharAt(4);
        abc.append("World");
        System.out.println(abc);
    }
}
