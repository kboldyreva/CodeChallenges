import org.testng.annotations.Test;

import java.util.Arrays;

public class SwapTwoNumbers{

@Test

public void TestSwapTwoNumbers() {
    int[] array = {1,2,3,4};
    swap(array, 0, 2);
    System.out.println(Arrays.toString(array));
}

    private void swap(int[] array, int indexL, int indexR) {
        int temp = array[indexL];
        array[indexL] = array[indexR];
        array[indexR] = temp;
    }
    }


