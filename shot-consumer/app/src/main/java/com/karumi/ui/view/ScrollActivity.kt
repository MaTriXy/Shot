package com.karumi.ui.view

import androidx.appcompat.widget.Toolbar
import com.github.salomonbrys.kodein.Kodein
import com.github.salomonbrys.kodein.bind
import com.github.salomonbrys.kodein.instance
import com.github.salomonbrys.kodein.provider
import com.karumi.R
import com.karumi.ui.presenter.ScrollPresenter

class ScrollActivity : BaseActivity(), ScrollPresenter.View {

    override val layoutId: Int = R.layout.scroll_activity
    override val presenter: ScrollPresenter by injector.instance()
    override val toolbarView: Toolbar by lazy { findViewById(R.id.toolbar) }

    override val activityModules = Kodein.Module(allowSilentOverride = true) {
        bind<ScrollPresenter>() with provider {
            ScrollPresenter()
        }
    }
}