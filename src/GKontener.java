public class GKontener extends Kontener implements IHazardNotifier{
    public double cisTeraz;
    public GKontener(double mLadunku_kg, double maxMLadunku_kg, int mKont_kg, int wysokoscKont_cm, int serokoscKont_cm,double cisTeraz) {
        super(mLadunku_kg, maxMLadunku_kg, mKont_kg, wysokoscKont_cm, serokoscKont_cm);
        setId("KON-G-"+getId());
        this.cisTeraz = cisTeraz;
    }


    public void NotifyHazard(){
        System.out.println("Hazard");
    }
    @Override
    public void rozladujLadunek(){
        setMLadunku(getMLadunku()*0.05);
    }

    public double getCisTeraz() {
        return cisTeraz;
    }
    public void setCisTeraz(double cisTeraz) {
        this.cisTeraz = cisTeraz;
    }
}
