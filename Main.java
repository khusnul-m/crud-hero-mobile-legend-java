import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Hero> heroList = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("\n=== MENU CRUD HERO ===");
            System.out.println("1. Tambah Hero");
            System.out.println("2. Lihat Semua Hero");
            System.out.println("3. Ubah Hero");
            System.out.println("4. Hapus Hero");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    tambahHero();
                    break;
                case 2:
                    tampilkanHero();
                    break;
                case 3:
                    ubahHero();
                    break;
                case 4:
                    hapusHero();
                    break;
                case 5:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);
    }

    static void tambahHero() {
        System.out.print("ID Hero: ");
        int id = input.nextInt(); input.nextLine();

        System.out.print("Nama Hero: ");
        String nama = input.nextLine();

        System.out.print("Kategori (MAGE, ASSASSIN, FIGHTER, TANK, MARKSMAN, SUPPORT): ");
        String kategori = input.nextLine().toUpperCase();

        System.out.print("Gender (MALE/FEMALE): ");
        String gender = input.nextLine().toUpperCase();

        heroList.add(new Hero(id, nama, kategori, gender));
        System.out.println("Hero berhasil ditambahkan!");
    }

    static void tampilkanHero() {
        if (heroList.isEmpty()) {
            System.out.println("Belum ada data hero.");
        } else {
            for (Hero h : heroList) {
                System.out.println(h);
            }
        }
    }

    static void ubahHero() {
        System.out.print("Masukkan ID Hero yang ingin diubah: ");
        int id = input.nextInt(); input.nextLine();

        for (Hero h : heroList) {
            if (h.getIdHero() == id) {
                System.out.print("Nama Hero baru: ");
                h.setNamaHero(input.nextLine());

                System.out.print("Kategori baru: ");
                h.setKategori(input.nextLine().toUpperCase());

                System.out.print("Gender baru: ");
                h.setGender(input.nextLine().toUpperCase());

                System.out.println("Data hero berhasil diubah.");
                return;
            }
        }

        System.out.println("Hero dengan ID tersebut tidak ditemukan.");
    }

    static void hapusHero() {
        System.out.print("Masukkan ID Hero yang ingin dihapus: ");
        int id = input.nextInt(); input.nextLine();

        for (Hero h : heroList) {
            if (h.getIdHero() == id) {
                heroList.remove(h);
                System.out.println("Data hero berhasil dihapus.");
                return;
            }
        }

        System.out.println("Hero dengan ID tersebut tidak ditemukan.");
    }
}
