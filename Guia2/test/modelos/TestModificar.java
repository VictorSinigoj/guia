/*
MODIFICAR
 */
package modelos;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Victor Sinigoj
 */
public class TestModificar {
      @Test
    public void testModificar(){
        System.out.println("Modificar");
        Dato dato=new Dato("Id", "Datos");
        BaseDatos instance=new BaseDatos();
        instance.Agregar(dato);
        boolean esperado=true;  
        dato=new Dato("Id", "Dato");
        boolean obtenido=instance.Modificar(dato);
        Assert.assertEquals(esperado, obtenido);
    }
}
