package com.davayposmoritm.uikit.views

import android.content.Context
import android.util.AttributeSet
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.davayposmoritm.uikit.views.ext.applyStyleable
import com.example.uikit.R


class DavayBannerView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : CardView(context, attrs, defStyleAttr) {


    init {
        inflate(context, R.layout.davay_banner_view,this)
        attrs?.applyStyleable(context, R.styleable.DavayBannerView){
            setBannerType(getInt(R.styleable.DavayBannerView_option,0))
        }
    }
    val icon=findViewById<ImageView>(R.id.banner_icon)
    val backgroundColor=findViewById<LinearLayout>(R.id.banner_color)
    val bannerText=findViewById<TextView>(R.id.banner_text)

     fun setBannerType(option: Int) {
        when (option) {
            CHOOSE_AT_LEAST_ONE -> {
                icon.setImageResource(R.drawable.ic_info)
                backgroundColor.setBackgroundColor(resources.getColor(R.color.additional_attention))
                bannerText.text= R.string.bannerChoseOne.toString()
            }
            CODE_COPY_SUCCESS -> {
                icon.setImageResource(R.drawable.ic_tick_circle)
                backgroundColor.setBackgroundColor(resources.getColor(R.color.additional_info))
                bannerText.text= R.string.bannerSuccess.toString()
            }
            CODE_COPY_SUCCESS_DARKMODE -> {
                icon.setImageResource(R.drawable.ic_tick_circle)
                backgroundColor.setBackgroundColor(resources.getColor(R.color.additional_done))
                bannerText.text= R.string.bannerSuccess.toString()
            }

        }
    }
    companion object{
        const val CHOOSE_AT_LEAST_ONE = 0
        const val CODE_COPY_SUCCESS = 1
        const val CODE_COPY_SUCCESS_DARKMODE = 2
    }
}