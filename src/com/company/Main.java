package com.company;

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
        */
        Uzytkownik lukasz = new Uzytkownik(20, "lukasz");

        if(lukasz.czyMozeKupicAlko()){
            System.out.println("moze kupic alko");
        }else{
            System.out.println("nie moze kupic alko");
        }
    }
}
