package com.boltuix.jetpackcomposedev

import android.app.Activity
import android.content.Intent
import com.google.android.play.core.appupdate.AppUpdateManagerFactory
import com.google.android.play.core.install.model.AppUpdateType
import com.google.android.play.core.install.model.UpdateAvailability

class InAppUpdateHelper(private val activity: Activity) {

    private val REQUEST_CODE_UPDATE = 100

    fun checkForUpdate(immediate: Boolean = true) {
        val appUpdateManager = AppUpdateManagerFactory.create(activity)
        val appUpdateInfoTask = appUpdateManager.appUpdateInfo

        appUpdateInfoTask.addOnSuccessListener { appUpdateInfo ->
            if (appUpdateInfo.updateAvailability() == UpdateAvailability.UPDATE_AVAILABLE) {

                val updateType = if (immediate) AppUpdateType.IMMEDIATE else AppUpdateType.FLEXIBLE

                if (appUpdateInfo.isUpdateTypeAllowed(updateType)) {
                    appUpdateManager.startUpdateFlowForResult(
                        appUpdateInfo,
                        updateType,
                        activity,
                        REQUEST_CODE_UPDATE
                    )
                }
            }
        }
    }

    fun handleActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == REQUEST_CODE_UPDATE) {
            if (resultCode != Activity.RESULT_OK) {
                // Update cancelled or failed
                // You can show a Toast or log it
            }
        }
    }
}