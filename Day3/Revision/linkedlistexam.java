package Revision;
import java.io.*;
import java.util.LinkedList;
public class linkedlistexam {
    public static void main(String[] args) {
        LinkedList<Integer> obj1=new LinkedList<>();
        obj1.add(1);
        obj1.add(2);
        System.out.println(obj1);
        obj1.remove(1);
        System.out.println(obj1);
    }
}
