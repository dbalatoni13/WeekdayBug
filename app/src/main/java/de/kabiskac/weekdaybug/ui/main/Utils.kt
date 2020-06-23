package de.kabiskac.weekdaybug.ui.main

import ca.antonious.materialdaypicker.MaterialDayPicker

fun MaterialDayPicker.deselectAllDays() {
    deselectDay(MaterialDayPicker.Weekday.MONDAY)
    deselectDay(MaterialDayPicker.Weekday.TUESDAY)
    deselectDay(MaterialDayPicker.Weekday.WEDNESDAY)
    deselectDay(MaterialDayPicker.Weekday.THURSDAY)
    deselectDay(MaterialDayPicker.Weekday.FRIDAY)
    deselectDay(MaterialDayPicker.Weekday.SATURDAY)
    deselectDay(MaterialDayPicker.Weekday.SUNDAY)
}