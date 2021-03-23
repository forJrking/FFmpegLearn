package com.jni.ffmpeglearn;

/**
 * @description:
 * @author: forjrking
 * @date: 2021/3/23 12:33 PM
 */
public class FFmpegLearn {
    static {
        System.loadLibrary("learn-ffmpeg");
    }

    public static native String versionFFmpeg();
}
