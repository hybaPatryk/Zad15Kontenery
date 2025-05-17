import java.sql.SQLOutput;

public class CKontener extends Kontener{
    private Ladunek ladunek;
    private double temperatur;

    public CKontener(double mLadunku_kg, double maxMLadunku_kg, int mKont_kg, int wysokoscKont_cm, int serokoscKont_cm, Ladunek ladunek, double temperatur) {
        super(mLadunku_kg, maxMLadunku_kg, mKont_kg, wysokoscKont_cm, serokoscKont_cm);
        setId("KON-C-"+getId());
        this.ladunek=ladunek;
        setTemperatur(temperatur);
    }

    @Override
    public void rozladujLadunek() {
        super.rozladujLadunek();
    }

    public Ladunek getLadunek() {
        return ladunek;
    }
    public void setLadunek(Ladunek ladunek) {
        this.ladunek = ladunek;
    }

    public double getTemperatur() {
        return temperatur;
    }
    public void setTemperatur(double temperatur) {
        if(temperatur >= ladunek.getTemp()){
            this.temperatur=temperatur;
        }else{
            System.out.println("Temperatura za mała");
        }
    }
}
