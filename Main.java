import java.util.*;
//SourceCodeTugasAkhirProjectPraktikumPemrogramanDasar
/*
Nama : Muhamad Irkham Maulana
NIM : 225150601111009
Kelas : PTI-A
 */
public class Main {
    public static void main(String[] args) {
        Scanner masukkan = new Scanner(System.in);
        System.out.println("================================");
        System.out.println("        GAME TEBAK ANGKA        ");
        System.out.println("================================");
        System.out.println("Pilih tingkat kesulitan !");
        System.out.println("1. Easy\n2. Medium\n3. Hard\n4. Insane");
        System.out.print("Pilihan : ");


        int level = masukkan.nextInt();
        System.out.println("=====================================================");
        int score = 1;
        switch (level) {
            case 1:
                System.out.println("Anda harus menebak 1 dari 4 angka yang tersedia dengan range 10!");
                level = 10;
                score = 10;
                break;
            case 2:
                System.out.println("Anda harus menebak 1 dari 4 angka yang tersedia dengan range 15!");
                level = 15;
                score = 20;
                break;
            case 3:
                System.out.println("Anda harus menebak 1 dari 4 angka yang tersedia dengan range 20!");
                level = 20;
                score = 30;
                break;
            case 4:
                System.out.println("Anda harus menebak 1 dari 4 angka yang tersedia dengan range 25!");
                level = 25;
                score = 40;
                break;

            default:
                System.out.println("Inputan yang kamu input tidak ada, silahkan menebak pada level easy");
                System.out.println("Anda harus menebak 1 dari 4 angka dengan range 10!");
                level = 10;
                score = 10;
                break;
        }

        int array[][] = new int[2][2];

        //Randomisasi data pada array 2 dimensi
        System.out.println("Mohon tunggu system masih memproses...");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                array[i][j] = (int) (Math.random() * level);
                System.out.println();
            }
        }
        System.out.println("\nRandomisasi selesai, silahkan mengikuti perintah selanjutnya");
        System.out.println("=====================================================");

        //Mini Games Tebak Tebakan
        System.out.println("Tebak angka yang tersembunyi dan dapatkan point mu !");
        int tebakan = 0;
        int kesempatan = 3;
        boolean menang = false;

        while (kesempatan > 0) {
            System.out.println("============================");
            System.out.print("Masukkan tebakan anda: ");
            tebakan = masukkan.nextInt();
            if (tebakan == array[0][0] || tebakan == array[0][1] || tebakan == array[1][0] || tebakan == array[1][1]) {
                menang = true;
                break;
            }
            kesempatan--;
            System.out.println("Tebakan anda salah :(");
            if (kesempatan > 0) {
                System.out.println("Kesempatan anda tersisa: " + kesempatan);
            }
        }
        System.out.println("");
        System.out.println("====================================");
        if (menang) {
            System.out.println("Selamat anda berhasil menebak angka yang tersembunyi!!");
            System.out.println("Nilai total point anda : " + kesempatan * 100 * score);
        } else {
            System.out.println("Maaf anda gagal menebak angka ! ");
        }
        System.out.println("====================================");
    }
}