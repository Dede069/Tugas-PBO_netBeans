package data;

public class Progres {
    private String kd_progres;
    private String tgl;
    private String tgl_kirim;
    private String kd_kecamatan;
    private String desa;
    private String kd_hewan;
    private String pemilik;
    private String kd_spesimen;
    private String kd_lab;
    private int jml;
    private String kd_jns_uji;

    public Progres(String kd_progres, String tgl, String tgl_kirim, String kd_kecamatan, String desa, String kd_hewan,
                  String pemilik, String kd_spesimen, String kd_lab, int jml, String kd_jns_uji) {
        this.kd_progres = kd_progres;
        this.tgl = tgl;
        this.tgl_kirim = tgl_kirim;
        this.kd_kecamatan = kd_kecamatan;
        this.desa = desa;
        this.kd_hewan = kd_hewan;
        this.pemilik = pemilik;
        this.kd_spesimen = kd_spesimen;
        this.kd_lab = kd_lab;
        this.jml = jml;
        this.kd_jns_uji = kd_jns_uji;
    }

    // Getters and Setters
    public String getKd_progres() {
        return kd_progres;
    }

    public void setKd_progres(String kd_progres) {
        this.kd_progres = kd_progres;
    }

    public String getTgl() {
        return tgl;
    }

    public void setTgl(String tgl) {
        this.tgl = tgl;
    }

    public String getTgl_kirim() {
        return tgl_kirim;
    }

    public void setTgl_kirim(String tgl_kirim) {
        this.tgl_kirim = tgl_kirim;
    }

    public String getKd_kecamatan() {
        return kd_kecamatan;
    }

    public void setKd_kecamatan(String kd_kecamatan) {
        this.kd_kecamatan = kd_kecamatan;
    }

    public String getDesa() {
        return desa;
    }

    public void setDesa(String desa) {
        this.desa = desa;
    }

    public String getKd_hewan() {
        return kd_hewan;
    }

    public void setKd_hewan(String kd_hewan) {
        this.kd_hewan = kd_hewan;
    }

    public String getPemilik() {
        return pemilik;
    }

    public void setPemilik(String pemilik) {
        this.pemilik = pemilik;
    }

    public String getKd_spesimen() {
        return kd_spesimen;
    }

    public void setKd_spesimen(String kd_spesimen) {
        this.kd_spesimen = kd_spesimen;
    }

    public String getKd_lab() {
        return kd_lab;
    }

    public void setKd_lab(String kd_lab) {
        this.kd_lab = kd_lab;
    }

    public int getJml() {
        return jml;
    }

    public void setJml(int jml) {
        this.jml = jml;
    }

    public String getKd_jns_uji() {
        return kd_jns_uji;
    }

    public void setKd_jns_uji(String kd_jns_uji) {
        this.kd_jns_uji = kd_jns_uji;
    }
}
