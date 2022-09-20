import java.util.Scanner;

public class SoNguyenTo {
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so: ");
        int n = scanner.nextInt();

        int check = KiemTra(n);

        if( check == 1 ) System.out.println((int)n + " la so nguyen to" ) ;
        else System.out.println(n+ " khong phai la so nguyen to" ) ;
    }
    private static int KiemTra(int n) {
int j = 1;
        if (n <2) return j = 0;
        int i = 2;
        for (i=2;i<n;i++){
            if (n%i==0 ){
                j = 0;
                break;
            }
            i++;
        }
        return j;
    }
}

