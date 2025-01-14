package tests;

import matrices.DimensionesIncompatibles;
import matrices.Matriz;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author fuent
 */
public class testMultiplicar {    
    @Test
    /**
    * Método de testeo sobre la funcionalidad multiplicarDosMatrices.
    */
    public void testMultiplicarMatrices() throws DimensionesIncompatibles {
        // Matriz A
        int[][] datosA = {
            {1, 1, 1},
            {2, 2, 2},
            {3, 3, 3}
        };
        Matriz a = new Matriz(3, 3, datosA);

        // Matriz B
        int[][] datosB = {
            {3, 3, 3},
            {2, 2, 2},
            {1, 1, 1}
        };
        Matriz b = new Matriz(3, 3, datosB);

        // Resultado esperado
        int[][] esperado = {
            {6, 6, 6},
            {12, 12, 12},
            {18, 18, 18}
        };

        // Multiplicar matrices
        Matriz resultado = Matriz.multiplicarDosMatrices(a, b);

        // Verificar que el resultado es el esperado
        Assert.assertArrayEquals(esperado, resultado.getMatriz());
    }
}