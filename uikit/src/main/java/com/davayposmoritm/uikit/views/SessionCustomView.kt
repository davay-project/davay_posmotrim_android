package com.davayposmoritm.uikit.views

import android.content.Context
import android.util.AttributeSet
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.bumptech.glide.Glide
import com.davayposmoritm.uikit.views.ext.applyStyleable
import com.example.uikit.R


class SessionCustomView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : ConstraintLayout(context, attrs, defStyleAttr) {
    init {
        inflate(context, R.layout.session_custom_view, this)

        attrs?.applyStyleable(context, R.styleable.SessionCustomView) {
            findViewById<TextView>(R.id.titleSessionTextView).text =
                getString(R.styleable.SessionCustomView_titleSession)

            findViewById<TextView>(R.id.subtitleSessionTextView).text =
                getString(R.styleable.SessionCustomView_subtitleSession)

            findViewById<TextView>(R.id.countMatchesSessionTextView).text =
                getString(R.styleable.SessionCustomView_matchesCount)

            findViewById<TextView>(R.id.countStringMatchesSessionTextView).text ="matches: " /////

            val imageUrl = getString(R.styleable.SessionCustomView_imageUrl)
            Glide.with(context)
                .load(imageUrl)
                .into(findViewById(R.id.imageSession))


        }
    }
}
