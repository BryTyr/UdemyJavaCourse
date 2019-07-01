package linkedLists;

import java.util.LinkedList;

public class Album {
    private String AlbumName;
    private LinkedList<Song> Songs = new LinkedList<>();

    Album(String AlbumName){
        this.AlbumName=AlbumName;
    }

    public String getAlbumName(){
        return AlbumName;
    }

    public void addSongs(Song song){
        Songs.add(song);
    }

    public LinkedList<Song> getSongs() {
        return Songs;
    }
}
