package com.company.computer.file.imagefile;

import com.company.computer.file.File;
import com.company.computer.file.FileType;

public class JPGImageFile implements File {
    String name;
    int size;
    private final FileType fileType;
    int compression;

    public JPGImageFile(String name, int size, FileType fileType, int compression) {
        this.name = name;
        this.size = size;
        this.fileType = fileType;
        this.compression = compression;
    }
    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public FileType getType() {
        return null;
    }

    public int getCompression() {
        return compression;
    }

    public void displayImage(){
        System.out.println("displaying jpg");
    }
}
