package data;

public class Hewan {
    private String kd_hewan;
    private String hewan;

    public Hewan(String kd_hewan, String hewan) {
        this.kd_hewan = kd_hewan;
        this.hewan = hewan;
    }

    // Getters and Setters
    public String getKd_hewan() {
        return kd_hewan;
    }

    public void setKd_hewan(String kd_hewan) {
        this.kd_hewan = kd_hewan;
    }

    public String getHewan() {
        return hewan;
    }

    public void setHewan(String hewan) {
        this.hewan = hewan;
    }
}
