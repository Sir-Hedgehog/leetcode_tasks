package ru.graphs.level.easy;

import java.util.ArrayList;
import java.util.List;

/*


        You are given the array paths, where paths[i] = [cityAi, cityBi]
        means there exists a direct path going from cityAi to cityBi. Return the destination city, that is,
        the city without any path outgoing to another city.

        It is guaranteed that the graph of paths forms a line without any loop,
        therefore, there will be exactly one destination city.


 */

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 09.01.2021
 */

public class Path {
    public String getDestination(List<List<String>> paths) {
        String destination = "";
        List<String> starts = new ArrayList<>();
        List<String> ends = new ArrayList<>();
        for (List<String> current : paths) {
            starts.add(current.get(0));
            ends.add(current.get(1));
        }
        for (String end : ends) {
            if (!starts.contains(end)) {
                destination = end;
                break;
            }
        }
        return destination;
    }
}
