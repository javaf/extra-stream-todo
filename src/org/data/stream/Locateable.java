// @wolfram77
package org.data.stream;



/**
 * Current location can be obtained from object implementing this interface.
 * @author wolfram77
 */
public interface Locateable {
    
    /**
     * Number of items in object.
     * @return number of items
     */
    long size();
    
    
    /**
     * Current item position.
     * @return item position
     */
    long position();
    
    
    /**
     * Number of item left.
     * @return available items
     */
    long available();
}
