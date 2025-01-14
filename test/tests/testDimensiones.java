package tests;

import matrices.Matriz;
import matrices.DimensionesIncompatibles;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author fuent
 */
public class testDimensiones {    
    @Test
    /**
    * Método de testeo sobre la funcionalidad DimensionesIncompatibles.
    */
    public void testMultiplicarDimensionesIncompatibles() {
        Matriz a = new Matriz(3, 4, false); // 3x4 matrix
        Matriz b = new Matriz(5, 3, false); // 5x3 matrix

        DimensionesIncompatibles exception = Assert.assertThrows(DimensionesIncompatibles.class, () -> {
            Matriz.multiplicarDosMatrices(a, b);
        });

        Assert.assertEquals("Las dimensiones son incompatibles.", exception.getMessage());
    }
}