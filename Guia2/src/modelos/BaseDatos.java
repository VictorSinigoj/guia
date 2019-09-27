
package modelos;

import java.util.ArrayList;

/**
 *
 * @author MEGA
 */
public class BaseDatos {
    /*
 -	agregar(Dato d): Agrega un objeto a la base de datos emulada.
-	eliminar(Dato d): Elimina un objeto de la base de datos emulada.
-	listar(): Retorna una lista con todos los objetos de la base de datos emulada.
-	modificar(Dato d): Modifica un objeto de la base de datos emulada.

 */
    
    private ArrayList<Dato> datos;
    
    public BaseDatos(){
        this.datos=new ArrayList<Dato>();
    }
    
    public ArrayList<Dato> Listar(){
        return this.datos;
    }
    
    public boolean Agregar(Dato d){
        return this.datos.add(d);
    }
    
    public boolean  Modificar(Dato d){
        for(int i=0;i<datos.size();i++){
            if(datos.get(i).getId().equals(d.getId())){
                datos.get(i).setData(d.getData());                
                return true; 
            }            
        }
        return false;
    }
    
    public boolean  Eliminar(String d){
        for(int i=0;i<datos.size();i++){
            if(datos.get(i).getId().equals(d)){
                datos.remove(i);
                return true; 
            }            
        }
        return false;
    }
    
}
