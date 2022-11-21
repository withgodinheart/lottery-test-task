package core.basesyntax;

import core.basesyntax.model.Ball;
import core.basesyntax.service.ColorSupplierImpl;
import core.basesyntax.service.Lottery;
import core.basesyntax.service.LotteryImpl;
import java.util.function.Supplier;

public class Application {

    public static void main(String[] args) {
        Lottery lotteryImpl = new LotteryImpl(new ColorSupplierImpl());
        printBalls(3, lotteryImpl::getRandomBall);
    }

    /**
     * Gets and prints object from supplier for n-times
     *
     * @param n        times to print
     * @param supplier data to print
     */
    private static void printBalls(int n, Supplier<Ball> supplier) {
        for (int i = 0; i < n; i++) {
            System.out.println(supplier.get());
        }
    }
}
