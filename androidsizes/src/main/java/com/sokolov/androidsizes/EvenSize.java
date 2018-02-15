package com.sokolov.androidsizes;

public class EvenSize implements ISize {

    private final ISize origin;

    public EvenSize(ISize origin) {
        this.origin = origin;
    }

    @Override
    public int width() {
        int width = origin.width();
        if (width % 2 != 0) {
            width -= 1;
        }
        return width;
    }

    @Override
    public int height() {
        int height = origin.height();
        if (height % 2 != 0) {
            height -= 1;
        }
        return height;
    }
}
