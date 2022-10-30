package pt.ulusofona.deisi.lp2.contaBancaria;

public class ContaBancaria {

    int saldo;

    public ContaBancaria(int saldo) {

        this.saldo += saldo;
    }

    public void depositar(int saldo) {

        this.saldo +=saldo;
    }

    public boolean levanta(int valor) {
        if (this.saldo>=valor){
            this.saldo-=valor;
            return true;
        }
        return this.saldo>=valor;
    }

    public String getSaldoComoString(){
        return String.valueOf(saldo);
    }
}