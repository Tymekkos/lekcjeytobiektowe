package com.company.computer.file.musicfile;

public class MP3MusicFile extends AbstractMusicFile{
    private int quality;

    public MP3MusicFile(String name, int size, String bandName, String title, int quality){
        super(name, size, bandName, title);
        this.quality = quality;
    }

    public int getQuality() {
        return quality;
    }

    @Override
    public void play() {
        System.out.println("playing mp3 file");
    }
}
