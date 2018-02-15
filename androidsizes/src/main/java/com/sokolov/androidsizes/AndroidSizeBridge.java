package com.sokolov.androidsizes;

import android.util.Size;

public class AndroidSizeBridge {

    private final ISize size;

    public AndroidSizeBridge(ISize size) {
        this.size = size;
    }

    public Size toAndroidSize() {
        return
                new Size(
                        size.width(),
                        size.height());
    }
}
