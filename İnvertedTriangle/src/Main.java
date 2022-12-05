import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz:");
        n = scan.nextInt();

        for(int i =n;i>=1;i--){
            for(int j=0;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int h=(2*i)-1;h>=1;h--){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
