package linkedLists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Playlist {
    private LinkedList<Song> playlist = new LinkedList<>();
    private ArrayList<Album> albumList = new ArrayList<>();
    private Song currentSong=null;
    private boolean firstSong=true;

    public void AddSongsToPlaylist(Song song){
        boolean inAlbum = checkAlbumList(song);
        if(inAlbum) {
            playlist.add(song);
            if(firstSong){
                currentSong=song;
                firstSong=false;
            }
        }else{
            System.out.println("you do not own this album containing this song");
        }
    }

    private boolean checkAlbumList(Song song) {
        for(Album album : albumList){
            LinkedList<Song> listOfSongs = album.getSongs();
            for(Song singleSong : listOfSongs){
                if(singleSong.getTitle().contains(song.getTitle())){
                    return true;
                }
            }
        }
        return false;
    }

    public void AddAlbums(Album album){
        albumList.add(album);
    }

    public void skipForward(){
        Iterator<Song> i = playlist.iterator();
        while(i.hasNext()){
            boolean thisSong = i.next().getTitle().contains(currentSong.getTitle());
            if(thisSong){
                currentSong=i.next();
                System.out.println("the next song playing now as current song is: "+currentSong.getTitle());
                return;
            }
        }
    }
    public void SkipBackward(){
        ListIterator<Song> i = playlist.listIterator();
        while(i.hasNext()){
            Song singleSong = i.next();
            boolean thisSong = singleSong.getTitle().contains(currentSong.getTitle());
            if(thisSong){
                i.previous();
                currentSong= i.previous();
                System.out.println("the previous song playing now as current song is: "+currentSong.getTitle());
                return;
            }
        }
    }
    public void replaySong(){
        currentSong=currentSong;
    }
    public void removeSong(Song song){
        ListIterator<Song> i = playlist.listIterator();
        while(i.hasNext()){
            Song singleSong = i.next();
            boolean thisSong = singleSong.getTitle().contains(song.getTitle());
            if(thisSong){
                i.remove();
                System.out.println("the song has been removed"+song.getTitle());
                return;
            }
        }
    }

    public void listPlaylist(){
        Iterator<Song> i = playlist.iterator();
        while(i.hasNext()){
            String songTitle = i.next().getTitle();
                System.out.println("Song Name: "+songTitle);
        }
    }

}
