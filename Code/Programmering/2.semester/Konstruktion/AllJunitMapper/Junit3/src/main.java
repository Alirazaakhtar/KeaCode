import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int select;



        while (true) {

            System.out.println("Type a number to continue: ");
            select = scanner.nextInt();

            if(select == 1){
                System.out.println("this is menu 1");
            }
            if(select == 2){
                System.out.println("this is menu 2");
            }
            if(select == 3){
                System.out.println("this is menu 3");
            }
            if(select == 0){
                break;
            }
        }



    }

}
