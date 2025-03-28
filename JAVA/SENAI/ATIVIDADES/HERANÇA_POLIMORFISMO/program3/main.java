package program3;

public class main {
    public static void main(String[] args) {
        Funcionarios funcionario = new Funcionarios("Carlos", 3000);
        System.out.println("Funcionário: " + funcionario.getNome() + ", Salário: " + funcionario.calcularSalario());


        Gerente gerente = new Gerente("Ana", 5000, 1500);
        System.out.println("Gerente: " + gerente.getNome() + ", Salário: " + gerente.calcularSalario());



        Dev desenvolvedor = new Dev("Pedro", 4000);
        System.out.println("Desenvolvedor: " + desenvolvedor.getNome() + ", Salário: " + desenvolvedor.calcularSalario());
    }
}