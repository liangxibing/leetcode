package Algorithms;

import java.util.*;

/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */

class Interval {
    int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }
}

public class Problem_56_Merge_Intervals {
    class IntervalComparator<T extends Interval> implements Comparator<T> {

        @Override
        public int compare(T o1, T o2) {
            return Integer.compare(o1.start, o2.start);
        }
    }

    public List<Interval> merge(List<Interval> intervals) {
        if (null == intervals) return null;
        List<Interval> result = new ArrayList<>();
        if (intervals.isEmpty()) return result;

        Collections.sort(intervals, new IntervalComparator<>());
        result.add(intervals.get(0));

        int size = intervals.size();
        for (int i = 1; i < size; i++) {
            Interval prev = result.get(result.size() - 1);
            Interval curr = intervals.get(i);
            if (prev.end < curr.start)
                result.add(curr);
            else
                // May change the source list but it doesn't affect return result
                prev.end = Math.max(prev.end, curr.end);
        }

        return result;
    }
}
