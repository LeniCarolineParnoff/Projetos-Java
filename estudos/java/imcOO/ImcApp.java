package imcOO;

import Imc.Imc;

public class ImcApp {
    public static void main(String[] args) {
//       double peso = 50;
//       double altura = 1.70;
//
//        double imc = (peso / (altura*altura));
//        System.out.println("O IMC é " + imc);

        double peso;
        double altura;
        Imc imc1 = new Imc(50, 1.70);
        imc1.calculaImc();
        System.out.println("O IMC é " + imc1.imc);
    }
}
