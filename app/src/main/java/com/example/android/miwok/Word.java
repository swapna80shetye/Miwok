package com.example.android.miwok;

public class Word {
    private String mtrans;
    private String dtrans;
    private static int NO_IMAGE_FOUND = -1;
    private int imageID = NO_IMAGE_FOUND;
    private int audio_to_play;
    private int mAudioResourceId;
    public String getDtrans() {
        return dtrans;
    }

    public String getMtrans() {
        return mtrans;
    }

    public void setDtrans(String dtrans) {
        this.dtrans = dtrans;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public int getImageID() {
        return imageID;
    }

    public void setMtrans(String mtrans) {
        this.mtrans = mtrans;
    }

    public Word(String defaulttranslation, String mewaktranslation, int mAudioResourceId) {
        dtrans = defaulttranslation;
        mtrans = mewaktranslation;
        this.mAudioResourceId=mAudioResourceId;

    }

    public Word(String defaulttranslation, String mewaktranslation, int imageID,int mAudioResourceId) {
        dtrans = defaulttranslation;
        mtrans = mewaktranslation;
        this.imageID = imageID;
        this.mAudioResourceId=mAudioResourceId;
    }

    public boolean hasImage() {
        return (imageID != NO_IMAGE_FOUND);
    }

    public int getAudioResourceId() {
        return mAudioResourceId;
    }
}

