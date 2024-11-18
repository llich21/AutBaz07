package cz.upce.fei.classes.bpalp.maybe;

public class Automobil {

    private String vyrobce;
    private String modelVozu;
    private double prumernaSpotreba;

    public Automobil(String vyrobce, String modelVozu, double prumernaSpotreba) {
        this.vyrobce = vyrobce;
        this.modelVozu = modelVozu;
        this.prumernaSpotreba = prumernaSpotreba;

    }

    public String getVyrobce() {
        return vyrobce;
    }

    public void setVyrobce(String vyrobce) {
        this.vyrobce = vyrobce;
    }

    public String getModelVozu() {
        return modelVozu;
    }

    public void setModelVozu(String modelVozu) {
        this.modelVozu = modelVozu;
    }

    public double getPrumernaSpotreba() {
        return prumernaSpotreba;
    }

    public void setPrumernaSpotreba(double prumernaSpotreba) {
        this.prumernaSpotreba = prumernaSpotreba;
    }

    @Override
    public String toString() {
        return "Automobil{" + "vyrobce = " + vyrobce + ", modelVozu = " + modelVozu + ", prumernaSpotreba = " + prumernaSpotreba + '}';
    } //nechal jsem vypis takle, nevedel jestli chcete aby vypadal jinak

}
