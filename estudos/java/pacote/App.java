package pacote;

import java.util.Scanner;

public class App {


    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int teste = 1;
        while(teste == 1)
        {
            System.out.println("Calcular IMC? (1 = sim, 0 = não)");
            teste = entrada.nextInt();
            if (teste == 1){
                System.out.println("Qual o peso em kg?");
                double peso = entrada.nextDouble();
                System.out.println("Qual a altura em metros?");
                double altura = entrada.nextDouble();
                calculoImc(peso,altura);

            }

        }

    }

    public static void calculoImc(double peso, double altura){

        double[] pesoImc = {18.5, 24.9, 29.9, 39.9, 90000};
        String[] classificacaoImc = {"Magreza", "Normal", "Sobrepeso", "Obesidade", "Obesidade Grave"};
        double imc = peso / (altura * altura);
        System.out.println("O IMC é:  " + imc);

        int i = 0;
        while (imc > pesoImc [i]){i++;};
        System.out.println("A classificacao é: " + classificacaoImc[i]);

    }





    }






