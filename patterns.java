import java.util.Scanner;

public class patterns{

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row=sc.nextInt();

        for(int i=1;i<=row;i++){
            for(int j=i;j<=row;j++){
                System.out.print("  ");
            }
            for(int l=1;l<=i;l++){
                if(i%2!=0) System.out.print("a ");
                else System.out.print("b ");
            }
            for(int m=1;m<i;m++){
                if(i%2!=0) System.out.print("a ");
                else System.out.print("b ");
            }
            System.out.println("");
        }

    }
}