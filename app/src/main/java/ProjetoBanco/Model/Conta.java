package ProjetoBanco.Model;

import ProjetoBanco.Helper.Utils;

/**
 *
 * @author BENEVANIO
 */
public class Conta {

    private static int codigo = 1001;

    private int numero;
    private Cliente cliente;
    private Double saldo = 0.0;
    private Double limete = 0.0;
    private Double saldoTotal;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getLimete() {
        return limete;
    }

    public void setLimete(Double limete) {
        this.limete = limete;
    }

    public Double getSaldoTotal() {
        return saldoTotal;
    }

    public void setSaldoTotal(Double saldoTotal) {
        this.saldoTotal = saldoTotal;
    }

    public int getNumero() {
        return numero;
    }

    public Conta(Cliente cliente) {
        this.numero = Conta.codigo;
        this.cliente = cliente;
        Conta.codigo += 1;
        this.AtualizarSaldoTotal();
    }

    private void AtualizarSaldoTotal() {
        this.saldoTotal = this.getSaldo() + this.getLimete();
    }

    @Override
    public String toString() {
        return "Conta{" + "numero=" + numero + ", cliente=" + cliente + ", saldo=" + Utils.doubleParaString(saldo) + ", limete=" + Utils.doubleParaString(saldo) + ", saldoTotal=" + Utils.doubleParaString(saldo) + '}';
    }
    

}
