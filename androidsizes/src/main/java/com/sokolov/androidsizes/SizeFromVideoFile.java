package com.sokolov.androidsizes;

import android.media.MediaMetadataRetriever;

import static android.media.MediaMetadataRetriever.METADATA_KEY_VIDEO_HEIGHT;
import static android.media.MediaMetadataRetriever.METADATA_KEY_VIDEO_WIDTH;

public class SizeFromVideoFile implements ISize {

    private final String filePath;

    public SizeFromVideoFile(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public int width() {
        MediaMetadataRetriever retriever = new MediaMetadataRetriever();
        retriever.setDataSource(filePath);
        return
                Integer.valueOf(
                        retriever.extractMetadata(
                                METADATA_KEY_VIDEO_WIDTH));
    }

    @Override
    public int height() {
        MediaMetadataRetriever retriever = new MediaMetadataRetriever();
        retriever.setDataSource(filePath);
        return
                Integer.valueOf(
                        retriever.extractMetadata(
                                METADATA_KEY_VIDEO_HEIGHT));
    }
}
