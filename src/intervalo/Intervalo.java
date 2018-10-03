package intervalo;

public class Intervalo {
    private double linf, lsup;

    public Intervalo(){ }

    public Intervalo(double lsup) {
        if (lsup >= linf){
            this.lsup = lsup;
        }
    }

    public Intervalo(double lsup, double linf) {
        if (lsup >= linf){
            this.lsup = lsup;
            this.linf = linf;
        }
    }

    public Intervalo(Intervalo i) {
        lsup = i.getLsup();
        linf = i.getLinf();
    }

    public double getLinf() {
        return linf;
    }

    public void setLinf(double linf) {
        this.linf = linf;
    }

    public double getLsup() {
        return lsup;
    }

    public void setLsup(double lsup) {
        this.lsup = lsup;
    }

    @Override
    public String toString() {
        return "Intervalo{" +
                "límite inferior =" + linf +
                ", límite superior =" + lsup +
                '}';
    }

    public double longitud() {
        double l = Math.abs(this.getLinf() - this.getLsup());
        return l;
    }

    public boolean igual(Intervalo i) {
        return(this.getLsup() == i.getLsup() && this.getLinf() == i.getLinf());
    }

    public boolean mismaLongitud(Intervalo i) {
        return (this.longitud() == i.longitud());
    }

    public void desplazar(double d) {
        this.setLinf(linf + d);
        this.setLsup(lsup + d);
    }

    public boolean incluido(double d){
        return (d >= getLinf() && d <= getLsup());
    }

    public boolean incluido(Intervalo i){
        return ((i.getLinf() >= this.getLinf()) && (i.getLsup() <= this.getLsup()));
    }

    public void union(Intervalo i){
        
    }
}
