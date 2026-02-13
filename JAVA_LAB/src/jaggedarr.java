import java.util.*;
public class jaggedarr{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  no of rows & column :");
        int r=sc.nextInt();

        int arr[][]=new int[r][];
        for(int i=0;i<arr.length;i++){
            System.out.println("enter column length of" + (i+1) +"row"
            );
             int col=sc.nextInt();
            arr[i]=new int[col];
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println();
        System.out.println("values of array 1:");
        for(int i=0;i<r;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }
    }
}