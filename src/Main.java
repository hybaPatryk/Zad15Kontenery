import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LKontener lKontener1 = new LKontener(1000,2000,5,300,200,false);
        LKontener lKontener2 = new LKontener(1000,2000,5,300,200,false);
        LKontener lKontener3 = new LKontener(1000,2000,5,300,200,false);
        lKontener1.zaladujLadunek(300);
        ArrayList<Kontener> listaKontenerow1 = new ArrayList<>();
        listaKontenerow1.add(lKontener1);
        listaKontenerow1.add(lKontener2);
        listaKontenerow1.add(lKontener3);
        Kontenerowiec kontenerowiec1 = new Kontenerowiec(null, 100, 10, 10000);
        Kontenerowiec kontenerowiec2 = new Kontenerowiec(null, 100, 10, 10000);
        kontenerowiec1.zaladujListeKontenerow(listaKontenerow1);
        kontenerowiec1.rozladujKontener(lKontener1, kontenerowiec1);
        lKontener1.rozladujLadunek();
        kontenerowiec1.zamienKontenerInnym(kontenerowiec1, kontenerowiec2, lKontener3);
        kontenerowiec1.wymienKontener(0,lKontener3);
        lKontener1.toString();
        kontenerowiec2.Info();

    }
}