package pt.ulusofona.deisi.lp2.contaBancaria;

public class ContaBancaria {

    int saldo;

    ContaBancaria(int saldo) {

        this.saldo += saldo;
    }

    void deposita(int saldo) {

        this.saldo +=saldo;
    }

    boolean levanta(int valor) {
        if (this.saldo>=valor){
            this.saldo-=valor;
            return true;
        }
        return this.saldo>=valor;
    }

    String getSaldoComoString(){
        return String.valueOf(saldo);
    }
}