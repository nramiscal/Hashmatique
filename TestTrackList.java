public class TestTrackList {
    public static void main(String[] args){
        TrackList tl = new TrackList();
        tl.createTrackList();

        String title = "Malorum";
        tl.oneSong(title);

        tl.allSongs();
    }
}
