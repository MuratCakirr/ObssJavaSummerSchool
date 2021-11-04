import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter age:");
        int age = scan.nextInt();
        if(age>=60){
            System.out.println("old");
        }else {
            System.out.println("young");
        }


    }
}
