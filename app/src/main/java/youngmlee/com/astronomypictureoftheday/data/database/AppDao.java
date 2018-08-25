package youngmlee.com.astronomypictureoftheday.data.database;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import java.util.List;

import youngmlee.com.astronomypictureoftheday.data.model.Picture;

@Dao
public interface AppDao {

    @Query("SELECT * FROM picture")
    LiveData<List<Picture>> getAll();

    @Query("SELECT * FROM picture WHERE date LIKE :queryDate")
    Picture getPictureByDate(String queryDate);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAll(List<Picture> pictureList);

    @Query("DELETE FROM picture")
    void deleteAll();

}
