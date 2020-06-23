package de.kabiskac.weekdaybug

import androidx.databinding.BindingAdapter
import ca.antonious.materialdaypicker.MaterialDayPicker
import de.kabiskac.weekdaybug.ui.main.deselectAllDays

@BindingAdapter("enabledWd")
fun enableDisable(weekdays: MaterialDayPicker, enabled: Boolean) {
    if (enabled) {
        weekdays.enableAllDays()
    } else {
        weekdays.disableAllDays()
        weekdays.deselectAllDays()
    }
}