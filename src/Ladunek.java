public class Ladunek {
    private String nazwa;
    private double temp;

    public Ladunek(String nazwa, double temp, boolean danger) {
        this.nazwa = nazwa;
        this.temp = temp;
    }

    public String getNazwa() {
        return nazwa;
    }
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getTemp() {
        return temp;
    }
    public void setTemp(double temp) {
        this.temp = temp;
    }
}
