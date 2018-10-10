package cognitiveai.skin1;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.support.v7.widget.AppCompatImageView;

public class MirroredImageView extends AppCompatImageView {

    public MirroredImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MirroredImageView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.translate(getWidth(), 0);
        canvas.scale(-1, 1);
        super.onDraw(canvas);
    }

}
