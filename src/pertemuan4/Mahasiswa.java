package pertemuan4;

public class Mahasiswa extends Akun {
    private int nim;
    private float ipk;

    public Mahasiswa(String nama, String alamat, String jenisKelamin, int umur, int nim, float ipk) {
        super(nama, alamat, jenisKelamin, umur);
        this.nim = nim;
        this.ipk = ipk;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public float getIpk() {
        return ipk;
    }

    public void setIpk(float ipk) {
        this.ipk = ipk;
    }
}
