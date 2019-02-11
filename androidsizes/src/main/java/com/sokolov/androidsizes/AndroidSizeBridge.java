package com.sokolov.androidsizes;

import android.annotation.TargetApi;
import android.os.Build;
import android.util.Size;

@TargetApi(Build.VERSION_CODES.LOLLIPOP)
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
