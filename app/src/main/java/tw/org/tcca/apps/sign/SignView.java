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

import java.util.HashMap;
import java.util.LinkedList;

public class SignView extends View {
    private LinkedList<HashMap<String,Float>> line;

    public SignView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        line = new LinkedList<>();
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
        HashMap<String, Float> point = new HashMap<>();
        point.put("x", event.getX());
        point.put("y", event.getY());
        line.add(point);
        return true; //super.onTouchEvent(event);
    }
}
