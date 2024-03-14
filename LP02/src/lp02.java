import java.util.Scanner;
public class lp02 {
    public static void main(String[] args) {
        exercicio4();
        exercicio5();
        exercicio6();
        exercicio8();
        exercicio7();
    }
    private static void exercicio4() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite seu salario");
        double salario = in.nextDouble();
        System.out.println("Digite o percentual de aumento: ");
        double perau = in.nextDouble();
        double aumento = salario + (perau / 100);
        double novoSal = salario + aumento;
        System.out.println("seu aumento: " + aumento);
        System.out.println("novo salario: " + novoSal);
    }
    private static void exercicio5() {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o salario base do funcionario: ");
        double salario = s.nextDouble();
        if (salario > 0) {
            double gratificacao, imposto, salariofinal;
            gratificacao = salario * 0.05;
            imposto = salario * 0.07;
            salariofinal = salario + gratificacao - imposto;
            System.out.printf("Sua gratificação foi de: %.2f\nSeu imposto foi: %.2f\nSeu Salario final foi: %.2f", gratificacao, imposto, salariofinal);
        } else {
            System.out.println("Número invalido!");
        }
    }
    private static void exercicio6(){
            for(int i = 2; i <= 1000; i++){
                if (i % 2 == 0){
                    if(i % 3 == 0){
                        System.out.println(i);
                    }
                }
        }
    }
    private static void exercicio7(){
        int num;
        int soma = 0;
       Scanner s = new Scanner(System.in);
        for (int i = 0; i <= 9; i++){
            System.out.println("Numero: ");
            num = s.nextInt();
            soma += num;
        }
        System.out.println("Soma: " + soma);
        System.out.println("Media: " + (soma/10));
    }
    private static void exercicio8(){
        Scanner s = new Scanner(System.in);
        double largura, comprimento;
        System.out.println("Você irá digitar as camadas de 4 comodos");
        for(int i = 1; i < 5; i++) {
            System.out.println("\nDigite a largura do "+  i + " comodo: ");
            largura = s.nextDouble();
            System.out.println("Digite o comprimento do " + i + " comodo: ");
            comprimento = s.nextDouble();
            double area = largura * comprimento;
            System.out.printf("Área do " + i + " comodo: " + area);
        }
    }
}
