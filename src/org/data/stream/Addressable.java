// @wolfram77
package org.data.stream;



/**
 * Size and position can read or modified in object
 * implementing this interface.
 * @author wolfram77
 */
public interface Addressable {
    
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
    Addressable size(long val);
    
    
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
    Addressable position(long val);
}
