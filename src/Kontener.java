public abstract class Kontener {
    private double mLadunku_kg;
    private double maxMLadunku_kg; // tylko masa samego kontenera
    private int mKont_kg;
    private int wysokoscKont_cm;
    private int serokoscKont_cm;
    private static int IdNum = 0;
    private String Id;

    public Kontener(double mLadunku_kg, double maxMLadunku_kg, int mKont_kg, int wysokoscKont_cm, int serokoscKont_cm) {
        this.Id = String.valueOf(getNextId());
        this.mLadunku_kg = mLadunku_kg;
        this.maxMLadunku_kg = maxMLadunku_kg;
        this.mKont_kg = mKont_kg;
        this.serokoscKont_cm = serokoscKont_cm;
        this.wysokoscKont_cm = wysokoscKont_cm;
    }

    public int getNextId() {
        return IdNum++;
    }

    public void rozladujLadunek() {
        mLadunku_kg = 0;
    }

    public double getMLadunku() {
        return mLadunku_kg;
    }
    public void setMLadunku(double mLadunku_kg) {
        this.mLadunku_kg = mLadunku_kg;
    }

    public double getMaxMLadunku() {
        return maxMLadunku_kg;
    }
    public void setMaxMLadunku(double maxMLadunku_kg) {
        this.maxMLadunku_kg = maxMLadunku_kg;
    }

    public int getMKont() {
        return mKont_kg;
    }
    public void setMKont(int mKont_kg) {
        this.mKont_kg = mKont_kg;
    }

    public int getWysokoscKont() {
        return wysokoscKont_cm;
    }
    public void setWysokoscKont(int wysokoscKont_cm) {
        this.wysokoscKont_cm = wysokoscKont_cm;
    }

    public int getSerokoscKont() {
        return serokoscKont_cm;
    }
    public void setSerokoscKont(int serokoscKont_cm) {
        this.serokoscKont_cm = serokoscKont_cm;
    }

    public String getId() {
        return Id;
    }
    public void setId(String Id) {
        this.Id = Id;
    }

    @Override
    public String toString() {
        return "Kontener{" +
                "mLadunku_kg=" + mLadunku_kg +
                ", maxMLadunku_kg=" + maxMLadunku_kg +
                ", mKont_kg=" + mKont_kg +
                ", wysokoscKont_cm=" + wysokoscKont_cm +
                ", serokoscKont_cm=" + serokoscKont_cm +
                ", Id='" + Id + '\'' +
                '}';
    }
}