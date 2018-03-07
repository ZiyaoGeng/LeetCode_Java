import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Interval implements Comparable<Interval>{
    int start;
    int end;
    Interval(){start=0;end=0;}
    Interval(int s,int e){start=s;end=e;}
    @Override
    public int compareTo(Interval o) {
        if (this.start>o.start)return 1;
        if(this.start==o.start)return 0;
        return -1;
    }
}
public class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> list = new ArrayList<>();
        if (intervals.size() == 0)
            return list;
        Interval[] interval =
                intervals.toArray(new Interval[intervals.size()]);
        Arrays.sort(interval);
        int start1 = interval[0].start;
        int ends1 = interval[0].end;
        for (int i = 1; i < interval.length; i++) {
            if (ends1 >= interval[i].end)
                continue;
            else if (ends1 < interval[i].end && ends1 >= interval[i].start) {
                ends1 = interval[i].end;
                continue;
            } else {
                list.add(new Interval(start1, ends1));
                start1 = interval[i].start;
                ends1 = interval[i].end;
            }
        }
        list.add(new Interval(start1,ends1));
        return list;
    }
}
