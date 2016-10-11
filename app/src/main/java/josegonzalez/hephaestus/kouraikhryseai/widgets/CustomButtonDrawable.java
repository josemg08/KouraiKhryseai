package josegonzalez.hephaestus.kouraikhryseai.widgets;

import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;

/**
 * .___
 * Created by Jose Gonzalez
 *
 * Argentina Oct 2016
 * __.
 */

class CustomButtonDrawable {

     StateListDrawable getButtonBackgroundStateList(int colorDark, int colorLight, int cornerRadius){
        final StateListDrawable states = new StateListDrawable();

        GradientDrawable drawable = new GradientDrawable();
        drawable.setColor(colorDark);
        drawable.setCornerRadius(cornerRadius);
        states.addState(new int[]{android.R.attr.state_pressed}, drawable);

        drawable = new GradientDrawable();
        drawable.setColor(colorLight);
        drawable.setCornerRadius(cornerRadius);
        states.addState(new int[]{}, drawable);
        return states;
    }

}
//.___ CustomMaterialButtonDrawable __./
