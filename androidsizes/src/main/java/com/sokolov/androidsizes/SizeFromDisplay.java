package com.sokolov.androidsizes;

import android.graphics.Point;
import android.view.Display;

public class SizeFromDisplay implements ISize {

    private final Display display;

    public SizeFromDisplay(Display display) {
        this.display = display;
    }

    @Override
    public int width() {
        Point point = new Point();
        display.getRealSize(point);
        return point.x;
    }

    @Override
    public int height() {
        Point point = new Point();
        display.getRealSize(point);
        return point.y;
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
