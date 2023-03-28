package pertemuan6;

final class Mahasiswa extends Akun {
    private int nim;
    private float ipk;

    protected Mahasiswa(String nama, String alamat, String jenisKelamin, int umur, int nim, float ipk) {
        super(nama, alamat, jenisKelamin, umur);
        this.nim = nim;
        this.ipk = ipk;
    }

    protected int getNim() {
        return nim;
    }

    protected void setNim(int nim) {
        this.nim = nim;
    }

    protected float getIpk() {
        return ipk;
    }

    protected void setIpk(float ipk) {
        this.ipk = ipk;
    }

    @Override
    void display() {
        System.out.print(this.nama + "\t");
        System.out.print(this.alamat + "\t");
        System.out.print(this.jenisKelamin + "\t\t");
        System.out.print(this.umur + "\t");
        System.out.print(this.nim + "\t");
        System.out.println(this.ipk);
    }
}
