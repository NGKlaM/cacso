package Sochan;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so :");
        int n = scanner.nextInt();
        int  i = 0;
        do {
            if (i%2==0){
                System.out.println("la so chan"+i);
            }else if (i%2!=0){
                System.out.println("khong phai so chan"+i);
            }
            i++;
        }while (i!=n);

    }
}
