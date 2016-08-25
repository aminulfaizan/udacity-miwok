package com.example.android.miwok;

/**
 * Created by eric on 8/19/16.
 */
public class Word {
    private int imageResourceID = NO_IMAGE_RESOURCE;
    private String defaultTranslation;
    private String miwokTranlation;
    private static final int NO_IMAGE_RESOURCE = -1;
    private int audioResourceID;

    /**
     * Create a new word object
     * @param defaultTranslation is the English translation of the word
     * @param miwokTranlation is the Miwok translation of the word
     * @param audioResourceID holds the resource ID for the audio file associated with the word
     */
    public Word(String defaultTranslation, String miwokTranlation, int audioResourceID) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranlation = miwokTranlation;
        this.audioResourceID = audioResourceID;
    }

    /**
     * Create a new word object
     * @param defaultTranslation is the English translation of the word
     * @param miwokTranlation is the Miwok translation of the word
     * @param imageResourceID holds the resource ID for the associated image file
     * @param audioResourceID holds the resource ID for the audio file associated with the word
     */
    public Word(String defaultTranslation, String miwokTranlation, int imageResourceID, int audioResourceID) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranlation = miwokTranlation;
        this.imageResourceID = imageResourceID;
        this.audioResourceID = audioResourceID;
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

    public int getAudioResourceID() {
        return audioResourceID;
    }
}
