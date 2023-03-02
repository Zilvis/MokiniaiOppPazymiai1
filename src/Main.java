public class Main {
    public static void main(String[] args) {
        double []moksleivisPazymiai  = {2,2,2,6,1,1,1,2};
        double []moksleivisPazymiai2 = {3,6,10,9.2,5};
        double []moksleivisPazymiai3 = {2,6,9,3,7,8,8};
        Moksleivis moksleivis  = new Moksleivis("Petras","Petrauskas","2b" ,moksleivisPazymiai);
        Moksleivis moksleivis2 = new Moksleivis("Ona"   ,"Butkute"   ,"10A",moksleivisPazymiai2);
        Moksleivis moksleivis3 = new Moksleivis("Zita"  ,"Petrute"   ,"9c" ,moksleivisPazymiai3);

        Moksleivis []moksleiviai = { moksleivis,moksleivis2,moksleivis3 };

        Moksleivis m = new Moksleivis();
        m.spauzdintiSarasa(moksleiviai);
    }
}
//3. Turime mokinių (10) sąrašą:
//
//        pavardė;
//        vardas;
//        klasė;
//        pažymiai (sarase[]);
//        vidurkis (turi būti suskaičiuojamas).
//
//        3.1. Pagal mokinių turimus pažymius reikia apskaičiuoti vidurkius.
//        3.2. Sukurti funkciją, skaičiuojančią skolininkus. Skolininkas yra toks moksleivis, kurio pažymių vidurkis yra mažesnis už 3.5.