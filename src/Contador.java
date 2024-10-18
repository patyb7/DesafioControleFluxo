import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int primeiroparametro = scanner.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int segundoparametro = scanner.nextInt();

        try {
            contar(primeiroparametro, segundoparametro);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void contar(int primeiroparametro, int segundoparametro) throws ParametrosInvalidosException{
        if (primeiroparametro >= segundoparametro){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiroparâmentro");
        }

        int quantidadeDeInteracoes = segundoparametro - primeiroparametro;
        System.out.println("A quantidade de interações é : " + quantidadeDeInteracoes);

        for(int n = primeiroparametro + 1; n <= segundoparametro; n++){
            System.out.println(n);
        }
    }
}
