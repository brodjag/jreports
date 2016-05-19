package com.jackreports;

import android.graphics.drawable.ColorDrawable;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.sothree.slidinguppanel.ScrollableViewHelper;
import com.sothree.slidinguppanel.SlidingUpPanelLayout;

/**
 * Created by brodjag on 18.05.16.
 */
public class SwipeSet {
    android.support.v7.app.ActionBar actionBar;
    MainActivity con;
    SlidingUpPanelLayout slidingUpPanelLayout;
    public SwipeSet(MainActivity activity){
       con=activity;

        actionBar = con.getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(con.getResources().getColor(R.color.header_transporent)));
//        con.getWindow().requestFeature(Window.FEATURE_ACTION_BAR_OVERLAY);

        LinearLayout.LayoutParams params= (LinearLayout.LayoutParams) ( con.findViewById(R.id.sliding_layout)).getLayoutParams();
        TypedValue tv = new TypedValue();
        int actionBarHeight=0;
        if (con.getTheme().resolveAttribute(android.R.attr.actionBarSize, tv, true))
        {
            actionBarHeight = TypedValue.complexToDimensionPixelSize(tv.data,con.getResources().getDisplayMetrics())+ con.getResources().getDimensionPixelSize(R.dimen.swipe_shadow_height);
        }
        params.setMargins(0,actionBarHeight,0,0);
        ( con.findViewById(R.id.sliding_layout)).setLayoutParams(params);


       // ((LinearLayout) con.findViewById(R.id.sliding_layout_contaner)).setPadding(0,actionBar.getHeight()+(int)con.getResources().getDimension(R.dimen.swipe_shadow_height),0,0);

         slidingUpPanelLayout=(SlidingUpPanelLayout) con.findViewById(R.id.sliding_layout);
        slidingUpPanelLayout.setPanelHeight(300);

        new NestedScrollableViewHelper();

        con.findViewById(R.id.show_list_bn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if( slidingUpPanelLayout.getPanelState().equals(SlidingUpPanelLayout.PanelState.HIDDEN)) {
                   slidingUpPanelLayout.setPanelState(SlidingUpPanelLayout.PanelState.COLLAPSED);
                   ((TextView)con.findViewById(R.id.show_list_bn)).setText("HIDE LIST");
                   //todo change color of panel
               }else {
                   slidingUpPanelLayout.setPanelState(SlidingUpPanelLayout.PanelState.HIDDEN);
                   ((TextView)con.findViewById(R.id.show_list_bn)).setText("SHOW LIST");
               }

            }
        });


        slidingUpPanelLayout.addPanelSlideListener(new SlidingUpPanelLayout.PanelSlideListener() {
            @Override
            public void onPanelSlide(View panel, float slideOffset) {

            }

            @Override
            public void onPanelStateChanged(View panel, SlidingUpPanelLayout.PanelState previousState, SlidingUpPanelLayout.PanelState newState) {
                if(newState.equals(SlidingUpPanelLayout.PanelState.HIDDEN)){
                    con.findViewById(R.id.bottom_panel).setBackgroundColor(con.getResources().getColor(R.color.header_transporent));
                    actionBar.setBackgroundDrawable(new ColorDrawable(con.getResources().getColor(R.color.header_transporent)));
                   // con.getWindow().requestFeature(Window.FEATURE_ACTION_BAR_OVERLAY);
                }else if(newState.equals(SlidingUpPanelLayout.PanelState.COLLAPSED)) {
                    con.findViewById(R.id.bottom_panel).setBackgroundColor(con.getResources().getColor(R.color.header_transporent2));
                    actionBar.setBackgroundDrawable(new ColorDrawable(con.getResources().getColor(R.color.header_transporent2)));



                }else if(newState.equals(SlidingUpPanelLayout.PanelState.EXPANDED)){
                    con.findViewById(R.id.bottom_panel).setBackgroundColor(con.getResources().getColor(R.color.header_black));
                    actionBar.setBackgroundDrawable(new ColorDrawable(con.getResources().getColor(R.color.header_black)));

                }
            }
        });

    }

    public class NestedScrollableViewHelper extends ScrollableViewHelper {
        public int getScrollableViewScrollPosition(View scrollableView, boolean isSlidingUp) {
            View mScrollableView= con.findViewById(R.id.marcs_recycler_view);

            if (mScrollableView instanceof NestedScrollView) {
                if(isSlidingUp){
                    return mScrollableView.getScrollY();
                } else {
                    NestedScrollView nsv = ((NestedScrollView) mScrollableView);
                    View child = nsv.getChildAt(0);
                    return (child.getBottom() - (nsv.getHeight() + nsv.getScrollY()));
                }
            } else {
                return 0;
            }
        }
    }
}
