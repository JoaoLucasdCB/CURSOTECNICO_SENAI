package programas1;

public class Main {
    public static void main(String[] args) {
        Veiculo[] veiculos = new Veiculo[2];
        veiculos[0] = new Carro();
        veiculos[1] = new Veiculo();

        for (Veiculo veiculo : veiculos) {
            veiculo.mover();
        }
}}
