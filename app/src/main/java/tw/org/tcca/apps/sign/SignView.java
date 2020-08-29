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
    private LinkedList<LinkedList<HashMap<String,Float>>> lines;

    public SignView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        lines = new LinkedList<>();
        setBackgroundColor(Color.YELLOW);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(Color.BLUE);
        paint.setStrokeWidth(10);
//        for (int i=1; i<line.size(); i++) {
//            HashMap<String,Float> p0 = line.get(i-1);
//            HashMap<String,Float> p1 = line.get(i);
//            canvas.drawLine(p0.get("x"), p0.get("y"), p1.get("x"), p1.get("y"), paint);
//        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            Log.v("bradlog", "down");
        }else if(event.getAction() == MotionEvent.ACTION_MOVE){
            Log.v("bradlog", "move");
        }

//        HashMap<String, Float> point = new HashMap<>();
//        point.put("x", event.getX());
//        point.put("y", event.getY());
//        line.add(point);
//        invalidate();

        return true; //super.onTouchEvent(event);
    }
}
