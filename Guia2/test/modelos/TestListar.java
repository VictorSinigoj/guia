/*
LISTAR
 */
package modelos;

import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Victor Sinigoj
 */
public class TestListar {

    public TestListar() {
    }
    
    @Test
    public void testListar(){
        System.out.println("Listar");
        BaseDatos instance = new BaseDatos();
        ArrayList<Dato> esperado=new ArrayList<Dato>();
        ArrayList<Dato> obtenido=instance.Listar();
        Assert.assertEquals(esperado, obtenido);
    }
    
}
