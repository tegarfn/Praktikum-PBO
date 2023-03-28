package pertemuan5;

public class Dosen extends Akun {
    private int nip;
    private String matkul;

    public Dosen(String nama, String alamat, String jenisKelamin, int umur, int nip, String matkul) {
        super(nama, alamat, jenisKelamin, umur);
        this.nip = nip;
        this.matkul = matkul;
    }

    public int getNip() {
        return nip;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }

    public String getMatkul() {
        return matkul;
    }

    public void setMatkul(String matkul) {
        this.matkul = matkul;
    }

    @Override
    void display() {
        System.out.print(this.nama + "\t");
        System.out.print(this.alamat + "\t");
        System.out.print(this.jenisKelamin + "\t\t");
        System.out.print(this.umur + "\t");
        System.out.print(this.nip + "\t");
        System.out.println(this.matkul);
    }
}
