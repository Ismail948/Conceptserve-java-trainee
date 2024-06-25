import java.util.Scanner;
import java.util.ArrayList;
public class exmpleof2darray {
    exmpleof2darray(int[][] a,int row,int col){
        int i,j;
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                System.out.print(" "+a[i][j]+" ");
            }
            System.out.println("");
        }

    }
    public static void main(String[] args) {
        int [][]a;
        int row,col,i,j,f=1;
        Scanner src=new Scanner(System.in);
        System.out.println("2D Array------->");
        System.out.println("Enter Number of Rows :");
        row=src.nextInt();
        System.out.println("Enter Number of Columns :");
        col=src.nextInt();
        a= new int[row][col];
        System.out.println("Enter Data--->");
        for(i=0;i<row;i++){
            System.out.println("Enter"+f+"Row");
            for(j=0;j<col;j++){
                a[i][j]=src.nextInt();
            }
            f=i+2;
        }
        exmpleof2darray obj1=new exmpleof2darray(a,row,col);
    }
}
