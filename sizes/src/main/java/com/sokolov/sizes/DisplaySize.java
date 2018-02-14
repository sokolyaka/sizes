package com.sokolov.sizes;

import android.graphics.Point;
import android.view.Display;

public class DisplaySize implements ISize {

    private final Display display;

    public DisplaySize(Display display) {
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
}
