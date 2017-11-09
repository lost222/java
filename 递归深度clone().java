public class Snake implements Cloneable {
    private Snake next;
    private char c;

    // Value of i == number of segments
    Snake(int i, char x) {
        c = x;
        if (--i > 0)
            next = new Snake(i, (char) (x + 1));
    }

    void increment() {
        c++;
        if (next != null)
            next.increment();
    }

    @Override
    public String toString() {
        String s = ":" + c;
        if (next != null)
            s += next.toString();
        return s;
    }

    @Override
    public Object clone() {
        Object o = null;
        try {
            o = super.clone();
        } catch (CloneNotSupportedException e) {
            System.err.println("Snake can't clone");
        }
        if(next!=null)
        {
            next =(Snake) next.clone();                    //递归调用，复制每一个next
        }
        return o;
    }
}
