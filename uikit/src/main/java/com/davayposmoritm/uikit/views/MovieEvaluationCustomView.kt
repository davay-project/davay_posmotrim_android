package com.davayposmoritm.uikit.views

import android.content.Context
import android.content.res.TypedArray
import android.graphics.Color
import android.util.AttributeSet
import android.widget.TextView
import androidx.annotation.StyleableRes
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.core.graphics.toColor
import androidx.core.graphics.toColorInt
import com.example.uikit.R

class MovieEvaluationCustomView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : ConstraintLayout(context, attrs, defStyleAttr) {
    private val ratingIMDbTextView: TextView
    private val stringRatingIMDbTextView: TextView


    init {
        inflate(context, R.layout.movie_evaluation_custom_view, this)

        ratingIMDbTextView = findViewById(R.id.ratingIMDbTextView)
        stringRatingIMDbTextView = findViewById(R.id.stringRatingIMDbTextView)
        val ratingIMDbCard: CardView = findViewById(R.id.ratingIMDbCard)

        attrs?.applyStyleable(context, R.styleable.MovieEvaluationCustomView) {
            val rating =
                getString(R.styleable.MovieEvaluationCustomView_rating)?.toFloatOrNull() ?: 0f
            val color = getRatingColor(rating)
            stringRatingIMDbTextView.text = context.getString(R.string.rating_IMDb)
            ratingIMDbTextView.text = rating.toString()
            ratingIMDbCard.setCardBackgroundColor(color)
        }

    }

    private fun getRatingColor(rating: Float): Int {
        return when (rating) {
            in 7.0f..10.0f -> ContextCompat.getColor(context, R.color.accent_secondary_base)
            in 5.0f..6.9f -> ContextCompat.getColor(context, R.color.additional_attention)
            in 0.0f..4.9f -> ContextCompat.getColor(context, R.color.additional_error)
            else -> ContextCompat.getColor(
                context,
                R.color.accent_primary_focused
            )
        }
    }
}

inline fun AttributeSet.applyStyleable(
    context: Context,
    @StyleableRes styleableResId: IntArray,
    action: TypedArray.() -> Unit
) {
    val typedArray = context.obtainStyledAttributes(this, styleableResId)
    typedArray.action()
    typedArray.recycle()
}