import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        System.out.println("exemplo do while");
        int opcao = -1;
        Scanner in = new Scanner(System.in);
        do{
            System.out.println("******** Sistema de cadastro **********");
            System.out.println("Opção 1: exercicio 1");
            System.out.println("Opção 2: exercicio 2");
            System.out.println("Opção 3: exercicio 3");
            System.out.println("Opção 0: Sair");
            System.out.println("***************************************");
            System.out.println("Digite a opção: ");
            opcao = in.nextInt();
            System.out.println("***************************************");
            switch (opcao){
                case 1:
                    System.out.println("Opção 1 escolhida!");
                    exercicio1();
                    break;
                case 2:
                    System.out.println("Opção 2 escolhida!");
                    exercico2();
                    break;
                case 3:
                    System.out.println("Opção 3 escolhida!");
                    exercicio3();
                    break;
                case 0:
                    System.out.println("Opção 0 escolhida!");
                    break;
                default:
                    System.out.println("o número escolhido é invalido!");
            }
        }while(opcao != 0);
    }

    private static void exercicio1() {
        int total = 0;
        Scanner scne = new Scanner(System.in);
        for (int i = 1; i <= 4; i++){

            total += scne.nextInt();

        }
        System.out.println("total das variaveis: " + total);
    }

    private static void exercico2() {
        float total = 0;
        Scanner in = new Scanner(System.in);
        for (int i = 1; i <= 3; i++){
            total += in.nextInt();
        }
        System.out.println("Media das notas: " + total/3);
    }

    private static void exercicio3() {
        Scanner in = new Scanner(System.in);
        float salario = in.nextInt();
        salario += salario * 0.25;
        System.out.println("novo salario: " + salario);
    }
}