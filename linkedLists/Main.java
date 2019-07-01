package linkedLists;

// Create a program that implements a playlist for songs
// Create a Song class having Title and Duration for a song.
// The program will have an Album class containing a list of songs.
// The albums will be stored in an ArrayList
// Songs from different albums can be added to the playlist and will appear in the list in the order
// they are added.
// Once the songs have been added to the playlist, create a menu of options to:-
// Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
// List the songs in the playlist
// A song must exist in an album before it can be added to the playlist (so you can only play songs that
// you own).
// Hint:  To replay a song, consider what happened when we went back and forth from a city before we
// started tracking the direction we were going.
// As an optional extra, provide an option to remove the current song from the playlist
// (hint: listiterator.remove()

public class Main {

    public static void main(String[] args) {
    Song song1 = new Song("Song1",4.21);
    Song song2 = new Song("Song2",3.11);
    Song song3 = new Song("Song3",3.10);
    Song song4 = new Song("Song4",5.33);
    Song song5 = new Song("Song5",2.42);
    Song song6 = new Song("Song6",3.22);

    Album album1 = new Album("Album1");
    Album album2 = new Album("Album2");

    album1.addSongs(song1);
    album1.addSongs(song2);
    album1.addSongs(song3);
    album2.addSongs(song4);
    album2.addSongs(song5);
    album2.addSongs(song6);

    Playlist playlist = new Playlist();
    playlist.AddAlbums(album1);
    playlist.AddAlbums(album2);

    playlist.AddSongsToPlaylist(song4);
    playlist.AddSongsToPlaylist(song1);
    playlist.AddSongsToPlaylist(song6);
    playlist.AddSongsToPlaylist(song2);

    playlist.skipForward();

    playlist.skipForward();

    playlist.SkipBackward();

    playlist.listPlaylist();
    playlist.removeSong(song6);
    playlist.listPlaylist();


    }
}
