package com.xynotec.navtabtemplate.ui.base

import androidx.lifecycle.ViewModel
import com.xynotec.navtabtemplate.data.DataManager

abstract class BaseViewModel : ViewModel() {
    private var mDataManager: DataManager? = null

    open fun BaseViewModel(dataManager: DataManager?) {
        mDataManager = dataManager
    }

    open fun getDataManager(): DataManager? {
        return mDataManager
    }

}