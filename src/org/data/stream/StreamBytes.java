// @wolfram77
package org.data.stream;

// required modules
import java.io.*;



public class StreamBytes extends BufferedInputStream implements ByteGetable {

    public StreamBytes(InputStream in) {
        super(in);
    }
}
