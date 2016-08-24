package com.example.android.miwok;

/**
 * Created by eric on 8/19/16.
 */
public class Word {
    private int imageResourceID = NO_IMAGE_RESOURCE;
    private String defaultTranslation;
    private String miwokTranlation;
    private static final int NO_IMAGE_RESOURCE = -1;

    public Word(String defaultTranslation, String miwokTranlation) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranlation = miwokTranlation;
    }

    public Word(String defaultTranslation, String miwokTranlation, int imageResourceID) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranlation = miwokTranlation;
        this.imageResourceID = imageResourceID;
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

    public boolean hasImage() {
        return imageResourceID != NO_IMAGE_RESOURCE;
    }
}
