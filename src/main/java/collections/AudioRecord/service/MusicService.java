package collections.AudioRecord.service;

import collections.AudioRecord.domain.MusicStyles;
import collections.AudioRecord.domain.Track;

import java.util.List;

public class MusicService {

    public void getTracklist(List<Track> list) {

        System.out.println("Список песен:");
        for (Track t : list) {
            System.out.println(t.toString());
        }
    }

    public void getTotalDuration(List<Track> list) {

        double duration = 0.0;

        for (Track track : list) {
            duration += track.getDuration();
        }

        System.out.println("\nTotal duration: " + duration + " min\n");
    }

    public void sortingByStyle(List<Track> tracklist, MusicStyles style) {

        System.out.println("Сортировка по стилю: " + style);

        tracklist.stream().filter(t -> t.getStyle() == style).map(Track::toString).forEach(System.out::println);

        tracklist.stream().filter(t -> t.getStyle() != style).map(Track::toString).forEach(System.out::println);
    }

    public void findByRange(Double from, Double to, List<Track> tracklist) {

        System.out.println("\nПесни из диапазона: " + from + " - " + to);
        tracklist.stream().filter(track -> track.getDuration() >= from && track.getDuration() <= to)
                .map(Track::toString).forEach(System.out::println);
    }
}
