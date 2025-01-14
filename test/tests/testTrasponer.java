package tests;

import matrices.Matriz;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author fuent
 */
public class testTrasponer {    
    @Test
    /**
    * Método de testeo sobre la funcionalidad trasponer.
    */
    public void testTrasponer() {
        // Matriz A
        int[][] datosA = {
            {1, 1, 1},
            {2, 2, 2},
            {3, 3, 3}
        };
        Matriz a = new Matriz(3, 3, datosA);

        // Resultado esperado
        int[][] esperado = {
            {1, 2, 3},
            {1, 2, 3},
            {1, 2, 3}
        };

        // Tresponer matriz
        Matriz resultado = a.trasponer();

        // Verificar que el resultado es el esperado
        Assert.assertArrayEquals(esperado, resultado.getMatriz());
    }
}