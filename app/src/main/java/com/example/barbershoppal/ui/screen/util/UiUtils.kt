package com.example.barbershoppal.ui.screen.util

import android.content.Context
import android.content.res.Resources
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.PorterDuff
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.support.annotation.ColorRes
import android.support.annotation.DrawableRes
import android.support.annotation.LayoutRes
import android.support.graphics.drawable.VectorDrawableCompat
import android.support.v4.app.Fragment
import android.support.v4.content.ContextCompat
import android.support.v4.graphics.drawable.DrawableCompat
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import androidx.navigation.navOptions

object UiUtils {

    val transition
        get() = navOptions {
            anim {

            }
        }

    @JvmStatic
    fun inflateParentless(context: Context, @LayoutRes layoutId: Int): View {
        return LayoutInflater.from(context).inflate(layoutId, null, false)
    }

    @JvmStatic
    fun isFragmentAlive(fragment: Fragment): Boolean {
        val isFragmentAlive = fragment.isAdded && !fragment.isDetached

        return isFragmentAlive
    }

    @JvmStatic
    fun getTintedVectorDrawable(context: Context, @DrawableRes drawable: Int, @ColorRes color: Int): Drawable {
        val tintedDrawable = DrawableCompat.wrap(VectorDrawableCompat.create(context.resources, drawable, null)!!.mutate())
        DrawableCompat.setTint(tintedDrawable, ContextCompat.getColor(context, color))
        DrawableCompat.setTintMode(tintedDrawable, PorterDuff.Mode.SRC_IN)
        return tintedDrawable
    }

    @JvmStatic
    fun setTintedLeftVectorDrawable(txtView: TextView, @DrawableRes drawable: Int, @ColorRes color: Int) {
        val tintedLeftDrawable = getTintedVectorDrawable(txtView.context, drawable, color)
        txtView.setCompoundDrawablesWithIntrinsicBounds(tintedLeftDrawable, null, null, null)
    }

    @JvmStatic
    fun getVectorDrawable(context: Context, @DrawableRes drawable: Int): Drawable {
        return DrawableCompat.wrap(VectorDrawableCompat.create(context.resources, drawable, null)!!.mutate())
    }

    @JvmStatic
    fun getDrawable(context: Context, @DrawableRes drawable: Int): Drawable {
        return DrawableCompat.wrap(ContextCompat.getDrawable(context, drawable)!!.mutate())
    }

    @JvmStatic
    fun getBitmapDrawable(resources: Resources, @DrawableRes bitmapDrawableId: Int): BitmapDrawable {
        val options = BitmapFactory.Options()
        options.inPreferredConfig = Bitmap.Config.RGB_565
        return BitmapDrawable(resources, BitmapFactory.decodeResource(resources, bitmapDrawableId, options))
    }
}