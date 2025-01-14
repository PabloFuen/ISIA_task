package tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author fuent
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
                    tests.testDimensiones.class,
                    tests.testMultiplicar.class,
                    tests.testTrasponer.class,
                    tests.testCompuestas.class
                    })
public class testSuite {
        
}
