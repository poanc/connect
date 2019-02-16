public class TestSort {
    /** Tests the sort method of the Sort class. */
    public static void testSort() {
        String[] input = {"i", "have", "an", "egg"};
        String[] expected = {"an", "egg", "have", "i"};
        Sort.sort(input);
        org.junit.Assert.assertArrayEquals(expected, input);
    }

    public static void testFindMinumum(){
        String[] input = {"i", "have", "an", "egg"};
        int expected = 2;
        int actual = Sort.findMininum(input, 0);
        org.junit.Assert.assertEquals(expected, actual);

        String[] input2 = {"how", "are", "you"};
        int expected2 = 1;
        int actual2 = Sort.findMininum(input2, 0);
        org.junit.Assert.assertEquals(expected2, actual2);

    }

    public static void testSwap(){

        String[] input = {"i", "have", "an", "egg"};
        String[] expected = {"an", "have", "i", "egg"};

        Sort.swap(input, 0, 2);

        org.junit.Assert.assertArrayEquals(expected, input);
    }

    public static void main(String[] args) {
       testSort();
    }
}