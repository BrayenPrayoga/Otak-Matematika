/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import sampel_1.Limas;
import sampel_1.Project1;
import sampel_1.Round;
import sampel_1.cube;
import sampel_1.cubo;
import sampel_1.kerucut;
import sampel_1.tabung;

/**
 *
 * @author Rafif Agdyaputra
 */
public class TestClass {
    
    public TestClass() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }


     @Test
     public void login() {
         Project1 p = new Project1(); 
         assertEquals("true", p.login("12345678", "areydf"));
     }
     
    @Test
    public void Round1(){
        Round r = new Round();
        double exp = 3052.08;
        double a = 9.0;
        assertEquals(exp, r.round1(a), 0.0);
    }
     
    @Test
    public void Round2(){
        Round r = new Round();
        double exp = 3052.08;
        double a = 9.0;
        assertEquals(exp, r.round2(a), 0.0);
    }
    
    @Test
    public void Limas1(){
        Limas l = new Limas();
        double exp = 243.0;
        double a = 9.0;
        double b = 9.0;
        assertEquals(exp, l.limas1(a,b), 0.0);
    }
    
    @Test
    public void Limas2(){
        Limas l = new Limas();
        double exp = 81.0;
        double a = 9.0;
        assertEquals(exp, l.limas2(a), 0.0);
    }
    
    @Test
    public void Cube1(){
        cube c = new cube();
        double exp = 729.0;
        double a = 9.0;
        assertEquals(exp, c.cube1(a), 0.0);
        assertEquals(1000.0, c.cube1(10), 0.0);
    }
    
    @Test
    public void Cube2(){
        cube c = new cube();
        double exp = 486.0;
        double a = 9.0;
        assertEquals(exp, c.cube2(a), 0.0);
    }
    
    @Test
    public void Cubo1(){
        cubo co = new cubo();
        double exp = 729.0;
        double a = 9.0;
        double b = 9.0;
        double c = 9.0;
        assertEquals(exp, co.cubo1(a,b,c), 0.0);
    }
    
    @Test
    public void Cubo2(){
        cubo co = new cubo();
        double exp = 324.0;
        double a = 9.0;
        double b = 9.0;
        double c = 9.0;
        assertEquals(exp, co.cubo2(a,b,c), 0.0);
    }
    
    @Test
    public void kerucut1(){
        kerucut k = new kerucut();
        double exp = 6867.18;
        double a = 9.0;
        double b = 9.0;
        assertEquals(exp, k.kerucut1(a,b), 0.0);
    }
    
    @Test
    public void kerucut2(){
        kerucut k = new kerucut();
        double exp = 254.34;
        double a = 9.0;
        double b = 9.0;
        assertEquals(exp, k.kerucut2(a,b), 0.0);
    }
    
    @Test
    public void tabung1(){
        tabung t = new tabung();
        double exp = 2826.0;
        double a = 10.0;
        double b = 9.0;
        assertEquals(exp, t.tabung1(a,b), 0.0);
    }
    
    @Test
    public void tabung2(){
        tabung t = new tabung();
        double exp = 1193.2;
        double a = 10.0;
        double b = 9.0;
        assertEquals(exp, t.tabung2(a,b), 0.0);
    }
    
}
