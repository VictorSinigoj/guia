/*
AGREGAR
 */
package modelos;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Victor Sinigoj
 */
public class TestAgregar {
    @Test
    public void testAgregar(){
        System.out.println("Agregar");
        Dato dato=new Dato("Id", "Dato");
        BaseDatos instance=new BaseDatos();
        boolean esperado=true;
        boolean obtenido=instance.Agregar(dato);
        Assert.assertEquals(esperado, obtenido);
    }  
}
