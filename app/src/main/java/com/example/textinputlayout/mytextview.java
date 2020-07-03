package com.example.textinputlayout;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.RequiresApi;

public class mytextview extends androidx.appcompat.widget.AppCompatTextView {
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    public mytextview(Context context, final String colorname, int colorid) {
        super(context);

        int paddingsize = (int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP,25,
                context.getResources().getDisplayMetrics()
        );
        LinearLayout.LayoutParams lp =
                new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT);
        lp.setMargins(0, paddingsize, 0 ,0);

        setPadding(0,paddingsize,0,paddingsize);
        if (Build.VERSION.SDK_INT>=23) {
            setBackgroundColor(getResources().getColor(colorid,null));
        } else {
            setBackgroundColor(getResources().getColor(colorid));
        }
        setText(colorname);

        setTextSize(TypedValue.COMPLEX_UNIT_SP,24);
        setTypeface(getTypeface(), Typeface.BOLD);
        setTextAlignment(TEXT_ALIGNMENT_CENTER);

        setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),
                        String.format("This box is %s",colorname),
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}
