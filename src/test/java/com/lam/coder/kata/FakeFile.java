package com.lam.coder.kata;

import java.io.File;

public class FakeFile extends File {
    private static final long serialVersionUID = 1L;
    private final File[] children;
    private boolean isDirectory;

    public FakeFile(String filename) {
        super(filename);
        isDirectory = false;
        children = new File[]{};
    }

    public FakeFile(File[] children) {
        super("test directory");
        isDirectory = true;
        this.children = children;
    }

    @Override
    public File[] listFiles() {
        return children;
    }

    @Override
    public String[] list() {
    	String[] strings = new String[children.length];
    	for (int i = 0; i < children.length; i++) {
    		strings[i] = children[i].getName();
    	}
        return strings;
    }

    @Override
    public boolean isDirectory() {
        return isDirectory;
    }
    
    @Override
    public boolean isFile() {
        return ! isDirectory;
    }
}

