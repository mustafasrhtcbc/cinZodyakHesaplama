import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int dt,sonuc;
        Scanner scan=new Scanner(System.in);
        System.out.print("Doğum Tarihinizi Giriniz:");
        dt=scan.nextInt();
        sonuc=dt%12;
        switch (sonuc) {
            case 0:
                System.out.print("zodyak burcunuz Maymun");
                break;
            case 1:
                System.out.print("zodyak burcunuz horoz");
                break;

            case 2:
                System.out.print("zodyak burcunuz köpek");
                break;
        
            case 3:
                System.out.print("zodyak burcunuz domuz");
                break;
        
            case 4:
                System.out.print("zodyak burcunuz fare");
                break;

            case 5:
                System.out.print("zodyak burcunuz öküz");
                break;
        
            case 6:
                System.out.print("zodyak burcunuz kaplan");
                break;
        
            case 7:
                System.out.print("zodyak burcunuz tavşan");
                break;

            case 8:
                System.out.print("zodyak burcunuz ejderha");
                break;
        
            case 9:
                System.out.print("zodyak burcunuz yılan");
                break;
        
            case 10:
                System.out.print("zodyak burcunuz at");
                break;

            case 11:
                System.out.print("zodyak burcunuz koyun");
                break;
        
            default:
            System.out.println("hatalı bir giriş yaptınız");
                break;
        }
        scan.close();


    }
}
