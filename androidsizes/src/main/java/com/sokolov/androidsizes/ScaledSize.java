package com.sokolov.androidsizes;

public class ScaledSize implements ISize {
    private final ISize origin;
    private final int scaleInPercent;

    public ScaledSize(ISize origin, int scaleInPercent) {
        this.origin = origin;
        this.scaleInPercent = scaleInPercent;
    }

    @Override
    public int width() {
        return origin.width() / 100 * scaleInPercent;
    }

    @Override
    public int height() {
        return origin.height() / 100 * scaleInPercent;
    }
}