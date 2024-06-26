public class basicofstring {
    public static void main(String[] args) {
        String abc="hello";
        System.out.println(abc);
        abc+="World";
        System.out.println(abc);
        System.out.println(1+1+abc);
        System.out.println(abc+1+1);
        StringBuffer def=new StringBuffer();
        def.append(abc);
        System.out.println(def);
        def.append("Asia Pacific");
        System.out.println(def);
    }
}
