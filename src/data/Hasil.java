package data;

public class Hasil {
    private String kd_hasil;
    private String kd_arsip;
    private String no_surat;
    private String kd_progres;
    private String tgl_jawab;
    private String hasil;
    private String kd_penyakit;
    private int jml_diagnosa;

    // Constructor
    public Hasil(String kd_hasil, String kd_arsip, String no_surat, String kd_progres, String tgl_jawab, String hasil, String kd_penyakit, int jml_diagnosa) {
        this.kd_hasil = kd_hasil;
        this.kd_arsip = kd_arsip;
        this.no_surat = no_surat;
        this.kd_progres = kd_progres;
        this.tgl_jawab = tgl_jawab;
        this.hasil = hasil;
        this.kd_penyakit = kd_penyakit;
        this.jml_diagnosa = jml_diagnosa;
    }

    // Getters and Setters
    public String getKd_hasil() {
        return kd_hasil;
    }

    public void setKd_hasil(String kd_hasil) {
        this.kd_hasil = kd_hasil;
    }

    public String getKd_arsip() {
        return kd_arsip;
    }

    public void setKd_arsip(String kd_arsip) {
        this.kd_arsip = kd_arsip;
    }

    public String getNo_surat() {
        return no_surat;
    }

    public void setNo_surat(String no_surat) {
        this.no_surat = no_surat;
    }

    public String getKd_progres() {
        return kd_progres;
    }

    public void setKd_progres(String kd_progres) {
        this.kd_progres = kd_progres;
    }

    public String getTgl_jawab() {
        return tgl_jawab;
    }

    public void setTgl_jawab(String tgl_jawab) {
        this.tgl_jawab = tgl_jawab;
    }

    public String getHasil() {
        return hasil;
    }

    public void setHasil(String hasil) {
        this.hasil = hasil;
    }

    public String getKd_penyakit() {
        return kd_penyakit;
    }

    public void setKd_penyakit(String kd_penyakit) {
        this.kd_penyakit = kd_penyakit;
    }

    public int getJml_diagnosa() {
        return jml_diagnosa;
    }

    public void setJml_diagnosa(int jml_diagnosa) {
        this.jml_diagnosa = jml_diagnosa;
    }
}
