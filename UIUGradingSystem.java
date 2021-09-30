import java.util.Scanner;

public class UIUGradingSystem {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Your mark: ");
        int mark=s.nextInt();
        //System.out.print("Enter Your mark: ");
        if(mark<55){
            System.out.println("You are fail in this course");
        }
        else if (mark>=55&&mark<=57){
            System.out.println("You have got D(plain)"+" & You obtain 1.00");
        }
        else if (mark>=58&&mark<=61){
            System.out.println("You have got D+"+" & You obtain 1.33");
        }
        else if (mark>=62&&mark<=65){
            System.out.println("You have got C-"+" & You obtain 1.67");
        }
        else if (mark>=66&&mark<=69){
            System.out.println("You have got C(plain"+" & You obtain 2.00");
        }
        else if (mark>=70 &&mark<=73){
            System.out.println("You have got C+"+" & You obtain 2.33");
        }
        else if (mark>=74&&mark<=77){
            System.out.println("You have got B-"+" & You obtain 2.67");
        }
        else if (mark>=78&&mark<=81){
            System.out.println("You have got B(plain)"+" & You obtain 3.00");
        }
        else if (mark>=82&&mark<=85){
            System.out.println("You have got B+"+" & You obtain 3.33");
        }
        else if (mark>=86&&mark<=89){
            System.out.println("You have got A-"+ " & You obtain 3.67");
        }
        else if (mark>=90&&mark<=100){
            System.out.println("You have got A"+" & You obtain 4.00");
        }
    }


}
