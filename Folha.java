// src/Folha.java
public class Folha {
    private float saldo;

    public void calcular(Pagamento pagamento) {
        // O polimorfismo cuida da chamada correta do método,
        // dependendo do tipo de objeto que está sendo passado
        this.saldo = pagamento.calcularPagamento();
        System.out.println("Saldo calculado: " + this.saldo);
    }
}
