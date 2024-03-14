package com.davayposmoritm.uikit.views

import android.content.Context
import android.content.res.TypedArray
import android.util.AttributeSet
import android.widget.TextView
import androidx.annotation.StyleableRes
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import com.example.uikit.R

class MovieEvaluationCustomView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : ConstraintLayout(context, attrs, defStyleAttr) {
    private val ratingTextView: TextView
    private val titleTextView: TextView
    private val subtitleTextView: TextView

    init {
        inflate(context, R.layout.movie_evaluation_custom_view, this)

        ratingTextView = findViewById(R.id.ratingTextView)
        titleTextView = findViewById(R.id.titleTextView)
        subtitleTextView = findViewById(R.id.subtitleTextView)
        val ratingCard: CardView = findViewById(R.id.ratingCard)

        attrs?.applyStyleable(context, R.styleable.MovieEvaluationCustomView) {
            val rating =
                getString(R.styleable.MovieEvaluationCustomView_rating)?.toFloatOrNull() ?: 0f
            val color = getRatingColor(rating)
            titleTextView.text = context.getString(R.string.titleRating)
            subtitleTextView.text = context.getString(R.string.subtitleRating)
            ratingTextView.text = rating.toString()
            ratingCard.setCardBackgroundColor(color)
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