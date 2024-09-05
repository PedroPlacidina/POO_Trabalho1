public class Main {
    public static void main(String[] args){
        /* 
        Bhaskara b = new Bhaskara(5, 5, 1);
        double[] raizes = b.calcula();

        if (raizes != null) {
            System.out.printf("X1: %.2f %n", raizes[0]);
            System.out.printf("X2: %.2f %n", raizes[1]);
        } */
        
        /* 
        double[] n = {5, 8, 10, 15, 17};
        DesvioPadrao d = new DesvioPadrao(n);

        System.out.printf("Desvio Padrão: %.2f" ,d.calculaDesvioPadrao());*/

        JurosCompostos j = new JurosCompostos(1400, 7, 5);

        System.out.printf("Montante Final: %.2f %n",j.calculaJuros());
        System.out.printf("Juros: %.2f",j.juros());


    }
}
