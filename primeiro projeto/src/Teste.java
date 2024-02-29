import java.io.IOException;
public class Teste {
    public static void main(String[] args) throws IOException{
        System.out.println("Olá, mundo!");
        char ch;
        ch = 'x';
        System.out.println("ch contains " + ch);
        ch++; // Incrementa ch
        System.out.println("ch is now " + ch);
        ch = 90; // da a ch o valor 2
        System.out.println("ch is now " + ch);
        byte tipoByte = 127;
        short tipoShort = 32767;
        char tipoChar = 'C';
        float tipoFloat = 2.6f;
        double tipoDlouble = 3.39;
        int tipoInt =2147483647;
        long tipoLong = 9223372036854775007L;
        boolean tipoBooleano = true;
        System.out.println("Valor do tipoByte = " + tipoByte);
        System.out.println("Valor do tipoShort = " + tipoShort);
        System.out.println("Valor do tipoChar = " + tipoChar);
        System.out.println("Valor do tipoDouble = " + tipoDlouble);
        System.out.println("Valor do tipoInt = " + tipoInt);
        System.out.println("Valor do tipoLong = " + tipoLong);
        System.out.println("Valor do tipoFloat = " + tipoFloat);
        System.out.println("Valor do tipoBooleano = " + tipoBooleano);

        //Demonstra sequencias de escape em strings
        System.out.println("\nFirst line \nSecond Line");
        System.out.println("A\tB\tC");
        System.out.println("D\tE\tF");

        // Demonstra valores booleanos
        boolean b;
        b = false;
        System.out.println("b is " + b);
        b = true;
        System.out.println("b is " + b);

        // um valor booleano pode controlar a instrução if
        if(b) System.out.println(" This is executed.");
        b = false;
        if(b) System.out.println(" This is not executed.");
        // o resultado de um operador relacional é um valor booleano
        System.out.println("10 > 9 is " + (10 + 9));

        //Demonstra o escopo de bloco
        int m; // conhecido pelo codigo dentro do mian()
        m = 10;
        if(m == 10){ // inicia novo escopo
            int n = 20; // conhecido apenas nesse bloco
            // tanto m quanto n são conhecidos aqui.
            System.out.println("m and n: " + m + " " + n);
            m = n * 2;
        }
        // n = 100; // Erra! n não é conhecido aqui
        // m ainda é conhecida aqui.
        System.out.println("m is " + m);
        //Demonstra o tempo de vida de uma variavel
        for(int i = 0; i < 3; i++){
            int j = -1; // y será inicializada sempre que entrarmos no bloco
            System.out.println("j is " + j); // essa linha sempre exibe -1

            j = 100;
            System.out.println("j is now " +  j);
        }
        //Demonstra os operadores relacionais e logicos
        int i, j; boolean b1, b2;
        i = 10;
        j = 11;
        if(i < j) System.out.println("\ni < j");
        if(i <=j) System.out.println("i <= j");
        if(i != j) System.out.println("i != j");
        if(i == j) System.out.println("this won't execute");
        if(i >= j) System.out.println("this won't execute");
        if(i > j) System.out.println("this won't execute");

        b1 = true;
        b2 = false;



    }
}
