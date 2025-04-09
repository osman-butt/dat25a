package examples.sort.simple;

public class MyInt implements Comparable<MyInt> {
    private int theInt;

    public MyInt(int theInt) {
        this.theInt = theInt;
    }

    public int getTheInt() {
        return theInt;
    }

    public void setTheInt(int theInt) {
        this.theInt = theInt;
    }

    @Override
    public String toString() {
        return theInt + "";
    }

    @Override
    public int compareTo(MyInt o) {
        int result =  Integer.compare(this.getTheInt(),o.getTheInt());
        System.out.println(this.getTheInt() + ", " + o.getTheInt() + " - " + result);
        return result;
    }
}
