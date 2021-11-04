import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double grade = 0;
        double total = 0;
        double count = 0;
        double average = 0;
        System.out.println("Enter grade:");

        while (true){
            grade = scan.nextDouble();
            if(grade==101)
                break;
            else if( 100<grade || grade<0){
                System.out.println("Please enter valid grade");
                continue;
            }
            total += grade;
            count++;
        }
        average = total / count;
        System.out.println(average);

    }
}
