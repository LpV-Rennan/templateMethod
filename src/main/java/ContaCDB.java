public class ContaCDB extends Conta{

    public ContaCDB(float saldo, int diasNaConta) {
        super(saldo, diasNaConta);
    }

    @Override
    public float obterRendimentos() {
        return this.getDiasNaConta() * 0.6f * this.getSaldo();
    }
}
