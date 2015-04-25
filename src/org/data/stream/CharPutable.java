// @wolfram77
package org.data.stream;



/**
 * Characters can be put to object implementing this interface.
 * @author wolfram77
 */
public interface CharPutable extends Putable {
    
    /**
     * Put a character sequence.
     * @param cs character sequence to put
     * @return this
     */
    CharPutable put(CharSequence cs);
}
