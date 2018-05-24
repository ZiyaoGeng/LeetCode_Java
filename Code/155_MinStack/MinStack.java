
public class MinStack {
    int  num[];
    int length;
    int index;
    public MinStack() {
        index=-1;
        length=1;
        num=new int[length];
    }
    public void push(int x) {
        if(index>=length-1){
            int[]temp=num;
            num=new int[length*2];
            length=length*2;
            for(int i=0;i<temp.length;i++)
                num[i]=temp[i];
        }
            num[++index]=x;
    }

    public void pop() {
        if(index!=-1)
            num[index--]=0;
    }

    public int top() {
        return num[index];
    }

    public int getMin() {
        int min=num[0];
        for(int i=1;i<=index;i++)
            min=Math.min(min,num[i]);
        return min;
    }
}
