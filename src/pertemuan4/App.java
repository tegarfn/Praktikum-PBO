package pertemuan4;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class App {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Mahasiswa> listMhs = new ArrayList<>();
    static ArrayList<Dosen> listDsn = new ArrayList<>();

    static Message msg = new Message();

    static void menu() throws IOException {
        int select;

        System.out.print("\n[1] Tambah\n[2] Lihat\n[3] Edit\n[4] Hapus\n[5] Exit\n\nMasukkan Pilihan : ");
        select = Integer.parseInt(input.readLine());

        switch (select) {
            case 1 -> tambah();
            case 2 -> lihat(3);
            case 3 -> ubah();
            case 4 -> hapus();
            case 5 -> System.exit(0);
            default -> msg.noChoice();
        }
    }

    static void tambah() throws IOException {
        System.out.print("[1] Tambah Data Mahasiswa\n[2] Tambah Data Dosen\nMasukkan Pilihan : ");
        int select = Integer.parseInt(input.readLine());
        if (select == 1) {
            System.out.print("Masukkan Nama : ");
            String nama = input.readLine();
            System.out.print("Masukkan Alamat : ");
            String alamat = input.readLine();
            System.out.print("Masukkan Jenis Kelamin : ");
            String jenisKelamin = input.readLine();
            System.out.print("Masukkan Umur : ");
            int Umur = Integer.parseInt(input.readLine());
            System.out.print("Masukkan NIM : ");
            int nim = Integer.parseInt(input.readLine());
            System.out.print("Masukkan IPK : ");
            float ipk = Float.parseFloat(input.readLine());
            listMhs.add(new Mahasiswa(nama, alamat, jenisKelamin, Umur, nim, ipk));
            msg.add(nama);

        } else if (select == 2) {
            System.out.print("Masukkan Nama : ");
            String nama = input.readLine();
            System.out.print("Masukkan Alamat : ");
            String alamat = input.readLine();
            System.out.print("Masukkan Jenis Kelamin : ");
            String jenisKelamin = input.readLine();
            System.out.print("Masukkan Umur : ");
            int umur = Integer.parseInt(input.readLine());
            System.out.print("Masukkan NIP : ");
            int nip = Integer.parseInt(input.readLine());
            System.out.print("Masukkan Mata Kuliah : ");
            String matkul = input.readLine();
            listDsn.add(new Dosen(nama, alamat, jenisKelamin, umur, nip, matkul));
            msg.add(nama);

        } else {
            msg.noChoice();
        }
    }

    static int lihat(int showData) throws IOException {
        if (showData == 1) {
            if (listMhs.isEmpty()) {
                msg.noData();
            } else {
                for (int i = 0; i < listMhs.size(); i++) {
                    System.out.println("No\tNama\tAlamat\t\tJenis Kelamin\tUmur\tNIM\t\tIPK");
                    System.out.print(i + 1 + "\t");
                    System.out.print(listMhs.get(i).getNama() + "\t");
                    System.out.print(listMhs.get(i).getAlamat() + "\t");
                    System.out.print(listMhs.get(i).getJenisKelamin() + "\t\t");
                    System.out.print(listMhs.get(i).getUmur() + "\t");
                    System.out.print(listMhs.get(i).getNim() + "\t");
                    System.out.println(listMhs.get(i).getIpk() + "\t");
                }
            }
        } else if (showData == 2) {
            if (listDsn.isEmpty()) {
                msg.noData();
            } else {
                for (int i = 0; i < listDsn.size(); i++) {
                    System.out.println("No\tNama\tAlamat\t\tJenis Kelamin\tUmur\tNIP\t\tMata kuliah");
                    System.out.print(i + 1 + "\t");
                    System.out.print(listDsn.get(i).getNama() + "\t");
                    System.out.print(listDsn.get(i).getAlamat() + "\t");
                    System.out.print(listDsn.get(i).getJenisKelamin() + "\t\t");
                    System.out.print(listDsn.get(i).getUmur() + "\t");
                    System.out.print(listDsn.get(i).getNip() + "\t");
                    System.out.println(listDsn.get(i).getMatkul() + "\t");
                }
            }
        } else if (showData == 3) {
            System.out.println("== Data Mahasiswa ==");
            lihat(1);
            System.out.println("== Data Dosen ==");
            lihat(2);
        } else {
            msg.noChoice();
        }
        return showData;
    }

    static void ubah() throws IOException {
        System.out.print("[1] Ubah Data Mahasiswa\n[2] Ubah Data Dosen\nMasukkan Pilihan : ");
        int select = Integer.parseInt(input.readLine());

        if (select == 1) {
            lihat(select);
            System.out.print("Masukkan nama Mahasiswa : ");
            String findName = input.readLine();
            for (Mahasiswa mhs : listMhs) {
                if (mhs.getNama().equals(findName)) {
                    System.out.print("Masukkan Nama : ");
                    mhs.setNama(input.readLine());
                    System.out.print("Masukkan Alamat : ");
                    mhs.setAlamat(input.readLine());
                    System.out.print("Masukkan Jenis Kelamin : ");
                    mhs.setJenisKelamin(input.readLine());
                    System.out.print("Masukkan Umur : ");
                    mhs.setUmur(Integer.parseInt(input.readLine()));
                    System.out.print("Masukkan NIM : ");
                    mhs.setNim(Integer.parseInt(input.readLine()));
                    System.out.print("Masukkan IPK : ");
                    mhs.setIpk(Float.parseFloat(input.readLine()));
                    msg.update(mhs.getNama());
                } else {
                    msg.noData(findName);
                }
            }
        } else if (select == 2) {
            System.out.print("Masukkan nama Dosen : ");
            String findName = input.readLine();
            for (Dosen dsn : listDsn) {
                if (dsn.getNama().equals(findName)) {
                    System.out.print("Masukkan Nama : ");
                    dsn.setNama(input.readLine());
                    System.out.print("Masukkan Alamat : ");
                    dsn.setAlamat(input.readLine());
                    System.out.print("Masukkan Jenis Kelamin : ");
                    dsn.setJenisKelamin(input.readLine());
                    System.out.print("Masukkan Umur : ");
                    dsn.setUmur(Integer.parseInt(input.readLine()));
                    System.out.print("Masukkan NIP : ");
                    dsn.setNip(Integer.parseInt(input.readLine()));
                    System.out.print("Masukkan Mata Kuliah : ");
                    dsn.setMatkul(input.readLine());
                    msg.update(dsn.getNama());
                } else {
                    msg.noData(findName);
                }
            }
        } else {
            msg.noChoice();
        }
    }

    static void hapus() throws IOException {
        System.out.print("[1] Ubah Data Mahasiswa\n[2] Ubah Data Dosen\nMasukkan Pilihan : ");
        int select = Integer.parseInt(input.readLine());
        if (select == 1) {
            lihat(select);
            System.out.print("Masukkan nama Mahasiswa : ");
            String findName = input.readLine();
            for (int i = 0; i < listMhs.size(); i++) {
                if (listMhs.get(i).getNama().equals(findName)) {
                    listMhs.remove(i);
                    msg.delete(findName);
                } else {
                    msg.noData(findName);
                }
            }
        } else if (select == 2) {
            lihat(select);
            System.out.print("Masukkan nama Dosen : ");
            String findName = input.readLine();
            for (int i = 0; i < listDsn.size(); i++) {
                if (listDsn.get(i).getNama().equals(findName)) {
                    listDsn.remove(i);
                    msg.delete(findName);
                } else {
                    msg.noData(findName);
                }
            }
        } else {
            msg.noChoice();
        }
    }

    public static void main(String[] args) throws IOException {
        while (true) {
            menu();
        }
    }
}