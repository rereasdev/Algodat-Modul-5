package sorting;

public class Pegawai {
    private String nama, jabatan;
    private float lama_kerja;
    public int gaji;
    
    public void gaji(String nama, String jabatan, float lama){
        this.nama = nama;
        this.jabatan = jabatan;
        this.lama_kerja = lama;
    }
    public String getNama() {
        return nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public float getLama_kerja() {
        return lama_kerja;
    }
    
}
