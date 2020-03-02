package collections.AudioRecord.domain;

import collections.AudioRecord.service.MusicService;

import java.util.ArrayList;
import java.util.List;

import static collections.AudioRecord.domain.MusicStyles.*;


public class Disc {

    private List<Track> tracklist = new ArrayList<>();
    private MusicService service = new MusicService();

    public void initDisk() {

        tracklist.add(new Track("RED - Breathe into me", 2.49, ROCK));
        tracklist.add(new Track("Three Days Grace - Painkiller", 3.55, ROCK));
        tracklist.add(new Track("Movements - Pham feat. Yung Fusion", 3.03, RAP));
        tracklist.add(new Track("Madonna - 4 minutes", 3.51, POP));
        tracklist.add(new Track("Queen - We will rock you ", 3.21, ROCK));
        tracklist.add(new Track("Hurts - Ready to go", 3.22, POP));
        tracklist.add(new Track("Mozart - Requiem", 4.35, CLASSIC));

    }

    public void sortings() {

        service.getTracklist(tracklist);
        service.getTotalDuration(tracklist);
        service.sortingByStyle(tracklist, ROCK);
        service.findByRange(2.49, 3.03, tracklist);
    }
}
