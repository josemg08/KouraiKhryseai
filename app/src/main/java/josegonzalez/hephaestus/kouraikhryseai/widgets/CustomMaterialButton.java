package josegonzalez.hephaestus.kouraikhryseai.widgets;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import josegonzalez.hephaestus.kouraikhryseai.R;

/**
 * .___
 * Created by Jose Gonzalez
 *
 * Argentina Sep 2016
 * __.
 */

public class CustomMaterialButton extends CustomButton implements View.OnTouchListener{

    public CustomMaterialButton(Context context) {
        super(context);
    }

    public CustomMaterialButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        initButton(context, attrs);
    }

    public CustomMaterialButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        initButton(context, attrs);
    }

    protected void initButton(Context context, AttributeSet attrs) {
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.CustomMaterialButton);
        mColorDark = typedArray.getColor(R.styleable.CustomMaterialButton_colorDark, -1);
        mColorLight = typedArray.getColor(R.styleable.CustomMaterialButton_colorLight, -1);

        setText(getText());
        typedArray.recycle();
        setBackground();
    }

    @Override
    protected void setBackground() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            setBackgroundDrawable(getButtonBackgroundRippleDrawable(mColorLight, mColorDark));
        } else {
            setBackgroundDrawable(getButtonBackgroundStateList());
        }
    }

    public boolean onTouch(View v, MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN
                || event.getAction() == MotionEvent.ACTION_BUTTON_PRESS
                || event.getAction() == MotionEvent.ACTION_POINTER_DOWN) {
            setSelected(true);
            setSelected(false);
        }
        return true;
    }

    //.___ Ripple effect __./

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public RippleDrawable getButtonBackgroundRippleDrawable(int normalColor, int pressedColor) {
        return new RippleDrawable(getPressedColorSelector(pressedColor),
                getDrawableFromColor(normalColor),
                getDrawableFromColor(normalColor));
    }

    private ColorStateList getPressedColorSelector(int pressedColor) {
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

    public GradientDrawable getDrawableFromColor(int color) {
        GradientDrawable drawable = new GradientDrawable();
        drawable.setColor(color);
        drawable.setCornerRadius(mCornerRadius);
        return drawable;
    }

   /* private static Drawable getRippleMask(int color) {
        float[] outerRadii = new float[8];
        Arrays.fill(outerRadii, 3);// 3 is radius of final ripple, instead of 3 you can give required final radius

        RoundRectShape r = new RoundRectShape(outerRadii, null, null);

        ShapeDrawable shapeDrawable = new ShapeDrawable(r);
        shapeDrawable.getPaint().setColor(color);

        return shapeDrawable;
    }*/

}
//.___ End of CustomMaterialButton __./
