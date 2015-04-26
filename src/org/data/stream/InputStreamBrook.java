// @wolfram77
package org.data.stream;

// required modules
import java.io.*;



public class InputStreamBrook extends BufferedInputStream implements Getable {

    public InputStreamBrook(InputStream in) {
        super(in);
    }
    
    
    
    @Override
    public int get() {
        String s = "";
        try { return read(); }
        catch(IOException e) { throw new RuntimeException(e); }
    }
    
    @Override
    public int get(Object dst, int off, int len) {
        try { return read(buf, off, len); }
        catch(IOException e) { throw new RuntimeException(e); }
    }
}
