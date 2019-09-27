/*
ELIMINAR
 */
package modelos;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Victor Sinigoj
 */
public class TestEliminar {
       @Test
    public void testEliminar(){
        System.out.println("Eliminar");
        String Id="Id";
        Dato dato=new Dato("Id", "Dato");
        BaseDatos instance=new BaseDatos();
        instance.Agregar(dato);
        boolean esperado=true;  
        boolean obtenido=instance.Eliminar(Id);
        Assert.assertEquals(esperado, obtenido);
    }
}
