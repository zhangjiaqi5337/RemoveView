package com.example.zhangjiaqi.rabbitview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by zhangjiaqi on 16/5/18.
 */
public class RabitView extends View{
    public float bitmapX,bitmapY;
    public RabitView(Context context) {
        super(context);
        bitmapX = 500;
        bitmapY = 750;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        Bitmap bitmap = BitmapFactory.decodeResource(BaseApplication.getContext().getResources(),R.mipmap.ic_launcher);
        canvas.drawBitmap(bitmap,bitmapX,bitmapY,paint);
        if (!bitmap.isRecycled()){
            bitmap.recycle();
        }
    }
}
