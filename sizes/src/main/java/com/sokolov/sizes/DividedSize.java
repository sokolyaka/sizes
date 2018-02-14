package com.sokolov.sizes;

public class DividedSize implements ISize {

    private final ISize origin;
    private final int divider;

    public DividedSize(ISize origin, int divider) {
        this.origin = origin;
        this.divider = divider;
    }

    @Override
    public int width() {
        return origin.width() / divider;
    }

    @Override
    public int height() {
        return origin.height() / divider;
    }
}
