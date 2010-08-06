package com.tinkerpop.pipes;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author Marko A. Rodriguez (http://markorodriguez.com)
 */
public class MultiIteratorTest extends BaseTest {

    public void testMultiIteratorSimple() {
        List<Integer> a = Arrays.asList(1, 2);
        List<Integer> b = Arrays.asList(3, 4, 5);
        List<Integer> c = Arrays.asList(6, 7, 8);
        Iterator<Integer> itty = new MultiIterator<Integer>(a.iterator(), b.iterator(), c.iterator());
        int counter = 0;
        while (itty.hasNext()) {
            counter++;
            assertEquals(itty.next(), (Integer) counter);
        }
        assertEquals(counter, 8);

    }
}
