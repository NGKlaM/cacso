package Sochan;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so");
        int n = scanner.nextInt();
        int i = 2;
        while (i<=n){
           if  (i%2==0){
                System.out.println("la so chan"+i);
            }else if (i%2!=0){
                System.out.println("khong phai so chan"+i);
            }
           i++;
        }
    }
}
