package pertemuan6;

final class Dosen extends Akun {
    private int nip;
    private String matkul;

    protected Dosen(String nama, String alamat, String jenisKelamin, int umur, int nip, String matkul) {
        super(nama, alamat, jenisKelamin, umur);
        this.nip = nip;
        this.matkul = matkul;
    }

    protected int getNip() {
        return nip;
    }

    protected void setNip(int nip) {
        this.nip = nip;
    }

    protected String getMatkul() {
        return matkul;
    }

    protected void setMatkul(String matkul) {
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
