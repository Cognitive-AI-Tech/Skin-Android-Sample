
/*
 *  Copyright (C) Cognitive AI Technologies, Inc - All Rights Reserved
 *  * Unauthorized copying of this file, via any medium is strictly prohibited
 *  * Proprietary and confidential
 *  * Written by Javy Kong, 2015
 *
 */

package cognitiveai.skin1;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.TextView;
import android.support.v7.widget.AppCompatTextView;

public class MirroredTextView extends AppCompatTextView {

    public MirroredTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MirroredTextView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.translate(getWidth(), 0);
        canvas.scale(-1, 1);
        super.onDraw(canvas);
    }

}
