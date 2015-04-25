// @wolfram77
package org.data.stream;



public interface CharPutable {
    
    CharPutable put(char c);
    
    CharPutable put(String s);
    
    CharPutable put(CharSequence cs);
    
    CharPutable put(char[] c, int off, int len);
}
