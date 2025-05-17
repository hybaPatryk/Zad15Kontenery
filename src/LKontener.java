public class LKontener extends Kontener implements IHazardNotifier {
    private boolean dangerLadunek;

    public LKontener(double mLadunku_kg, double maxMLadunku_kg, int mKont_kg, int wysokoscKont_cm, int serokoscKont_cm) {
        super(mLadunku_kg, maxMLadunku_kg, mKont_kg, wysokoscKont_cm, serokoscKont_cm);
        setId("KON-"+"L"+getId());
        this.dangerLadunek = dangerLadunek;
    }

    @Override
    public void NotifyHazard(){
        System.out.println("Hazard");
    }

    public boolean isDangerLadunek() {
        return dangerLadunek;
    }

    public void setDangerLadunek(boolean dangerLadunek) {
        this.dangerLadunek = dangerLadunek;
    }

    public void zaladujLadunek(){
        double cap;
        if (dangerLadunek) {
            cap = 0.5;
        }else{
            cap = 0.9;
        }
        try{
            if(this.getMLadunku() > this.getMaxMLadunku()*cap){
                throw new OverfillException("Set for certain fluid capacity exceded");
            }
            else {
                this.setMLadunku(this.getMLadunku());
            }
        }
        catch (OverfillException e){
            NotifyHazard();
        }
    }
}
