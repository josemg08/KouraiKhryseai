package josegonzalez.hephaestus.kouraikhryseai.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.StateListDrawable;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;

import josegonzalez.hephaestus.kouraikhryseai.R;

/**
 * .___
 * Created by Jose Gonzalez
 *
 * Argentina Oct 2016
 * __.
 */

public class CustomButton extends AppCompatButton {

    protected int colorDark;
    protected int colorLight;

    public CustomButton(Context context) {
        super(context);
    }

    public CustomButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        initButton(context, attrs);
    }

    public CustomButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        initButton(context, attrs);
    }

    protected void initButton(Context context, AttributeSet attrs) {
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.CustomButton);
        colorDark = typedArray.getColor(R.styleable.CustomButton_colorDark, -1);
        colorLight = typedArray.getColor(R.styleable.CustomButton_colorLight, -1);

        setText(getText());
        typedArray.recycle();
        setBackground();
    }

    protected void setBackground() {
        setBackgroundDrawable(getButtonBackgroundStateList());
    }

    protected StateListDrawable getButtonBackgroundStateList(){
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

    @SuppressWarnings("unused")
    public void setColorDark(int colorDark) {
        this.colorDark = colorDark;
        setBackground();
    }

    @SuppressWarnings("unused")
    public void setColorLight(int colorLight) {
        this.colorLight = colorLight;
        setBackground();
    }

}
//.___ End of CustomButton __./
