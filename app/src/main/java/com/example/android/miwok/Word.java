package com.example.android.miwok;

/**
 * Created by eric on 8/19/16.
 */
public class Word {
    private int imageResourceID;
    private String defaultTranslation;
    private String miwokTranlation;

    public Word(String defaultTranslation, String miwokTranlation) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranlation = miwokTranlation;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }
    public String getMiwokTranlation() {
        return miwokTranlation;
    }

    public int getImageResourceID() {
        return imageResourceID;
    }
}
