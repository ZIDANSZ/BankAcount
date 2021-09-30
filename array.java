import java.util.Scanner;

public class array {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("x :");
        int x=input.nextInt();

        Scanner inpu =new Scanner(System.in);
        System.out.print("y : ");
        int y=inpu.nextInt();
        x+=y;
        System.out.println("sum= "+x);
        x-=y;
        System.out.println("sub= "+x);
        x*=y;
        System.out.println("mult= "+x);
        x%=y;
        System.out.println("mod= "+x);



    }





}
