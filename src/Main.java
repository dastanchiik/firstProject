import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner a = new Scanner(System.in);
        int q = a.nextInt();
        int w = a.nextInt();
        while (q>w){
            q++;
            if (q%2==1){
                System.out.println(q);


            }
        }
        }
    }


