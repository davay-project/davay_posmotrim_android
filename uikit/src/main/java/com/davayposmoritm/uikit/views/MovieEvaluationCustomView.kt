package com.davayposmoritm.uikit.views

import android.content.Context
import android.content.res.TypedArray
import android.util.AttributeSet
import android.widget.TextView
import androidx.annotation.StyleableRes
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import com.davayposmoritm.uikit.views.ext.applyStyleable
import com.example.uikit.R

class MovieEvaluationCustomView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : ConstraintLayout(context, attrs, defStyleAttr) {

    init {
        inflate(context, R.layout.movie_evaluation_custom_view, this)

        attrs?.applyStyleable(context, R.styleable.MovieEvaluationCustomView) {
            findViewById<TextView>(R.id.ratingTextView).text =
                getString(R.styleable.MovieEvaluationCustomView_rating)?.toFloatOrNull()?.toString()
                    ?: "0"
            findViewById<CardView>(R.id.ratingCard).setCardBackgroundColor(
                getRatingColor(
                    getString(
                        R.styleable.MovieEvaluationCustomView_rating
                    )?.toFloatOrNull() ?: 0f
                )
            )
            findViewById<TextView>(R.id.titleTextView).text =
                getString(R.styleable.MovieEvaluationCustomView_titleEvaluation)
            findViewById<TextView>(R.id.subtitleTextView).text =
                getString(R.styleable.MovieEvaluationCustomView_subtitleEvaluation)
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

