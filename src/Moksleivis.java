import java.util.Arrays;

public class Moksleivis {
    private String vardas;
    private String pavarde;
    private String klase;
    private double[] pazymiai;

    Moksleivis() {}

    Moksleivis(String vardas, String pavarde, String klase, double[] pazymiai) {
        this.vardas   = vardas;
        this.pavarde  = pavarde;
        this.klase    = klase;
        this.pazymiai = pazymiai;
    }

    @Override
    public String toString() {
        String suformatuota = String.format("" +
                "Vardas: %-10s " +
                "Pavarde: %-10s " +
                "Klase: %-10s " +
                "Vidurkis: %-10.1f " +
                "Skolininkas: %-10b " +
                "Pazymiai: %-10s"
                ,vardas,pavarde,klase, apskaiciuotiMokinioPazymiuVidurki(),arSkolininkas(),Arrays.toString(pazymiai));
        return suformatuota;
    }

    public double apskaiciuotiMokinioPazymiuVidurki() {
        int    kiekis   = 0;
        double suma     = 0;
        double vidurkis;
        for (int i = 0; i < pazymiai.length; i++) {
            kiekis = kiekis + 1;
            suma = suma + pazymiai[i];
        }

        vidurkis = suma / kiekis;
        return vidurkis;
    }

    public boolean arSkolininkas (){
        boolean skolininkas;
        double vidurkis = apskaiciuotiMokinioPazymiuVidurki();
        if (vidurkis > 3.5){
            skolininkas = false;
        }else {
            skolininkas = true;
        }
        return skolininkas;
    }
    public void spauzdintiSarasa (Moksleivis[] sarasas){
        for (int i = 0; i < sarasas.length; i++){
            System.out.println(sarasas[i]);
        }
    }
    public String getVardas (){
        return vardas;
    }
    public void setVardas (String vardas){
        this.vardas = vardas;
    }
    public String getPavarde (){
        return pavarde;
    }
    public void setPavarde (String pavarde) {
        this.pavarde = pavarde;
    }
    public String getKlase (){
        return klase;
    }
    public void setKlase (String klase){
        this.klase = klase;
    }
}
