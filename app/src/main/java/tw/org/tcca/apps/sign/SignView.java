package tw.org.tcca.apps.sign;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.Nullable;

public class SignView extends View {
    public SignView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        setBackgroundColor(Color.YELLOW);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(Color.BLUE);
        paint.setStrokeWidth(10);
        canvas.drawLine(0,0,100,100, paint);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.v("bradlog", event.getX() + ":" + event.getY());
        return true; //super.onTouchEvent(event);
    }
}
