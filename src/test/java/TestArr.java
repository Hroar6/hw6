import org.junit.Assert;
import org.junit.Test;

public class TestArr {
    @org.junit.Test
    public void testArrAfterFour() {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        Assert.assertArrayEquals(new int[]{5,6,7},Main.arrAfterFour(arr));
    }
    @Test(expected = RuntimeException.class)
    public void test2ArrAfterFour(){
        int[] arr = new int[]{1,2,3,5,6};
        Main.arrAfterFour(arr);
    }
    @Test(expected = RuntimeException.class)
    public void test3ArrAfterFour(){
        int[] arr = new int[]{1,2,3,5,4};
        Main.arrAfterFour(arr);
    }

    @Test
    public void testArrConsistsOfFoursAndOnes(){
        int[] arr = new int[]{1,1,4,1,4};
        Assert.assertTrue(Main.arrConsistsOfFoursAndOnes(arr));
    }

    @Test
    public void test2ArrConsistsOfFoursAndOnes(){
        int[] arr = new int[]{1,2,3,5,4};
        Assert.assertFalse(Main.arrConsistsOfFoursAndOnes(arr));
    }

}
