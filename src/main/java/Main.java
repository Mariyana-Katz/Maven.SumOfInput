import java.util.Scanner;

public class Main {

    public static void main( String[] args){
        Main main = new Main();
        compute();

    }

    public static void compute(){
        int num;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        num = scanner.nextInt();

        for (int i = 0; i<= num; i++){
            sum = sum+1;

        }
        System.out.println(sum);




    }
}
