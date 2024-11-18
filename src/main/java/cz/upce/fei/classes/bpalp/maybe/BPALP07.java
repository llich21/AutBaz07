package cz.upce.fei.classes.bpalp.maybe;

public class BPALP07 {

    public static void main(String[] args) {

        Autobazar autobazar1 = new Autobazar("Autobazos");
        Automobil automobil = new Automobil("Skoda", "Octavia", 3.9);
        Automobil automobil2 = new Automobil("Mazda", "8", 6.9);
        Automobil automobil3 = new Automobil("Bentley", "123", 4.7);

        autobazar1.pridejAutomobil(automobil);
        autobazar1.pridejAutomobil(automobil2);
        autobazar1.pridejAutomobil(automobil3);
        autobazar1.vypisAutobazar();
        System.out.println("Prumerna spotreba = " + autobazar1.prumernaSpotreba());
        System.out.println("Nejmensi spotreba z počtu " + autobazar1.pocetAut() + " aut, je: " + autobazar1.nejmensiSpotreba());
        System.out.println(autobazar1.obsahujeVyrobce("Prdel"));
    }

}
