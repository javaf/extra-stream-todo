// @wolfram77
package org.data.stream;



public interface CharPutable {
    
    /**
     * Put a character.
     * @param c character to put
     * @return this
     */
    CharPutable put(char c);
    
    
    /**
     * Put a character sequence.
     * @param cs character sequence to put
     * @return this
     */
    CharPutable put(CharSequence cs);
    
    
    /**
     * Put part of character array.
     * @param c character array to put
     * @param off offset from where to put
     * @param len number of characters to put
     * @return this
     */
    CharPutable put(char[] c, int off, int len);
}
