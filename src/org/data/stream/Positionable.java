// @wolfram77
package org.data.stream;



/**
 * Current location can set in object implementing this interface.
 * @author wolfram77
 */
public interface Positionable extends Locateable {
    
    Positionable position(long val);
}
