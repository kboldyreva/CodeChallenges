
import org.testng.annotations.Test;

public class ReturnEvenNumbers {

    @Test
    public void ReturnEvenNumbers() {


        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }
}
