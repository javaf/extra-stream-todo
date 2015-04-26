// @wolfram77
package org.data.stream;

// required modules
import java.io.*;



public class StringCanal extends Reader {

    // data
    final CharSequence source;
    final int start, end;
    int position;
    
    
    public StringCanal(CharSequence source, int start, int end) {
        this.source = source;
        this.start = start;
        this.end = end;
    }
    
    
    @Override
    public int read() {
        return position<end? source.charAt(position++) : -1;
    }
    
    @Override
    public int read(char[] cbuf, int off, int len) {
        len = position+len>=end? end-position : len;
        source.subSequence(position, position+len).toString().getChars(0, len, cbuf, off);
        position += len;
        return len;
    }
    
    
    @Override
    public void close() throws IOException {
    }
}
