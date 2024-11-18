package cz.upce.fei.classes.bpalp.maybe;

public class Autobazar {

    private String jmeno;
    private Automobil[] nabidka;

    public Autobazar(String jmeno) {
        this.jmeno = jmeno;
        this.nabidka = new Automobil[0];
    }

    public void vypisAutobazar() {
        for (int i = 0; i < nabidka.length; i++) {
            if (nabidka[i] != null) {
                System.out.println(i + " = " + nabidka[i]);
            }
        }

    }

    public double prumernaSpotreba() {
        double sum = 0;
        int index = 0;
        for (int i = 0; i < nabidka.length; i++) {
            if (nabidka[i] != null) {
                sum += nabidka[i].getPrumernaSpotreba();
                ++index;
            }
        }
        return index > 0 ? sum / index : 0;
    }  //tohle poradil kolega během hodiny, na doučování jsem se ale teprve dozvěděl co to je + si to přepisuju přehledně abych v budoucnu věděl
    // for me:
    // if (index > 0){
    //   return sum/index;
    //} else {
    //  return 0;
    //}

    public void pridejAutomobil(Automobil noveAuto) {
        Automobil[] novejAutomobilArray = new Automobil[nabidka.length + 1];
        System.arraycopy(this.nabidka, 0, novejAutomobilArray, 0, nabidka.length);
        //menu mi nabidlo tohle^ misto manualniho kopirovani array, nevim jestli to je spravne, vidim to poprve
        novejAutomobilArray[nabidka.length] = noveAuto;
        nabidka = novejAutomobilArray;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public Automobil[] getAutomobily() {
        return nabidka;
    }

    public void setAutomobily(Automobil[] automobily) {
        this.nabidka = automobily;
    }

    @Override
    public String toString() {
        return "Autobazar{" + "jmeno=" + jmeno + ", automobily=" + nabidka + '}';
    }

    public double nejmensiSpotreba() {
        double nejmensiSpotreba = 1000;
        for (int i = 0; i < nabidka.length; i++) {
            if (nabidka[i] != null && nabidka[i].getPrumernaSpotreba() < nejmensiSpotreba) {
                nejmensiSpotreba = nabidka[i].getPrumernaSpotreba();
            }

        }
        return nejmensiSpotreba != 1000 ? nejmensiSpotreba : 0;
    }

    public int pocetAut() {
        int index = 0;
        for (int i = 0; i < nabidka.length; i++) {
            if (nabidka[i] != null) {
                index++;
            }

        }
        return index;
    }

    public boolean obsahujeVyrobce(String vyrobce) {

        for (int i = 0; i < nabidka.length; i++) {
            if (nabidka[i] != null && nabidka[i].getVyrobce().equals(vyrobce)) {
                return true;
            }
        }
        return false;
    }
}
