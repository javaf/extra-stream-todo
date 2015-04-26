// @wolfram77
package org.data.stream;



/**
 * Items (bytes or characters) can be put to object
 * implementing this interface.
 * @author wolfram77
 */
public interface Putable {
    
    /**
     * Put an item.
     * @param i item to put
     * @return this
     */
    CharPutable put(int i);
    
    
    /**
     * Put part of item array.
     * @param src item array to put
     * @param off offset from where to put
     * @param len number of items to put
     * @return this
     */
    CharPutable put(Object src, int off, int len);
}
