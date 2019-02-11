package com.sokolov.androidsizes;

public class CachedSize implements ISize {
    private final ISize origin;

    private boolean isWidthInit = false;
    private boolean isHeightInit = false;

    private int width;
    private int height;

    public CachedSize(ISize origin) {
        this.origin = origin;
    }

    @Override
    public int width() {
        if (!isWidthInit) {
            width = origin.width();
            isWidthInit = true;
        }

        return width;
    }

    @Override
    public int height() {
        if (!isHeightInit) {
            height = origin.height();
            isHeightInit = true;
        }
        return height;
    }
}