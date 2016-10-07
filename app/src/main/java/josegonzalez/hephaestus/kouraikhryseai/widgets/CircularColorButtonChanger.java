package josegonzalez.hephaestus.kouraikhryseai.widgets;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.widget.Button;
import android.widget.RelativeLayout;

import josegonzalez.hephaestus.kouraikhryseai.R;

/**
 * .___
 * Created by Jose Gonzalez
 *
 * Argentina Sep 2016
 * __.
 */

@TargetApi(Build.VERSION_CODES.LOLLIPOP)
public class CircularColorButtonChanger extends RelativeLayout {

    private CustomButton mFirstButton;
    private CustomButton mSecondButton;

    public CircularColorButtonChanger(Context context) {
        super(context);
    }

    public CircularColorButtonChanger(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public CircularColorButtonChanger(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        inflate(getContext(), R.layout.circular_color_changing_buttons, this);
        mFirstButton = (CustomButton) findViewById(R.id.first_button);
        mSecondButton = (CustomButton) findViewById(R.id.second_button);
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.CircularColorButtonChanger);

        initButtonTextStyles(typedArray);
        initFirstButton(typedArray);
        initSecondButton(typedArray);

        addCircularRevealOnTouch();
        typedArray.recycle();
    }

    private void initButtonTextStyles(TypedArray typedArray){
        float textSize = typedArray.getDimensionPixelSize(R.styleable.CircularColorButtonChanger_android_textSize, 0);
        if(textSize > 0) {
            mFirstButton.setTextSize(TypedValue.COMPLEX_UNIT_PX, textSize);
            mSecondButton.setTextSize(TypedValue.COMPLEX_UNIT_PX, textSize);
        }
        mFirstButton.setTextColor(typedArray.getColor(R.styleable.CircularColorButtonChanger_android_textColor, -1));
        mSecondButton.setTextColor(typedArray.getColor(R.styleable.CircularColorButtonChanger_android_textColor, -1));
    }

    private void initFirstButton(TypedArray typedArray){
        mFirstButton.setColorDark(typedArray.getColor(R.styleable.CircularColorButtonChanger_firstButtonColorDark, -1));
        mFirstButton.setColorLight(typedArray.getColor(R.styleable.CircularColorButtonChanger_firstButtonColorLight, -1));
        mFirstButton.setText(typedArray.getString(R.styleable.CircularColorButtonChanger_firstButtonText));
    }

    private void initSecondButton(TypedArray typedArray){
        mSecondButton.setColorDark(typedArray.getColor(R.styleable.CircularColorButtonChanger_secondButtonColorDark, -1));
        mSecondButton.setColorLight(typedArray.getColor(R.styleable.CircularColorButtonChanger_secondButtonColorLight, -1));
        mSecondButton.setText(typedArray.getString(R.styleable.CircularColorButtonChanger_secondButtonText));
    }

    private void addCircularRevealOnTouch(){
        mFirstButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN
                        || event.getAction() == MotionEvent.ACTION_BUTTON_PRESS
                        || event.getAction() == MotionEvent.ACTION_POINTER_DOWN) {
                    mFirstButton.performClick();
                    mSecondButton.bringToFront();
                    selectButton(mSecondButton, (int) event.getX(), (int) event.getY());
                }
                return true;
            }
        });
        mSecondButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN
                        || event.getAction() == MotionEvent.ACTION_BUTTON_PRESS
                        || event.getAction() == MotionEvent.ACTION_POINTER_DOWN) {
                    mSecondButton.performClick();
                    mFirstButton.bringToFront();
                    selectButton(mFirstButton, (int) event.getX(), (int) event.getY());
                }
                return true;
            }
        });
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    private void selectButton(Button button, int startX, int startY) {
        ViewAnimationUtils.createCircularReveal(button,
                startX,
                startY,
                0,
                button.getHeight()).start();
    }

    public CustomButton getFirstButton(){
        return mFirstButton;
    }

    public CustomButton getSecondButton(){
        return mSecondButton;
    }

}
//.___ End of CircularColorButtonChanger __./
