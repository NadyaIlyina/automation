package collections.AudioRecord.service;

import collections.AudioRecord.domain.MusicStyles;
import collections.AudioRecord.domain.Track;

import java.util.List;

public class MusicService {

    public void getTracklist(List<Track> list) {

        for (Track t : list) {
            System.out.println(t.toString());
        }
    }

    public void getTotalDuration(List<Track> list) {

        double duration = 0.0;

        for (Track track : list) {
            duration += track.getDuration();
        }

        System.out.println("Total duration:"  + duration + "min\n");
    }

    public void sortingByStyle(List<Track> tracklist, MusicStyles style) {

        for (Track t : tracklist) {
            if (t.getStyle() == style) {
                System.out.println(t.toString());
            }
        }

        for (Track t : tracklist) {
            if (t.getStyle() != style) {
                System.out.println(t.toString());
            }
        }
        System.out.println();
    }

    public void findByRange(Double from, Double to, List<Track> tracklist) {

        for (Track track : tracklist) {
            if (track.getDuration() >= from && track.getDuration() <= to) {
                System.out.println(track.toString());
            }
        }
    }
}
