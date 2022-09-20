package Sochan;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so: ");
        int n = scanner.nextInt();
        for (int i=0;i<=n;i++){
            if (i%2==0){
                System.out.println("la so chan"+i);
            }else if (i%2!=0){
                System.out.println("khong phai so chan"+i);
            }
        }
    }


}
