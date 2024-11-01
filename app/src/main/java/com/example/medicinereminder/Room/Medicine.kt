package com.example.medicinereminder.Room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "medicine_table")
data class Medicine(
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    val name: String,
    val dosage: String,
    val timeToTake: String,

    val imageUri: String? = null, // Store image URI as String

    var isTaken: Boolean = false
)
