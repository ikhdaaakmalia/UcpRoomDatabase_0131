package com.ikhdaamel.ucp2.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.ikhdaamel.ucp2.data.entity.Dosen
import kotlinx.coroutines.flow.Flow

@Dao
interface DosenDao {

    @Query("select * from Dosen order by nama ASC")
    fun getAllDosen() : Flow<List<Dosen>>

    @Query("select * from Dosen where nidn = :nidn")
    fun getDosen(nidn: String): Flow<Dosen>

    @Insert
    suspend fun insertDosen(
        dosen: Dosen
    )
}