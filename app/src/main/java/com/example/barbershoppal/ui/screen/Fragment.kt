package com.example.barbershoppal.ui.screen

import android.app.Activity
import android.support.annotation.ColorRes
import android.support.annotation.DimenRes
import android.support.annotation.DrawableRes
import android.support.annotation.MenuRes
import android.support.v4.app.Fragment
import android.support.v4.content.ContextCompat
import android.view.View
import android.widget.Toolbar
import androidx.navigation.fragment.findNavController
import com.example.barbershoppal.MainActivity
import com.example.barbershoppal.R
import java.util.*

open class Fragment : Fragment() {

    val baseActivity get() = activity as Activity

    @JvmOverloads
    protected fun setToolbar(
        view: View?,
        title: String = "",
        homeAsUp: Boolean = true,
        @DrawableRes icon: Int = R.drawable.ic_back,
        @MenuRes menu: Int = -1,
        onMenuItemClick: (itemId: Int) -> Unit = {}
    ) {
        val toolbar: Toolbar? = view?.findViewById(R.id.toolbar)
        toolbar?.let {
            toolbar.title = title

            if (homeAsUp) {
                toolbar.setNavigationOnClickListener { activity?.onBackPressed() }
                toolbar.setNavigationIcon(icon)
            }

            if (menu != -1) {
                toolbar.menu.clear()
                toolbar.inflateMenu(menu)
            }

            toolbar.setOnMenuItemClickListener(Toolbar.OnMenuItemClickListener {
                onMenuItemClick(it.itemId)
                true
            })
        }
    }

    protected  open fun setTitle(title: String?) {
        (activity as? Activity)?.title = title
    }

    val navController get() = findNavController()

    protected fun dimen(@DimenRes dimen: Int) = baseActivity.resources.getDimensionPixelSize(dimen)

    /*private fun setSolidStatusBarColor() {
        if (baseActivity is MainActivity)
    }*/

    protected fun color(@ColorRes color: Int) = ContextCompat.getColor(baseActivity, color)
}