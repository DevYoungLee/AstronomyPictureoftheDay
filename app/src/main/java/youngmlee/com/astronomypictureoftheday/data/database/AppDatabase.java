package youngmlee.com.astronomypictureoftheday.data.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import youngmlee.com.astronomypictureoftheday.data.model.Picture;

@Database(entities = {Picture.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase{

    static final int VERSION = 1;

    public abstract AppDao appDao();

}
