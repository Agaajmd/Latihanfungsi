import java.util.Scanner;

public class latihanfungsi {
    static void tampilNama(int id) {
        String namaPelanggan[] = { "Ali", "Budi", "Dani", "Edi" };
        System.out.println(namaPelanggan[id - 1]);
    }

    static void hitungTarif(int JumlahPakai) {
        int harga = 0;
        if (JumlahPakai >= 0 && JumlahPakai <= 10) {
            JumlahPakai = 10;
            harga = JumlahPakai * 2000;
        } else if (JumlahPakai >= 11 && JumlahPakai <= 20) {
            JumlahPakai = 10;
            harga = JumlahPakai * 3000;
        } else if (JumlahPakai >= 21 && JumlahPakai <= 30) {
            JumlahPakai = 10;
            harga = JumlahPakai * 4000;
        } else if (JumlahPakai >= 31) {
            JumlahPakai = 10;
            harga = JumlahPakai * 5000;

        }
        System.out.println(harga);
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        try (Scanner A = new Scanner(System.in)) {
            boolean status = true;

            do {
                System.out.println("Masukkan ID pelanggan: ");
                int namaPelanggan = A.nextInt();
                System.out.println("ID pelanggan : " + namaPelanggan);
                System.out.println("Nama Pelanggan : ");
                tampilNama(namaPelanggan);

                System.out.println("Masukkan Banyak Pemakaian Air : ");
                int JumlahPakai = A.nextInt();
                System.out.println("Jumlah tarif : ");
                hitungTarif(JumlahPakai);

                System.out.println("ingin coba lagi ? Y/N");
                String ulang = A.next();
                if (ulang.equalsIgnoreCase("n")) {
                    status = false;
                } else {
                    status = true;
                }
            } while (status);

            A.close();

        }

    }
}
