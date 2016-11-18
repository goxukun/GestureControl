package com.xukun.forever.gesturecontrol;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.xukun.forever.gesturecontrol.view.LockPatternView;

import java.util.List;

/**
 * 手势密码
 * author xk
 * time 2016年11月18日15:59:56
 */
public class GestureActivity extends Activity  {

    private LockPatternView mLockPatternView;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gesture);

        mLockPatternView = (LockPatternView) findViewById(R.id.SpLockPattern);
        mLockPatternView.setOnPatternListener(new LockPatternView.OnPatternListener() {
            @Override
            public void onPatternCellAdded(List<LockPatternView.Cell> pattern) {
                mLockPatternView.setDisplayMode(LockPatternView.DisplayMode.Wrong);
            }

            @Override
            public void onPatternCleared() {

            }

            @Override
            public void onPatternDetected(List<LockPatternView.Cell> pattern) {

            }

            @Override
            public void onPatternStart() {

            }
        });
    }


}
