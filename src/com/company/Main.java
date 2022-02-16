package com.company;

import com.company.computer.Computer;
import com.company.computer.Monitor;
import com.company.computer.drive.HDDDrive;
import com.company.computer.usbdevice.MemoryStick;
import com.company.computer.usbdevice.Mouse;

public class Main {

    public static void main(String[] args) {
	    /*
        Garnek garnek = new Garnek(5, 10);

	    String wiadomosc = garnek.gotuj();
        System.out.println(wiadomosc);

        String wiadomosc2 = garnek.gotuj(true);
        System.out.println(wiadomosc2);

        int temperatura = garnek.temperaturaWrzeniaWody();
        System.out.println(temperatura);

        garnek.gotujBezInformacji();

        Uzytkownik lukasz = new Uzytkownik(20, "lukasz");

        if(lukasz.czyMozeKupicAlko()){
            System.out.println("moze kupic alkohol");
        }else{
            System.out.println("nie moze kupic alkoholu");
        }

        Monitor monitor = new Monitor();
        System.out.println(monitor.getResolution());

        monitor.setLowResolution();
        System.out.println(monitor.getResolution());

        monitor.setSmokuResolution();
        System.out.println(monitor.getResolution());
        */
        Monitor monitor = new Monitor();
        HDDDrive hddDrive = new HDDDrive();

        Computer computer = new Computer(monitor, hddDrive);

        //hddDrive.addFile(new File("slatt.jpg"));
        //hddDrive.listFiles();
        MemoryStick memoryStick = new MemoryStick("pendrive");
        Mouse mouse = new Mouse("mysz");

        computer.addUSBDevice(memoryStick);
        //computer.addUSBDevice(mouse);

        memoryStick.eject();
        computer.removeUSBDevice(memoryStick);
        //computer.removeUSBDevice(mouse);
    }
}
