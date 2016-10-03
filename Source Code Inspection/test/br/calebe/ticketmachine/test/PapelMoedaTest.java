/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.calebe.ticketmachine.test;

import br.calebe.ticketmachine.core.PapelMoeda;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pedro
 */
public class PapelMoedaTest {
 
    @Test
    public void testarConstrutor(){
        PapelMoeda pm = new PapelMoeda(10,2);
        assertEquals(pm.getQuantidade(),2);
        assertEquals(pm.getValor(),10);
        
    }
}
