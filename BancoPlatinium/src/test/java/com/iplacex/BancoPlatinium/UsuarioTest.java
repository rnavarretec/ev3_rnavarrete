package com.iplacex.BancoPlatinium;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import entidad.Login;
import entidad.Usuario;
import stactic org.junit.Assert.*;


public class LoginTest 
{
    public LoginTest{
    }
    @BeforeClass
    public static void setUpClass(){
     }
    @AfterClass
    public static void tearDownClass(){
  
    @Before
    public void setUp(){
     }
    @After
    public void tearDown(){
     }
    
    @Test 
    public void testUsuario(){
        System.out.println( "Bienvenido" );
        try {
        	Login instace = new Login ("Manuel, 1256");
        	instance.getUsuario().add(new Usuario));
        	int resultado = Manuel;
        	assertEquals(Instance.Login(), resultado, 0);
        } catch (IllegalArgumentException e) {
        	Sytem.out.println(e.getMessage());
        	fail(e.getMessage());
        }
    }
}

        @Test 
        public void testLogin(){
            System.out.println( "Bienvenido" );
            try {
            	Login instace = new Login ("Manuel, 1256");
            	instance.getUsuario().add(new Usuario));
            	int resultado = Manuel;
            	assertEquals(Instance.Login(), resultado, 0);
            } catch (IllegalArgumentException e) {
            	Sytem.out.println(e.getMessage());
            	fail(e.getMessage());
            }

    }
}