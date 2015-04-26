// @wolfram77
package org.data.stream;



/**
 * Size and position can read or modified in object
 * implementing this interface.
 * @author wolfram77
 */
public interface Sizeable {
    
    /**
     * Get total items in object.
     * @return number of items
     */
    long size();
    
    
    /**
     * Set total items in object.
     * @param val new number of items
     * @return this
     */
    Sizeable size(long val);
    
    
    /**
     * Get pointer position.
     * @return item position
     */
    long position();
    
    
    /**
     * Set pointer position. 
     * @param val new position
     * @return this
     */
    Sizeable position(long val);
}
