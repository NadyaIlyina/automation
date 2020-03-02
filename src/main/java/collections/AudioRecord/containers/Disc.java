package collections.AudioRecord.containers;

import collections.AudioRecord.music.Track;
import collections.AudioRecord.service.MusicService;

import java.util.ArrayList;
import java.util.List;

import static collections.AudioRecord.music.MusicStyles.*;


public class Disc {
    private List<Track> tracklist = new ArrayList<>();
    private MusicService service = new MusicService();

    public Disc() {
        tracklist.add(new Track("Queen - we will rock you ", 2.49, ROCK));
        tracklist.add(new Track("Twenty One Pilots – Stressed out ", 3.22, RAP));
        tracklist.add(new Track("Nickback - SEX ", 3.55, ROCK));
        tracklist.add(new Track("Twenty One Pilots – Heavydirtysoul ", 3.03, RAP));
        tracklist.add(new Track("Kygo - Fragile", 3.51, POP));
        tracklist.add(new Track("Nickback - Hero ", 3.21, ROCK));
        tracklist.add(new Track("Shakira - Waka waka ", 3.22, POP));
        tracklist.add(new Track("Mozart - Requiem", 4.35, CLASSIC));

        service.getTracklist(tracklist);
        service.getTotalDuration(tracklist);
        service.sortingByStyle(tracklist, ROCK);
        service.findByRange(2.49, 3.03, tracklist);

    }
}
