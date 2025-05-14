package Modelo;

public class MonedaCambio {
    private double usd;
    private double brl;
    private double ars;
    private double cop;

    public MonedaCambio(MonedasApi monedasApi){
        this.usd = monedasApi.rates().usd();
        this.brl = monedasApi.rates().brl();
        this.cop = monedasApi.rates().cop();
        this.ars = monedasApi.rates().ars();
    }

    public double getUsd() {
        return usd;
    }

    public double getBrl() {
        return brl;
    }

    public double getCop() {
        return cop;
    }

    public double getArs() {
        return ars;
    }

    @Override
    public String toString() {
        return
                "(usd=" + usd +
                ", brl=" + brl +
                ", ars=" + ars +
                ", cop=" + cop + ")";
    }
}
