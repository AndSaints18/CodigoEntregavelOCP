// src/Estagio.java
public class Estagio implements Pagamento {
    @Override
    public float calcularPagamento() {
        System.out.println("Calculando bolsa do estágio...");
        // Lógica de cálculo específica para Estagio
        return 1500.0f;
    }
}
