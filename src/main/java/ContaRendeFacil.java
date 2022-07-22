public class ContaRendeFacil extends Conta{

    public ContaRendeFacil(float saldo, int diasNaConta) {
        super(saldo, diasNaConta);
    }

    public String tipoDaConta(){
        return "Conta Rende Facil";
    }
    @Override
    public float obterRendimentos() {
        return this.getDiasNaConta() * 0.2f * this.getSaldo();
    }
}
