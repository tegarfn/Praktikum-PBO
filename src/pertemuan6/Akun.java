package pertemuan6;

abstract class Akun {
    protected String nama, alamat, jenisKelamin;
    protected int umur;

    protected Akun(String nama, String alamat, String jenisKelamin, int umur) {
        this.nama = nama;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
        this.umur = umur;
    }

    protected String getNama() {
        return nama;
    }

    protected void setNama(String nama) {
        this.nama = nama;
    }

    protected String getAlamat() {
        return alamat;
    }

    protected void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    protected String getJenisKelamin() {
        return jenisKelamin;
    }

    protected void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    protected int getUmur() {
        return umur;
    }

    protected void setUmur(int umur) {
        this.umur = umur;
    }

    abstract void display();
}
