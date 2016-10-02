package br.calebe.ticketmachine.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.calebe.ticketmachine.core.TicketMachine;
import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 31521401
 */
public class TicketMachineTest {
    
    TicketMachine tm = new TicketMachine();
    
    @Test
    public void testarConstrutor(){
        TicketMachine tm2 = new TicketMachine(50);
        
        assertEquals(tm2.getSaldo(), 0);
        assertEquals(tm2.getValor(), 50);
        
    }
    
    @Test
    public void testarInserir() throws PapelMoedaInvalidaException{
        assertEquals(tm.inserir(2), tm.getSaldo());
        assertEquals(tm.inserir(5), tm.getSaldo());
        assertEquals(tm.inserir(10), tm.getSaldo());
        assertEquals(tm.inserir(20), tm.getSaldo());
        assertEquals(tm.inserir(50), tm.getSaldo());
        assertEquals(tm.inserir(100), tm.getSaldo());
    }
}
