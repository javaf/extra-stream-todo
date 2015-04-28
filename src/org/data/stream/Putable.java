// @wolfram77
package org.data.stream;

// required modules
import java.io.*;



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
     * @throws IOException on i/o error
     */
    Putable put(int i) throws IOException;
    
    
    /**
     * Put an item.
     * @param src item to put
     * @return this
     * @throws IOException on i/o error
     */
    Putable put(Object src) throws IOException;
    
    
    /**
     * Put part of item array.
     * @param src item array to put
     * @param off offset from where to put
     * @param len number of items to put
     * @return this
     * @throws IOException on i/o error
     */
    Putable put(Object src, int off, int len) throws IOException;
}
