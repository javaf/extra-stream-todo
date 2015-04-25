// @wolfram77
package org.data.stream;



/**
 * Characters can be got from object implementing this interface.
 * @author wolfram77
 */
public interface CharGetable extends Getable {

    /**
     * Get a string.
     * @param len length of string
     * @return string
     */
    String get(int len);
}
