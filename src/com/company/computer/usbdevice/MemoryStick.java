package com.company.computer.usbdevice;

public class MemoryStick implements USBDevice{

   private String name;
   private boolean ejected = false;

   public MemoryStick(String name){
       this.name = name;
   }

    @Override
    public boolean connect() {
        System.out.println("memory stick connected");
        return true;
    }

    @Override
    public boolean disconnect() {
        if(!ejected){
            System.out.println("eject memory stick first");
            return false;
        }else{
            System.out.println("memory stick disconnected");
            return true;
        }
    }

    public void eject(){
       ejected = true;
    }

    @Override
    public String getName() {
        return name;
    }
}
