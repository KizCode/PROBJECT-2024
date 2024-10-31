public class SepedaBeam {
    private int id;
    private double dayaBaterai;
    private double bujur;
    private double lintang;
    private boolean adaHelm;
    private String status;

    public SepedaBeam(int id) {
        this.id = id;
        this.status = "parkir"; // Set default status to "parkir"
    }

    public int getId() {
        return id;
    }

    public double getDayaBaterai() {
        return dayaBaterai;
    }

    public void setDayaBaterai(double dayaBaterai) {
        this.dayaBaterai = dayaBaterai;
    }

    public double getBujur() {
        return bujur;
    }

    public void setBujur(double bujur) {
        this.bujur = bujur;
    }

    public double getLintang() {
        return lintang;
    }

    public void setLintang(double lintang) {
        this.lintang = lintang;
    }

    public boolean isAdaHelm() {
        return adaHelm;
    }

    public void setAdaHelm(boolean adaHelm) {
        this.adaHelm = adaHelm;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if (status.equals("parkir") || status.equals("dipakai") || status.equals("rusak")) {
            this.status = status;
        } else {
            System.out.println("Status tidak valid");
        }
    }
}
