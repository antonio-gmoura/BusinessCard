package br.com.tota.businesscard

import android.app.Application
import br.com.tota.businesscard.data.AppDatabase
import br.com.tota.businesscard.data.BusinessCardRepository

class App : Application() {
    val database by lazy { AppDatabase.getDatabase(this) }
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
}