
package if1.pkg10118042.latihan40.warna;

import java.util.Scanner;

/**
 * @author
 * Nama  : Dhimas Aji Ghairrahmat
 * Kelas : IF1
 * NIM   : 10118042
 * Deskripsi Program : Program ini berfungsi untuk menentukan kepribadian melalui warna
 * 
 */
public class IF110118042Latihan40Warna {

    public static void main(String[] args) {
    String warnaTraits;
        String nama;
        
        Scanner masuk = new Scanner(System.in);
        Warna id = new Warna();

        System.out.printf("%sYUK %sCEK %sKEPRIBADIANMU %sDARI %sWARNA %sFavoritmu%s%n",Warna.RED,Warna.GREEN,Warna.YELLOW,Warna.CYAN,Warna.PURPLE,Warna.BLUE,Warna.RESET);
        System.out.println(Warna.BGRED+Warna.WHITE+"       MERAH       ");
        System.out.println(Warna.BGGREEN+Warna.WHITE+"       HIJAU       ");
        System.out.println(Warna.BGYELLOW+Warna.WHITE+"       KUNING      ");
        System.out.println(Warna.BGBLUE+Warna.WHITE+"       BIRU        ");
        System.out.println(Warna.BGMAGENTA+Warna.WHITE+"       UNGU        ");
        
        System.out.print(Warna.RESET+"\nPILIH WARNA FAVORITMU\t: ");
        warnaTraits = masuk.nextLine();
        
        System.out.print("NAMA KAMU\t\t: ");
        nama = masuk.nextLine();
        
        System.out.printf("\n===HASIL TEST KEPRIBADIAN %s===%n",nama.toUpperCase());
        id.warnaKepribadian(warnaTraits);
    }

}
