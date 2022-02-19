package com.company.computer.file.imagefile;

import com.company.computer.file.File;
import com.company.computer.file.FileType;

public class JPGImageFile extends AbstractImageFile {
    private int compression;

    public JPGImageFile(String name, int size, int compression) {
        super(name, size);
        this.compression = compression;
    }

    public int getCompression() {
        return compression;
    }

    public void displayImage(){
        System.out.println("displaying jpg");
    }
}
