import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaTest {

    @Test
    void deveRetornarORelatorioCDB(){
        ContaCDB contaCDB = new ContaCDB(100f,10);
        assertEquals("Conta CDB{saldo=100.0, diasNaConta=10Rendimento = 600.0}", contaCDB.gerarRelatorio());
    }
    @Test
    void deveRetornarORelatorioRendeFacil(){
        ContaRendeFacil contaRendeFacil = new ContaRendeFacil(100f,10);
        assertEquals("Conta Rende Facil{saldo=100.0, diasNaConta=10Rendimento = 200.0}", contaRendeFacil.gerarRelatorio());
    }

}