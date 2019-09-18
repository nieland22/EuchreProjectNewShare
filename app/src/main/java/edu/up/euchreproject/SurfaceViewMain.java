package edu.up.euchreproject;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceView;

public class SurfaceViewMain extends SurfaceView {


    public SurfaceViewMain(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        setWillNotDraw(false);
    }

    public void onDraw(Canvas canvas)
    {
        Paint paint = new Paint();
        paint.setColor(Color.BLACK);

        canvas.drawRect(10, 15, 10, 15, paint);
    }
}
