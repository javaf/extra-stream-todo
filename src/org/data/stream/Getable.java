// @wolfram77
package org.data.stream;



/**
 * Items can be got from object implementing this interface.
 * @author wolfram77
 */
public interface Getable {
    
    /**
     * Get an item (byte or char).
     * @return item (-1 on end)
     */
    int get();
    
    
    /**
     * Get to part of item array.
     * @param dst destination item array
     * @param off get offset in array
     * @param len number of items to get
     * @return number of items got
     */
    int get(Object dst, int off, int len);
}
