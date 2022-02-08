package com.company;

public class Garnek {
    final int srednica;
    final int wysokosc;
    String kolor;

    public Garnek(int srednica, int wysokosc){
        this.srednica = srednica;
        this.wysokosc = wysokosc;
    }

    public Garnek(int srednica, int wysokosc, String kolor){
        this.srednica = srednica;
        this.wysokosc = wysokosc;
        this.kolor = kolor;
    }

    public String gotuj(){
        return "gotowanie w trakcie";
    }

    public String gotuj(boolean czyDodalismySol){
        if(czyDodalismySol) {
            return "gotowanie z sola";
        }else{
            return "gotowanie bez soli";
        }
    }
    public void gotujBezInformacji() {
        wlaczGarnek();
        gotujPrzez30min();
        wylaczGarnek();
    }

    private void wlaczGarnek() {
        System.out.println("wlaczenie garnka");
    }
    private void gotujPrzez30min() {
        System.out.println("gotowanie przez 30 min");
    }
    private void wylaczGarnek() {
        System.out.println("wylaczenie garnka");
    }

    public int temperaturaWrzeniaWody() {
        return 100;
    }

}

