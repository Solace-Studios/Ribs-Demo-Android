package com.solacestudios.ribs_demo_android.ribs.home

import android.util.Log
import com.solacestudios.ribs_demo_android.ribs.catalogue.CatalogueInteractor
import com.uber.rib.core.Bundle
import com.uber.rib.core.Interactor
import com.uber.rib.core.RibInteractor
import javax.inject.Inject

/**
 * Coordinates Business Logic for [HomeScope].
 *
 * TODO describe the logic of this scope.
 */
@RibInteractor
class HomeInteractor : Interactor<HomeInteractor, HomeRouter>() {

    @Inject
    lateinit var listener: Listener

    override fun didBecomeActive(savedInstanceState: Bundle?) {
        super.didBecomeActive(savedInstanceState)

        // TODO: Add attachment logic here (RxSubscriptions, etc.).
        router.attachCatalogue()
    }

    override fun willResignActive() {
        super.willResignActive()

        // TODO: Perform any required clean up here, or delete this method entirely if not needed.
    }

    interface Presenter

    inner class CatalogueParentListener: CatalogueInteractor.Listener {
        override fun onClick() {
            Log.e(this.javaClass.name, "onClick, catalogue parent listener, toggling home")

            listener.toggleHome()
        }
    }


    interface Listener {
        fun toggleHome()
    }
}
