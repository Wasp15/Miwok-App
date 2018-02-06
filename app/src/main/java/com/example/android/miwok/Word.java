package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */
public class Word {

    /**
     * Default translation for the word
     */
    private String defaultTranslationPrivate;

    /**
     * Miwok translation for the word
     */
    private String miwokTranslationPrivate;

    /**
     * Image resource ID
     */
    private int imageResourceIDPrivate;

    /**
     * Audio resource ID
     */
    private int audioResourceIDPrivate;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation   is the word in the Miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceID) {
        defaultTranslationPrivate = defaultTranslation;
        miwokTranslationPrivate = miwokTranslation;
        audioResourceIDPrivate = audioResourceID;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceID,
                int audioResourceID) {
        defaultTranslationPrivate = defaultTranslation;
        miwokTranslationPrivate = miwokTranslation;
        imageResourceIDPrivate = imageResourceID;
        audioResourceIDPrivate = audioResourceID;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return defaultTranslationPrivate;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return miwokTranslationPrivate;
    }

    /**
     * Get the image resource ID
     */
    public int getImageResourceId() {
        return imageResourceIDPrivate;
    }


    /**
     * Get the audio resource ID
     */
    public int getAudioResourceID() {
        return audioResourceIDPrivate;
    }
}

