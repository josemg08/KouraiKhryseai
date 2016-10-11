package josegonzalez.hephaestus.kouraikhryseai.widgets;

import android.content.Context;
import android.content.res.TypedArray;
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
            setBackgroundDrawable(new CustomMaterialButtonDrawable()
                    .getRoundedCornerButtonBackgroundRippleDrawable(mColorLight, mColorDark, mCornerRadius));
        } else {
            setBackgroundDrawable(new CustomButtonDrawable()
                    .getButtonBackgroundStateList(mColorDark, mColorLight, mCornerRadius));
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

}
//.___ End of CustomMaterialButton __./
