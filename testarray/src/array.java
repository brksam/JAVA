import java.util.ArrayList;
import java.util.Scanner;


public class array {
    public static void main(String[] args) {
        ArrayList <Pessoa> agendaPessoas = new ArrayList<Pessoa>();
        Scanner s = new Scanner(System.in);
        int op = 1;
        do {
            System.out.println("1 - Cadastro pessoa");
            System.out.println("2 - Listar pessoa");
            System.out.println("0 - sair");
            System.out.println("Digite o numero desejado: ");
            op = s.nextInt();
            if (op == 1){
                cadastrar(agendaPessoas);
            }else if(op == 2){
                listar(agendaPessoas);
            }
        }while (op != 0);
    }

    private static void listar(ArrayList<Pessoa> agendaPessoas) {
        for (Pessoa i:agendaPessoas) {
            System.out.println(i.toString());
        }
    }

    private static void cadastrar(ArrayList<Pessoa> agendaPessoas) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = s.nextLine();
        System.out.println("Digite seu endereço: ");
        String endereco = s.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = s.nextInt();
        Pessoa p1 = new Pessoa(nome , idade, endereco);
        agendaPessoas.add(p1);
    }
}
