package com.origins_eternity.sanity.content.capability.sanity;

public interface ISanity {
    void setSanity(int sanity);

    int getSanity();

    void setDown(int down);

    int getDown();

    void setUp(int up);

    int getUp();

    boolean isLost();

    void setLost(boolean lost);

    boolean isDizzy();

    void setDizzy(boolean dizzy);

    void consumeSanity(int value);

    void recoverSanity(int value);
}