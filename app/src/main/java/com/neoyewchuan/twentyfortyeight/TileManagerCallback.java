package com.neoyewchuan.twentyfortyeight;

import android.graphics.Bitmap;

import com.neoyewchuan.twentyfortyeight.sprites.Tile;

public interface TileManagerCallback {
    Bitmap getBitmap(int count);
    void finishedMoving(Tile tile);
    void updateScore(int delta);
    void reached2048();
}
