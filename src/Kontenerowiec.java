import java.util.ArrayList;

public class Kontenerowiec {
    private ArrayList<Kontener> kontenery;
    public double max_speed_knots;
    public int maxKontenerow;
    public double maxWagaKontenerow_tony;
    public double wagaTeraz_tony;


    public Kontenerowiec(ArrayList<Kontener> kontenery,double max_speed_knots, int maxKontenerow, double maxWagaKontenerow_tony){
        this.kontenery = kontenery;
        this.max_speed_knots = max_speed_knots;
        this.maxKontenerow = maxKontenerow;
        this.maxWagaKontenerow_tony = maxWagaKontenerow_tony;

        if(kontenery.isEmpty()){
            this.wagaTeraz_tony = 0;
        }else{
            for(Kontener k : kontenery){
                this.wagaTeraz_tony = k.getMLadunku()*0.001 + k.getMLadunku()*0.001;
            }
        }
    }

    public void zaladujKontener(Kontener kontener)throws OverfillException{

        if(kontenery.size() + 1 <= maxKontenerow && wagaTeraz_tony + kontener.getMKont()*0.001+kontener.getMLadunku()*0.001 < maxWagaKontenerow_tony ){
            kontenery.add(kontener);
            this.wagaTeraz_tony = this.wagaTeraz_tony + kontener.getMLadunku()*0.001 + kontener.getMLadunku()*0.001;
        } else {
            throw new OverfillException("Ładunek pełny");
        }
    }
    public void zaladujListeKontenerow(ArrayList<Kontener> lista)throws OverfillException{
        for(Kontener k : lista){
            zaladujKontener(k);
        }
    }

    public void wymienKontener(int index, Kontener nowyKontener){
        kontenery.set(index, nowyKontener);
    }


    public ArrayList<Kontener> getKontenery() {
        return kontenery;
    }
    public void setKontenery(ArrayList<Kontener> kontenery) {
        this.kontenery = kontenery;
    }

    public double getMax_speed_knots() {
        return max_speed_knots;
    }
    public void setMax_speed_knots(double max_speed_knots) {
        this.max_speed_knots = max_speed_knots;
    }

    public int getMaxKontenerow() {
        return maxKontenerow;
    }
    public void setMaxKontenerow(int maxKontenerow) {
        this.maxKontenerow = maxKontenerow;
    }

    public double getMaxWagaKontenerow_tony() {
        return maxWagaKontenerow_tony;
    }
    public void setMaxWagaKontenerow_tony(){
        this.maxWagaKontenerow_tony = maxWagaKontenerow_tony;
    }

    public String Info() {
        return "Kontenerowiec:" +
                "Maksymalna prędkość w węzły: "+max_speed_knots+
                "Maksymalna ilość kontenerów: "+maxKontenerow+
                "Maksymalna waga łączna: "+maxWagaKontenerow_tony+
                "Teraźniejsza masa towaru"+wagaTeraz_tony;

    }

    public void zamienKontenerInnym(Kontenerowiec kontenerowiec1, Kontenerowiec kontenerowiec2, Kontener kontener){
        if(kontenerowiec1.getKontenery().contains(kontener)){
            kontenerowiec1.getKontenery().remove(kontener);
            kontenerowiec2.getKontenery().add(kontener);
        }else {
            System.out.println("Niema takiego kontenera na pierwszym kontenerowcu");
        }
    }

    public void rozladujKontener(Kontener Kontener, Kontenerowiec kontenerowiec){
        kontenerowiec.getKontenery().remove(Kontener);
    }
}
