package com.maximeesprit.traningandroidapp

import android.content.Context
import android.support.design.widget.CoordinatorLayout
import android.support.v7.widget.Toolbar
import android.util.AttributeSet
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class CustomBehavior(context: Context?, attrs: AttributeSet?) : CoordinatorLayout.Behavior<ImageView>(context, attrs) {

    val TAG = "CustomBehavior";

    override fun layoutDependsOn(parent: CoordinatorLayout, child: ImageView, dependency: View): Boolean {
        return dependency is TextView;
    }

    override fun onDependentViewChanged(parent: CoordinatorLayout, child: ImageView, dependency: View): Boolean {
        val dependencyLocation = IntArray(2);
        val childLocation = IntArray(2);

        dependency.getLocationInWindow(dependencyLocation);
        child.getLocationInWindow(childLocation);

        val diff = childLocation[1] - dependencyLocation[1];
        if(diff > 0) {
            val scale = (diff/childLocation[1]).toFloat();
            Log.d(TAG, "scale == " + scale);
            child.setScaleX(1+scale);
            child.setScaleY(1+scale);
        }
        return false;
    }
}