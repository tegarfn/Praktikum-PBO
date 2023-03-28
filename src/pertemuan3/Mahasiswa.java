package pertemuan3;

class Mahasiswa {
    private String nama;
    private int nim;
    private float ipk;

    public Mahasiswa(String nama, int nim, float ipk) {
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public void setIpk(float ipk) {
        this.ipk = ipk;
    }

    public String getNama() {
        return nama;
    }

    public float getIpk() {
        return ipk;
    }

    public int getNim() {
        return nim;
    }
}
