import java.util.Scanner;

public class Main {
    public static void main() {
        ArrayLinkedList list = new ArrayLinkedList();
        boolean mati = false;
        while (mati != true) {
            System.out.println("1. Tambah Buku");
            System.out.println("2. Hapus Buku");
            System.out.println("3. Cetak Daftar Buku");
            System.out.println("4. Keluar");

            Scanner sc = new Scanner(System.in);
            System.out.println("Pilih Operasi");
            int inputan = sc.nextInt();

            switch (inputan) {
                case 1:
                    System.out.println("Tambah depan/belakang?");
                    System.out.println("1. Tambah Depan");
                    System.out.println("2. Tambah Belakang");
                    int inputan3 = sc.nextInt();
                    switch (inputan3) {
                        case 1:
                            System.out.println("Masukkan Judul Buku:");
                            String judul = sc.next();

                            System.out.println("Masukkan Penulis:");
                            String penulis = sc.next();

                            System.out.println("Masukkan Tahun Terbit:");
                            int tahunTerbit = sc.nextInt();

                            list.tambahDepan(new Buku(judul, penulis, tahunTerbit));
                            break;

                        case 2:
                            System.out.println("Masukkan Judul Buku:");
                            String judul2 = sc.next();

                            System.out.println("Masukkan Penulis:");
                            String penulis2 = sc.next();

                            System.out.println("Masukkan Tahun Terbit:");
                            int tahunTerbit2 = sc.nextInt();

                            list.tambahBelakang(new Buku(judul2, penulis2, tahunTerbit2));
                            break;

                    }

                    break;
                case 2:
                    System.out.println("Hapus depan/belakang?");
                    System.out.println("1. Hapus Depan");
                    System.out.println("2. Hapus Belakang");
                    int inputan2 = sc.nextInt();
                    switch (inputan2) {
                        case 1:
                            list.hapusDepan();
                            break;

                        case 2:
                            list.hapusBelakang();
                            break;
                    }

                    break;
                case 3:
                    list.print();
                    break;
                case 4:
                    mati = true;
                    break;

                default:
                    break;
            }
        }

    }
}
