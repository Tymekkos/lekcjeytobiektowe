package com.company.computer.drive;

import com.company.computer.File;

public interface Drive {
    void addFile(File file);
    void listFiles();
    File findFile(String name);
}
