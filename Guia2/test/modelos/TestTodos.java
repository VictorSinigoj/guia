/*
TODOS
 */
package modelos;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses(
        {
            TestListar.class,
            TestAgregar.class,
            TestModificar.class,
            TestEliminar.class
        }
)
public class TestTodos {
    
}
