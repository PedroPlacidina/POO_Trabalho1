public class JurosCompostos {
    /*c) Desenvolva uma classe que seja capaz de calcular o juros compostos. */
    private double c;
    private double i;
    private double t;

    public JurosCompostos(double c, double i, double t) {
        this.c = c;
        this.i = i;
        this.t = t;
    }

    public double calculaJuros(){
        double m = c * Math.pow((1 + i/100), t);
        return m;
    }

    public double juros(){
        double j = calculaJuros() - c;
        return j;
    }

    
}
