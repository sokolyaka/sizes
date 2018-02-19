package com.sokolov.androidsizes;

import android.util.Size;

public class SizeFromAndroidSize implements ISize {
    private final Size size;

    public SizeFromAndroidSize(Size size) {
        this.size = size;
    }

    @Override
    public int width() {
        return size.getWidth();
    }

    @Override
    public int height() {
        return size.getHeight();
    }

    @Override
    public boolean equals(Object o) {
        return SizeEqualsAndHashCode.equals(this, o);

    }

    @Override
    public int hashCode() {
        return SizeEqualsAndHashCode.hashCode(this);
    }
}
