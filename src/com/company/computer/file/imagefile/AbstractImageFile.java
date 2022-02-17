package com.company.computer.file.imagefile;

import com.company.computer.file.AbstractFile;
import com.company.computer.file.FileType;

public abstract class AbstractImageFile extends AbstractFile {
    protected String name;
    protected int size;

    public AbstractImageFile(String name, int size) {
        super(name, size);
    }

    @Override
    public FileType getType() {
        return FileType.IMAGE;
    }
}
