package core.basesyntax.service;

import core.basesyntax.model.Ball;
import java.util.concurrent.ThreadLocalRandom;

public class LotteryImpl implements Lottery {

    /**
     * Maximum number for ball
     */
    private static final int MAXIMUM_NUMBER = 100;

    /**
     * Color generator
     */
    private final ColorSupplier colorSupplier;

    public LotteryImpl(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Ball getRandomBall() {
        int number = ThreadLocalRandom.current().nextInt(MAXIMUM_NUMBER + 1);
        String color = colorSupplier.getRandomColor();
        return new Ball(color, number);
    }
}
