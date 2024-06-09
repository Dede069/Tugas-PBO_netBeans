package data;

public class Arsip {
    private String kd_arsip;
    private String arsip;

    public Arsip(String kd_arsip, String arsip) {
        this.kd_arsip = kd_arsip;
        this.arsip = arsip;
    }

    public String getKd_arsip() {
        return kd_arsip;
    }

    public String getArsip() {
        return arsip;
    }

    public void setArsip(String arsip) {
        this.arsip = arsip;
    }

    @Override
    public String toString() {
        return "Arsip{" +
                "kd_arsip='" + kd_arsip + '\'' +
                ", arsip='" + arsip + '\'' +
                '}';
    }
}
