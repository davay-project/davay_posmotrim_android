package com.davayposmoritm.uikit.views

import android.content.Context
import android.util.AttributeSet
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
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


        }

    }
}
