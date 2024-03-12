package com.davayposmoritm.uikit.views

import android.content.Context
import android.content.res.TypedArray
import android.graphics.Color
import android.util.AttributeSet
import android.widget.TextView
import androidx.annotation.StyleableRes
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.uikit.R

class MovieEvaluationCustomView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : ConstraintLayout(context, attrs, defStyleAttr) {

    val rating1IMDb = findViewById<TextView>(R.id.ratingIMDbTextView)


    init {
        inflate(context, R.layout.movie_evaluation_custom_view, this)

        attrs?.applyStyleable(context, R.styleable.MovieEvaluationCustomView) {
            rating1IMDb.text = getString(R.styleable.MovieEvaluationCustomView_rating)
            rating1IMDb.setTextColor(getColor(R.styleable.MovieEvaluationCustomView_color, Color.BLACK))
        }
    }
}

inline fun AttributeSet.applyStyleable(context: Context,
                                       @StyleableRes styleableResId: IntArray,
                                       action: TypedArray.() -> Unit) {

    val typedArray = context.obtainStyledAttributes(this, styleableResId)
    typedArray.action()
    typedArray.recycle()
}