package tests;

import matrices.DimensionesIncompatibles;
import matrices.Matriz;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author fuent
 */
public class testCompuestas {    
    @Test
    /**
    * Método de testeo sobre la trapuesta de una matriz traspuesta.
    */
    public void testOriginal() {
        // Matriz A
        int[][] datosA = {
            {1, 1, 1},
            {2, 2, 2},
            {3, 3, 3}
        };
        Matriz a = new Matriz(3, 3, datosA);

        // Resultado esperado
        int[][] esperado = {
            {1, 1, 1},
            {2, 2, 2},
            {3, 3, 3}
        };

        // Trasponer matriz
        Matriz resultado = a.trasponer();
        
        // Trasponer matriz traspuesta
        Matriz original = resultado.trasponer();

        // Verificar que el resultado es el esperado
        Assert.assertArrayEquals(esperado, original.getMatriz());
    }

    @Test
    /**
    * Método de testeo sobre la trapuesta de un producto.
    */
    public void testProductoTraspuesto() throws DimensionesIncompatibles {
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
            {6, 12, 18},
            {6, 12, 18},
            {6, 12, 18}
        };

        //Trasponer matrices
        Matriz a_traspuesta = a.trasponer();
        Matriz b_traspuesta = b.trasponer();
        
        // Multiplicar matrices traspuestas
        Matriz resultado = Matriz.multiplicarDosMatrices(b_traspuesta, a_traspuesta);

        // Verificar que el resultado es el esperado
        Assert.assertArrayEquals(esperado, resultado.getMatriz());
    }
}