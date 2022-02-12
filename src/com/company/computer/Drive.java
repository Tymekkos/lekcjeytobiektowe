package com.company.computer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Drive {
    private final String type;
    List<File> hddFiles = new ArrayList<>();
    Map<String, File> ssdFiles = new HashMap<>();

    public Drive(String type){
        this.type = type;
    }

    public void addFile(File file){
         if(type.equals("HDD")) {
             hddFiles.add(file);
         }else if(type.equals("SSD")){
             ssdFiles.put(file.toString(), file);
         }
    }
}
