package com.tochy.videoeditor.videotogif;

import android.content.res.Resources;

public class FileUtils {
    public static int getScreenWidth() {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }
}
