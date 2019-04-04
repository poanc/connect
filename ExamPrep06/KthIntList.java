import java.util.Iterator;
import java.util.NoSuchElementException;


/** Iterates over every Kth element of the IntList given to the constructor.
 * For example, if L is an IntList containing elements
 * [0, 1, 2, 3, 4, 5, 6, 7] with K = 2, then
 * for (Iterator<Integer> p = new KthIntList(L, 2); p.hasNext(); ) {
 * System.out.println(p.next());
 * }
 * would print get 0, 2, 4, 6. */
public class KthIntList implements Iterator <Integer> {
    public int k;
    private IntList curList;
    private boolean hasNext;

    public KthIntList(IntList I, int k) {
        this.k = k;
        this.curList = I;
        this.hasNext = true;
    }

    /**
     * Returns true if there is a next Kth element. Do not modify.
     */
    public boolean hasNext() {
        return this.hasNext;
    }

    /**
     * Returns the next Kth element of the IntList given in the constructor.
     * Returns the 0th element first. Throws a NoSuchElementException if
     * there are no Integers available to return.
     */
    public Integer next() {
        if (curList == null) {
            throw new NoSuchElementException();
        }
        int toReturn = curList.first;
        for (int i = 0; i < k && curList != null; i += 1) {
            curList = curList.rest;
        }

        hasNext = (curList != null);
        return toReturn;

    }

    public static void main(String[] args) {
        IntList list = new IntList(0,
                new IntList(1,
                    new IntList(2,
                            new IntList(3, null))));

        for (Iterator<Integer> p = new KthIntList(list, 4); p.hasNext(); ) {
             System.out.println(p.next());
        }


    }


}