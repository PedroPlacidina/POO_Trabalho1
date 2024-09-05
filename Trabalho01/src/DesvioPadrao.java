public class DesvioPadrao {
    /*b) Desenvolva uma classe que seja capaz de calcular o desvio padrão. */
    
    private double[] n;

    public DesvioPadrao(double[] n) {
        this.n = n;
    }

    public double calculaMedia(){
        double soma = 0.0;
        for (int i = 0; i < n.length; i++){
            soma += n[i];
        }
        return soma / n.length;
    }

    public double calculaDesvioPadrao(){
        double media = calculaMedia();
        double soma = 0.0;
        double raiz;
        for (int i = 0; i < n.length; i++){
            soma += Math.pow(n[i] - media, 2);
        }
        raiz = Math.sqrt(soma / n.length);

        return raiz;
    }

}
