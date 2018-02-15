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
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SmplSize smplSize = (SmplSize) o;

        if (w != smplSize.w) return false;
        return h == smplSize.h;

    }

    @Override
    public int hashCode() {
        int result = w;
        result = 31 * result + h;
        return result;
    }
}
