// @wolfram77
package org.data.stream;

// required modules
import java.io.IOException;



/**
 * Items (bytes or characters) can be got from object
 * implementing this interface.
 * @author wolfram77
 */
public interface Getable {
    
    /**
     * Get an item.
     * @return item (-1 on end)
     * @throws java.io.IOException on i/o error
     */
    int get() throws IOException;
    
    
    /**
     * Get to part of item array.
     * @param dst destination item array
     * @param off get offset in array
     * @param len number of items to get
     * @return number of items got
     * @throws java.io.IOException on i/o error
     */
    int get(Object dst, int off, int len) throws IOException;
}
