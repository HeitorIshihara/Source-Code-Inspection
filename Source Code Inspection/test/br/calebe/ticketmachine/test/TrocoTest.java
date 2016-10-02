/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.calebe.ticketmachine.test;
import br.calebe.ticketmachine.core.PapelMoeda;
import br.calebe.ticketmachine.core.Troco;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Katia
 */
public class TrocoTest {
    
    
    
    @Test
    public void trocoTest(){
        Troco t = new Troco(15);
        PapelMoeda[] pmList = new PapelMoeda[6];
        
        PapelMoeda pm1 = new PapelMoeda(10, 1);
        pmList[1] = pm1;
        
        PapelMoeda pm2 = new PapelMoeda(5, 1);
        pmList[0] = pm2;
    }
    
    
}
