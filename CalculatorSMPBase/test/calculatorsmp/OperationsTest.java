/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorsmp;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Joao
 */
public class OperationsTest {
    
    /**
     * Test of MakeFormula method, of class Operations.
     */
    @Test
    public void testMakeFormula() {
        System.out.println("MakeFormula");
        String expResult = "";
        String result = Operations.MakeFormula();
        assert(result.length()>0);
        
    }

    /**
     * Test of Solve method, of class Operations.
     */
    @Test
    public void testSolve() {
        System.out.println("Solve");
        String formula ="80-50";
        String expResult =formula+"=30";
        String result = Operations.Solve(formula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    

    
    //Los errores aparecen cuando las expresiones usan números de solo una cifra. 
    @Test
    public void testMultiplicacion() {
        System.out.println("Solve");
        String formula ="150*3";
        String expResult =formula+"=450";
        String result = Operations.Solve(formula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    @Test
    public void testExpresionMixta() {
        System.out.println("Solve");
        String formula ="50*20-30";
        String expResult =formula+"=970";
        String result = Operations.Solve(formula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    
    @Test
    public void testOrdenDePrioridad() {
        System.out.println("Solve");
        String formula ="500/20+50*2-20";
        String expResult =formula+"=100";
        String result = Operations.Solve(formula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //Bug en operaciones muy grandes o con números muy pequeños. Puede ser en la pila de prioridad. 
    }
    
    public void testCombinacion() {
        String formula = Operations.MakeFormula();
        System.out.println(formula);
        String result = Operations.Solve(formula);
        assert(result.length()>0);
        
    }
    
    
    //    @Test
//    public void testUnitario(){
//        System.out.println("Solve");
//        String formula ="8-5";
//        String expResult =formula+"=3";
//        String result = Operations.Solve(formula);
//        assertEquals(expResult, result);
//    
//    
//    }
    
     
    
}
