package com.example.android.bandungtourguide;

/**
 * Created by IrvinShandy on 6/30/16.
 */
public class Place {
    private static final int NO_IMAGE_PROVIDED = -1;
    private static final String NO_PHONE_NUMBER_PROVIDED = "No Phone Number Provided";
    private String mName;
    private String mAddress;
    private String mPhoneNumber = NO_PHONE_NUMBER_PROVIDED;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    public Place(String name, String address, String phoneNumber, int imageResourceId) {
        mName = name;
        mAddress = address;
        mPhoneNumber = phoneNumber;
        mImageResourceId = imageResourceId;
    }

    public Place(String name, String address, String phoneNumber) {
        mName = name;
        mAddress = address;
        mPhoneNumber = phoneNumber;
    }

    public Place(String name, String address, int imageResourceId) {
        mName = name;
        mAddress = address;
        mImageResourceId = imageResourceId;
    }

    public Place(String name, String address) {
        mName = name;
        mAddress = address;
    }

    public String getName() {
        return mName;
    }

    public String getAddress() {
        return mAddress;
    }

    public String getPhoneNumber() {
        return mPhoneNumber;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public boolean hasPhoneNumber() {
        return !(mPhoneNumber.equals(NO_PHONE_NUMBER_PROVIDED));
    }
}
