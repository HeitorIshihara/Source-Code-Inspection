package br.calebe.ticketmachine.core;

import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import br.calebe.ticketmachine.exception.SaldoInsuficienteException;
import java.util.Iterator;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class TicketMachine {

    private int valor;
    private int saldo;
    private int[] papelMoeda = {2, 5, 10, 20, 50, 100};

    public TicketMachine(int valor) {
        this.valor = valor;
        this.saldo = 0;
    }

    public TicketMachine() {
    }

    public int inserir(int quantia) throws PapelMoedaInvalidaException {
        boolean achou = false;
        while(!achou){
            if(quantia == 2 || quantia == 5 || quantia == 10 || quantia == 20 || quantia == 50 || quantia == 100){ 
                achou = true; 
            } 
            if (!achou) {
                throw new PapelMoedaInvalidaException();
            }
        }
        this.saldo += quantia;
        return saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public Iterator<Integer> getTroco() {
        return null;
    }

    public String imprimir() throws SaldoInsuficienteException {
        if (saldo < valor) {
            throw new SaldoInsuficienteException();
        }
        String result = "*****************\n";
        result += "*** R$ " + saldo + ",00 ****\n";
        result += "*****************\n";
        return result;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int[] getPapelMoeda() {
        return papelMoeda;
    }

    public void setPapelMoeda(int[] papelMoeda) {
        this.papelMoeda = papelMoeda;
    }
    
}
