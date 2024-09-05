public class Bhaskara {
    /*a) Desenvolva uma classe que seja capaz de resolver uma equação do 2 grau. (ax^2 + bx + c)*/

    private double a;
    private double b;
    private double c;

    public Bhaskara(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double[] calcula(){
        double delta = b * b - 4 * a * c;
        double[] raizes = new double[2];
        if (delta >= 0){
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            raizes[0] = x1;
            raizes[1] = x2;

        }else {
            System.out.println("A equação não tem raízes reais");
            return null;
        }

        return raizes;
    }

}