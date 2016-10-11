package josegonzalez.hephaestus.kouraikhryseai.widgets;

import android.content.Context;
import android.content.res.TypedArray;
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

    protected int mColorDark;
    protected int mColorLight;
    protected int mCornerRadius = 20;

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
        mColorDark = typedArray.getColor(R.styleable.CustomButton_colorDark, -1);
        mColorLight = typedArray.getColor(R.styleable.CustomButton_colorLight, -1);

        setText(getText());
        typedArray.recycle();
        setBackground();
    }

    protected void setBackground() {
        setBackgroundDrawable(new CustomButtonDrawable()
                .getButtonBackgroundStateList(mColorDark, mColorLight, mCornerRadius));
    }

    @Override
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        if (enabled) {
            setBackground();
        } else if (mColorDark != -1) {
            setBackgroundColor(mColorDark);
        }
    }

    @SuppressWarnings("unused")
    public void setColorDark(int mColorDark) {
        this.mColorDark = mColorDark;
        setBackground();
    }

    @SuppressWarnings("unused")
    public void setColorLight(int mColorLight) {
        this.mColorLight = mColorLight;
        setBackground();
    }

    @SuppressWarnings("unused")
    public void setCornerRadius(int radius){
        mCornerRadius = radius;
    }

}
//.___ End of CustomButton __./
