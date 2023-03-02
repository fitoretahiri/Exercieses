package algorithms;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int nr=0;
        do {
            System.out.println("Shkruani sa fjali deshironi ti shtypni: ");
            nr = scanner.nextInt();
        }while(nr>=6);

        scanner.nextLine();
        String fjalia;
        for (int i=0;i<nr;i++){
            System.out.println("Shkruani fjaline: ");
            fjalia=scanner.nextLine();
            System.out.println(gjejShkronjenEPare(fjalia));
        }
    }

    public static char gjejShkronjenEPare(String fjalia){
        return fjalia.charAt(0);
    }
}
