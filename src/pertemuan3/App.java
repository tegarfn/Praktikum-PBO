package pertemuan3;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class App {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Mahasiswa> list = new ArrayList<>();

    static Message msg = new Message();

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
            default -> msg.noChoice();
        }
    }

    static void tambah() throws IOException {
        System.out.print("Masukkan Nama : ");
        String nama = input.readLine();
        System.out.print("Masukkan NIM : ");
        int nim = Integer.parseInt(input.readLine());
        System.out.print("Masukkan IPK : ");
        float ipk = Float.parseFloat(input.readLine());

        Mahasiswa mhs = new Mahasiswa(nama, nim, ipk);
        list.add(mhs);
        msg.add();
    }

    static void lihat() throws IOException {
        if (list.isEmpty()) {
            msg.noData();
        } else {
            for (int i = 0; i < list.size(); i++) {
                System.out.print(i + 1 + "\t");
                System.out.print(list.get(i).getNama() + "\t");
                System.out.print(list.get(i).getNim() + "\t");
                System.out.print(list.get(i).getIpk() + "\t");
            }
        }
    }

    static void ubah() throws IOException {
        lihat();

        System.out.print("Pilih nomor yang ingin diedit : ");
        int select = Integer.parseInt(input.readLine());
        select--;

        System.out.print("Masukkan Nama : ");
        list.get(select).setNama(input.readLine());
        System.out.print("Masukkan NIM : ");
        list.get(select).setNim(Integer.parseInt(input.readLine()));
        System.out.print("Masukkan IPK : ");
        list.get(select).setIpk(Float.parseFloat(input.readLine()));

        msg.update();
    }

    static void hapus() throws IOException {
        lihat();

        System.out.print("Pilih nomor yang ingin dihapus : ");
        int select = Integer.parseInt(input.readLine());
        select--;

        list.remove(select);
        msg.delete();
    }

    public static void main(String[] args) throws IOException {
        while (true) {
            menu();
        }
    }
}