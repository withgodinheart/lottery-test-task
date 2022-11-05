package core.basesyntax.service;

import core.basesyntax.model.ColorEnum;
import java.util.concurrent.ThreadLocalRandom;

public class ColorSupplierImpl implements ColorSupplier {

    /**
     * {@inheritDoc}
     */
    @Override
    public String getRandomColor() {
        int colorsLength = ColorEnum.values().length;
        int randomIndex = ThreadLocalRandom.current().nextInt(colorsLength);
        return ColorEnum.values()[randomIndex].toString();
    }
}
