package josegonzalez.hephaestus.kouraikhryseai.widgets;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;

/**
 * .___
 * Created by Jose Gonzalez
 *
 * Argentina Sep 2016
 * __.
 */

public class CustomMaterialButton extends CustomButton {

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

    @Override
    protected void setBackground() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            setBackgroundDrawable(getButtonBackgroundRippleDrawable(colorLight, colorDark));
        } else {
            setBackgroundDrawable(getButtonBackgroundStateList());
        }
    }

    //.___ Ripple effect __./

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public static RippleDrawable getButtonBackgroundRippleDrawable(int normalColor, int pressedColor) {
        return new RippleDrawable(getPressedColorSelector(pressedColor), getColorDrawableFromColor(normalColor), null);
    }

    private static ColorStateList getPressedColorSelector(int pressedColor) {
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
//.___ End of CustomMaterialButton __./
