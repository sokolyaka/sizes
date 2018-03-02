package com.sokolov.androidsizes;

import android.graphics.BitmapFactory;

//Not thread safe
public class SizeFromImage implements ISize {
    private String path;
    private int width;
    private int height;

    public SizeFromImage(String path) {
        this.path = path;
        width = -1;
        height = -1;
    }

    @Override
    public int width() {
        if (width == -1) {
            init();
        }
        return width;
    }

    @Override
    public int height() {
        if (height == -1) {
            init();
        }
        return height;
    }

    private void init() {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(path, options);
        width = options.outWidth;
        height = options.outHeight;
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
