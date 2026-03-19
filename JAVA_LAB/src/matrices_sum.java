import java.util.*;
public class matrices_sum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  no of rows & column :");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        int arr1[][]=new int[r][c];
        int sum[][]=new int [r][c];
        System.out.println("ENter values in array 1:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();

            }
        }
        System.out.println();
        System.out.println("ENter values in array 2:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr1[i][j]=sc.nextInt();

            }
        }
        System.out.println();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
               sum[i][j]=arr[i][j]+arr1[i][j];

            }
        }
        System.out.println("values of array 1:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }
        System.out.println();
        System.out.println("values of array 2:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr1[i][j]+" ");

            }
            System.out.println();
        }
        System.out.println();
        System.out.println("values of sum:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(sum[i][j]+" ");

            }
            System.out.println();
        }
        System.out.println();



    }
}