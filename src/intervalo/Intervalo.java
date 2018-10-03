package intervalo;

/*Author
    Sergio Valerian
 */

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
        return "Intervalo{" + "límite inferior =" + linf +
                ", límite superior =" + lsup +
                '}';
    }

    public double longitud() {
        return Math.abs(this.linf - this.lsup);
    }

    public boolean igual(Intervalo i) {
        return(this.lsup == i.getLsup() && this.linf == i.getLinf());
    }

    public boolean mismaLongitud(Intervalo i) {
        return (this.longitud() == i.longitud());
    }

    public void desplazar(double d) {
        this.setLinf(linf + d);
        this.setLsup(lsup + d);
    }

    public boolean incluido(double d){
        return (d >= this.linf && d <= this.lsup);
    }

    public boolean incluido(Intervalo i) {
        return ((i.getLinf() >= this.linf) && (i.getLsup() <= this.lsup));
    }

    public Intervalo union(Intervalo i) {
        if(this.esComun(i)) {
            return new Intervalo(this.getLinf(), this.getLsup());
        }
        else return null;
    }

    public void interseccion(Intervalo i) {

    }

    //Metodos adicionales

    public boolean esComun(Intervalo i) {
        return (this.lsup >= i.getLinf() || this.linf <= i.getLsup());
    }

    public double devLimSup(Intervalo i) {
        return Math.min(this.linf, i.getLinf());
    }

    public double devLimInf(Intervalo i) {
        return Math.max(this.lsup, i.getLsup());
    }

    public double devLimInfComun(Intervalo i) {

    }

    public double devLimSupComun(Intervalo i) {

    }
}
