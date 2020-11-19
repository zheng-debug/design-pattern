package com.design.designpattern.decoratePattern;

import jdk.internal.util.xml.impl.Input;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {

    public LowerCaseInputStream(InputStream inputStream){
        super(inputStream);
    }

    @Override
    public int read() throws IOException {
        int c = super.read();
        return (c == -1 ? c : Character.toUpperCase((char) c));
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int result = super.read(b, off, len);
        for (int i = off; i < off + result; i++){
            b[i] = (byte) Character.toUpperCase((char)b[i]);
        }
        return result;
    }
}
