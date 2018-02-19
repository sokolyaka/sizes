package com.sokolov.androidsizes;

public class SmplSize implements ISize {
    private final int w;
    private final int h;

    public SmplSize(int w, int h) {
        this.w = w;
        this.h = h;
    }

    @Override
    public int width() {
        return w;
    }

    @Override
    public int height() {
        return h;
    }

    @Override
    public String toString() {
        return "SmplSize{" +
                "w=" + w +
                ", h=" + h +
                '}';
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
