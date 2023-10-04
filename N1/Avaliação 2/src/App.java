import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    /*instancie dois empregados, um próprio e outro terceirizado. Em
    seguida mostrar todos os dados destes empregados na tela, inclusive o pagamento. */
        Scanner input = new Scanner(System.in);
        Empregado empregado = new Empregado();
        EmpregadoTerceirizado empregadoTerceirizado = new EmpregadoTerceirizado();
        System.out.println("Digite o nome do empregado: ");
        empregado.setNome(input.nextLine());
        System.out.println("Digite a quantidade de horas trabalhadas: ");
        empregado.setHoras(input.nextInt());
        System.out.println("Digite o valor da hora trabalhada: ");
        empregado.setValorHora(input.nextDouble());
        input.nextLine(); // consume the newline character left by nextDouble()
        System.out.println("Digite o nome do empregado terceirizado: ");
        empregadoTerceirizado.setNome(input.nextLine());
        System.out.println("Digite a quantidade de horas trabalhadas: ");
        empregadoTerceirizado.setHoras(input.nextInt());
        System.out.println("Digite o valor da hora trabalhada: ");
        empregadoTerceirizado.setValorHora(input.nextDouble());
        System.out.println("Digite o valor da despesa adicional: ");
        empregadoTerceirizado.setDespesaAdicional(input.nextDouble());
        System.out.println("Empregado: " + empregado.getNome() + "\nHoras trabalhadas: " + empregado.getHoras() + "\nValor da hora trabalhada: " + empregado.getValorHora() + "\nPagamento: " + empregado.pagamento());
        System.out.println("Empregado terceirizado: " + empregadoTerceirizado.getNome() + "\nHoras trabalhadas: " + empregadoTerceirizado.getHoras() + "\nValor da hora trabalhada: " + empregadoTerceirizado.getValorHora() + "\nDespesa adicional: " + empregadoTerceirizado.getDespesaAdicional() + "\nPagamento: " + empregadoTerceirizado.pagamento());
        input.close();
    }
}

