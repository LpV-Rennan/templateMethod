public abstract class Conta {
    private float saldo;
    private int diasNaConta;

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getDiasNaConta() {
        return diasNaConta;
    }

    public void setDiasNaConta(int diasNaConta) {
        this.diasNaConta = diasNaConta;
    }

    public String tipoDaConta() {
        return "Conta CDB";
    }

    public Conta(float saldo, int diasNaConta) {
        this.saldo = saldo;
        this.diasNaConta = diasNaConta;
    }

    public abstract float obterRendimentos();


    public String gerarRelatorio() {
        return tipoDaConta() + "{" +
                "saldo=" + saldo +
                ", diasNaConta=" + diasNaConta +
                "Rendimento = " + obterRendimentos() +
                '}';
    }
}
