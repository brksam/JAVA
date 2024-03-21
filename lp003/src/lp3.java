import java.util.Scanner;
public class lp3 {
    private static int cigarrosTotaisVida(int anos, int dia){
        return anos * 365 * dia;
    }
    private static double totalgasto(double totalcigarro, double maco){
        return (totalcigarro / 20) * maco;
    }
    private static double qtdMacos(double totalcigarro){
        return totalcigarro / 20;
    }
    private static double qtTempo(double totalcigarro){
        return totalcigarro * 11 / 1440;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o número de anos que você fuma: ");
        int anos = s.nextInt();
        System.out.println("Digite o número de cigarros que você fuma por dia: ");
        int dia = s.nextInt();
        System.out.println("Digite o preço do maço: ");
        double maco = s.nextDouble();
        int totalcigarro = cigarrosTotaisVida(anos, dia);
        double totalpreco = totalgasto(totalcigarro ,maco);
        double totalmacos = qtdMacos(totalcigarro);
        double totaltempoperdido = qtTempo(totalcigarro);
        System.out.println("o total de cigarros fumados foi: " + totalcigarro);
        System.out.println("total de preço que você gastou: " + totalpreco);
        System.out.println("você comprou " + totalmacos + " maços de cigarro!");
        System.out.println("seu tempo perdido foi: " + totaltempoperdido + " :(");
    }
}
