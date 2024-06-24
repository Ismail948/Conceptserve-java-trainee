class pyramid{
    public pyramid(int val){
        int i,j,q,f=0;
        // for(int i=0;i<=val;i++){
        //     for(int j=0;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println("");
        // }
        for(i=val;i>=0;i--){
            for(j=0;j<=i;j++){
                System.out.print(" ");
            }
            for(q=0;q<=f;q++){
                System.out.print("*");
            }
            for(int g=1;g<=f;g++){
                System.out.print("*");
            }
            f++;
            System.out.println(" ");
            
        }
        
    }
    public static void main(String[] args) {
        pyramid obj1=new pyramid(5);
    }
}