// @wolfram77
package org.data.stream;

// required modules
import java.io.*;



public class Brook implements Putable {

    // data
    byte[] buffer;
    int size;
    
    // constants
    static final int DEF_BUFFER_SIZE = 1024;
    
    public Brook(int capacity) {
        buffer = new byte[capacity];
    }
    
    public void close() {
        buffer = null;
    }
    
    public void flush() {
        
    }
    

    @Override
    public Putable put(int i) throws IOException {
        
        return this;
    }

    @Override
    public Putable put(Object src) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Putable put(Object src, int off, int len) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
