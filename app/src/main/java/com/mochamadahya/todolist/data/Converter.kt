package com.mochamadahya.todolist.data

import androidx.room.TypeConverter
import com.mochamadahya.todolist.data.model.Priority

class Converter {

    @TypeConverter
    fun fromPriority(priority: Priority) : String{
        return priority.name
    }

    @TypeConverter
    fun toPriority(priority: String) : Priority {
        return Priority.valueOf(priority)
    }
}