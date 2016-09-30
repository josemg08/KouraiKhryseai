package josegonzalez.hephaestus.kouraikhryseai.widgets;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.util.TypedValue;

import josegonzalez.hephaestus.kouraikhryseai.R;

/**
 * .___
 * Created by jose-gonzalez on 30/09/16.
 * __.
 */

public class CustomMaterialButton extends AppCompatButton {

    private int colorDark;
    private int colorLight;

    public CustomMaterialButton(Context context) {
        super(context);
    }

    public CustomMaterialButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public CustomMaterialButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.CustomMaterialButton);
        colorDark = a.getColor(R.styleable.CustomMaterialButton_colorDark, -1);
        colorLight = a.getColor(R.styleable.CustomMaterialButton_colorLight, -1);

        setText(getText());
        a.recycle();
        setBackground();
    }

    private void setBackground() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            setMaterialButton();
        } else {
            set2d();
        }
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    private void setMaterialButton() {
        setBackgroundDrawable(getPressedColorRippleDrawable(colorLight, colorDark));
    }

    private void set2d() {
        setBackgroundDrawable(createButton2DBackground());
    }

    public StateListDrawable createButton2DBackground(){
        final StateListDrawable states = new StateListDrawable();

        ColorDrawable drawable = new ColorDrawable();
        drawable.setColor(colorDark);
        states.addState(new int[]{android.R.attr.state_pressed}, drawable);

        drawable = new ColorDrawable();
        drawable.setColor(colorLight);
        states.addState(new int[]{}, drawable);
        return states;
    }

    @Override
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        if (enabled) {
            setBackground();
        } else if (colorDark != -1) {
            setBackgroundColor(colorDark);
        }
    }

    @Override
    protected void drawableStateChanged() {
        super.drawableStateChanged();
    }

    private void refitText(int textWidth) {
        if (textWidth <= 0)
            return;
        float hi = 320;
        float lo = 2;
        final float threshold = 0.5f; // How close we have to be

        Paint testPaint = new Paint();
        testPaint.set(this.getPaint());

        int targetWidth = textWidth - getPaddingLeft() - getPaddingRight();

        testPaint.setTypeface(getTypeface());
        if (testPaint.measureText(getText().toString()) <= targetWidth) {
            return;
        }

        while ((hi - lo) > threshold) {
            float size = (hi + lo) / 2;
            testPaint.setTextSize(size);
            testPaint.setTypeface(getTypeface());
            if (testPaint.measureText(getText().toString()) >= targetWidth)
                hi = size; // too big
            else
                lo = size; // too small
        }
        // Use lo so that we undershoot rather than overshoot
        this.setTextSize(TypedValue.COMPLEX_UNIT_PX, lo);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        refitText(w);
    }

    public void setColorDark(int colorDark) {
        this.colorDark = colorDark;
        setBackground();
    }

    public void setColorLight(int colorLight) {
        this.colorLight = colorLight;
        setBackground();
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public static RippleDrawable getPressedColorRippleDrawable(int normalColor, int pressedColor) {
        return new RippleDrawable(getPressedColorSelector(normalColor, pressedColor), getColorDrawableFromColor(normalColor), null);
    }

    public static ColorStateList getPressedColorSelector(int normalColor, int pressedColor) {
        return new ColorStateList(
                new int[][]{
                        new int[]{android.R.attr.state_hovered},
                        new int[]{android.R.attr.state_pressed},
                        new int[]{android.R.attr.state_focused},
                        new int[]{android.R.attr.state_focused, android.R.attr.state_pressed},
                        new int[]{android.R.attr.state_first}
                },
                new int[] {
                        pressedColor,
                        pressedColor,
                        pressedColor,
                        pressedColor,
                        pressedColor
                }
        );
    }

    public static ColorDrawable getColorDrawableFromColor(int color) {
        return new ColorDrawable(color);
    }

}
