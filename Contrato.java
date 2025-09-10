// src/Contrato.java
public class Contrato implements Pagamento {
    @Override
    public float calcularPagamento() {
        System.out.println("Calculando salário do contrato...");
        // Lógica de cálculo específica para Contrato
        return 5000.0f;
    }
}
