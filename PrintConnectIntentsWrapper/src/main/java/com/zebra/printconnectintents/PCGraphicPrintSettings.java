package com.zebra.printconnectintents;

import com.zebra.printconnectenums.PC_E_ROTATION;

public class PCGraphicPrintSettings extends PCIntentsBaseSettings {
    /*
    Store here the file name of the image to print
     */
    public String mFileName = "";

    public PC_E_ROTATION mRotation = PC_E_ROTATION.ZERO;

    public int mMarginTop = 0;
    public int mMarginLeft = 0;
    public int mMarginBottom = 0;

    public boolean mCenter = false;

    public int mScaleX = 100;
    public int mScaleY = 100;

}

