import java.util.Scanner;

public class DoWhile {
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Mời bạn nhập vào số nguyên dương : ");
    int n = Integer.parseInt(scanner.nextLine());
    int i = 2;
    do{
        if(n < 2){
           System.out.println("ko phai so nguyen");
        }else {
            if (n % i == 0) {
                System.out.println("n khong phai so nguyen");
            }

        }
        i++;
    }while(i < n);
    System.out.println("n là so nguyen");
}
}
