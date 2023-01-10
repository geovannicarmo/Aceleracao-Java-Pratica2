import java.util.Scanner;

public class Piramide {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);  
            int number = sc.nextInt();  
           System.out.println(sc);

            for(int i = 1; i<=number; i++){
                for(int j = 1; j<=i; j++){
                    System.out.print(i);
                }
                System.out.println();
            }
    }    
}


