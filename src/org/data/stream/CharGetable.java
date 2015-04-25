// @wolfram77
package org.data.stream;



public interface CharGetable {
    
    /**
     * Get a character.
     * @return character (-1 on end)
     */
    int get();
    
    
    /**
     * Get a string.
     * @param len length of string
     * @return string
     */
    String get(int len);
    
    
    /**
     * Get to part of character array.
     * @param c destination character array
     * @param off get offset in array
     * @param len number of characters to get
     * @return this
     */
    CharPutable get(char[] c, int off, int len);
}
