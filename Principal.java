// src/Principal.java
public class Principal {
    public static void main(String[] args) {
        Folha folha = new Folha();

        System.out.println("--- Calculando folha de um Contrato ---");
        // Cria um objeto Contrato e o passa para o método calcular
        Pagamento contrato = new Contrato();
        folha.calcular(contrato);

        System.out.println("\n--- Calculando folha de um Estágio ---");
        // Cria um objeto Estagio e o passa para o método calcular
        Pagamento estagio = new Estagio();
        folha.calcular(estagio);
    }
}
