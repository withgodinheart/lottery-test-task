package core.basesyntax.service;

import core.basesyntax.model.Ball;

public interface Lottery {

    /**
     * Generates ball with random color and number
     * @return {@link Ball}
     */
    Ball getRandomBall();
}
