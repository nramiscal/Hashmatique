import java.util.*;

public class TrackList {
    HashMap<String, String> hm = new HashMap<String, String>();
    public void createTrackList(){

        hm.put("Lorem Ipsum", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");
        hm.put("Finibus Bonorum", "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo.");
        hm.put("Malorum", "At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores.");
        hm.put("Rackham", "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
        System.out.println(hm);
    }

    public void oneSong(String title){
        String lyrics = hm.get(title);
        System.out.println(lyrics);
    }

    public void allSongs(){
        for(String key : hm.keySet()){
            System.out.println(key + " : " + hm.get(key));
        }

    }

}
