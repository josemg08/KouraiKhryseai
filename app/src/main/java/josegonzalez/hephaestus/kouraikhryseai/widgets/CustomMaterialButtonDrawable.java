package josegonzalez.hephaestus.kouraikhryseai.widgets;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;

/**
 * .___
 * Created by Jose Gonzalez
 *
 * Argentina Oct 2016
 * __.
 */

@TargetApi(Build.VERSION_CODES.LOLLIPOP)
class CustomMaterialButtonDrawable {

    public RippleDrawable getButtonBackgroundRippleDrawable(int normalColor, int pressedColor) {
        return new RippleDrawable(getPressedColorSelector(pressedColor),
                getDrawableFromColor(normalColor),
                getDrawableFromColor(normalColor));
    }

    RippleDrawable getRoundedCornerButtonBackgroundRippleDrawable(int normalColor,
                                                                  int pressedColor, int cornerRadius) {
        return new RippleDrawable(getPressedColorSelector(pressedColor),
                getRoundedCornerDrawableFromColor(normalColor, cornerRadius),
                getRoundedCornerDrawableFromColor(normalColor, cornerRadius));
    }

    public RippleDrawable getBorderLessButtonBackgroundRippleDrawable(int color) {
        return new RippleDrawable(getPressedColorSelector(color),
                null,
                getRippleBorderLessMask(color));
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

    private GradientDrawable getRoundedCornerDrawableFromColor(int color, int cornerRadius) {
        GradientDrawable drawable = new GradientDrawable();
        drawable.setColor(color);
        drawable.setCornerRadius(cornerRadius);
        return drawable;
    }

    private GradientDrawable getDrawableFromColor(int color) {
        GradientDrawable drawable = new GradientDrawable();
        drawable.setColor(color);
        return drawable;
    }

   private static Drawable getRippleBorderLessMask(int color) {
       ShapeDrawable drawable = new ShapeDrawable(new OvalShape());
       drawable.getPaint().setColor(color);
       drawable.getPaint().setAntiAlias(true);
       return drawable;
   }

}
//.___ CustomMaterialButtonDrawable __./
