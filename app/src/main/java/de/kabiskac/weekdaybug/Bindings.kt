package de.kabiskac.weekdaybug

import androidx.databinding.BindingAdapter
import ca.antonious.materialdaypicker.MaterialDayPicker

@BindingAdapter("enabledWd")
fun enableDisable(weekdays: MaterialDayPicker, enabled: Boolean) {
    if (enabled) {
        weekdays.enableAllDays()
    } else {
        weekdays.disableAllDays()
        weekdays.clearSelection()
    }
}
