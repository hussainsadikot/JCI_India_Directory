package com.example.android.jciindiadirectory;

public class ProfileList {
    private  int mImageProfile;
    private String mName,mTitle,mHouseName,mEmail,mAddress,mPhoneNumber;


    public ProfileList(int mImageProfile, String mPhoneNumber, String mName, String mTitle, String mHouseName, String mEmail, String mAddress) {
        this.mImageProfile = mImageProfile;
        this.mPhoneNumber = mPhoneNumber;
        this.mName = mName;
        this.mTitle = mTitle;
        this.mHouseName = mHouseName;
        this.mEmail = mEmail;
        this.mAddress = mAddress;
    }




    public int getmImageProfile() {
        return mImageProfile;
    }

    public String getmPhoneNumber() {
        return mPhoneNumber;
    }

    public String getmName() {
        return mName;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmHouseName() {
        return mHouseName;
    }

    public String getmEmail() {
        return mEmail;
    }

    public String getmAddress() {
        return mAddress;
    }

}
