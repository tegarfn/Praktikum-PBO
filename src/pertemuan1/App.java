package pertemuan1;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class App {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<String> Mahasiswa = new ArrayList<>();

    static void menu() throws IOException {
        int select;

        System.out.print("[1] Tambah\n[2] Lihat\n[3] Edit\n[4] Hapus\n[5] Exit\n\nMasukkan Pilihan : ");
        select = Integer.parseInt(input.readLine());

        switch (select) {
            case 1 -> tambah();
            case 2 -> lihat();
            case 3 -> ubah();
            case 4 -> hapus();
            case 5 -> System.exit(0);
            default -> System.out.println("Invalid Choice...");
        }
    }

    static void tambah() throws IOException {
        System.out.print("Masukkan Nama : ");
        String nama = input.readLine();

        Mahasiswa.add(nama);
    }

    static void lihat() throws IOException {
        if (Mahasiswa.isEmpty()) {
            System.out.println("No Data Found...");
        } else {
            System.out.println("No.\tNama");
            for (int i = 0; i < Mahasiswa.size(); i++) {
                System.out.print(i + 1 + "\t");
                System.out.println(Mahasiswa.get(i));
            }
        }
    }

    static void ubah() throws IOException {
        lihat();

        System.out.print("Pilih nomor yang ingin diedit : ");
        int select = Integer.parseInt(input.readLine());
        select--;

        System.out.print("Masukkan Nama : ");
        Mahasiswa.set(select, input.readLine());
    }

    static void hapus() throws IOException {
        lihat();

        System.out.print("Pilih nomor yang ingin dihapus : ");
        int select = Integer.parseInt(input.readLine());
        select--;

        Mahasiswa.remove(select);
    }

    public static void main(String[] args) throws IOException {
        while (true) {
            menu();
        }
    }
}