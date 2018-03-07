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
        List<Interval>list=new ArrayList<>();
        if (intervals.size()==0)
            return list;
        Interval[] interval=
                intervals.toArray(new Interval[intervals.size()]);
        Arrays.sort(interval);
        int count=1;
        int ends=interval[0].end;
        for(int i=1;i<=interval.length;i++){
            if(i==interval.length){
                if(count==1)
                    list.add(interval[i-1]);
                else
                    list.add(new Interval(
                            interval[i-count].start,
                            ends));
                break;
            }
            if(ends>=interval[i].start) {
                count++;
                ends=Integer.max(ends,interval[i].end);
            }
            else{
                list.add(new Interval(
                        interval[i-count].start,
                        ends));
                ends=interval[i].end;
                count=1;
            }
        }
        return list;
    }
}
