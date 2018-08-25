package youngmlee.com.astronomypictureoftheday.network;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;
import youngmlee.com.astronomypictureoftheday.data.model.Picture;

public interface RetrofitService {

    String API_KEY = "****ENTER_YOUR_API_KEY_HERE****";

    @GET("planetary/apod?api_key=" + API_KEY)
    Single<Picture> getLatestPicture();

    @GET("planetary/apod?api_key=" + API_KEY)
    Single<List<Picture>> getRandomCountPictures (@Query("count") int count);

    //String date is in YYYY-MM-DD format
    @GET("planetary/apod?api_key=" + API_KEY)
    Single<Picture> getPictureByDate(@Query("date") String date);

    //String date is in YYYY-MM-DD format
    @GET("planetary/apod?api_key=" + API_KEY)
    Single<List<Picture>> getPicturesFromDateRange (@Query("start_date") String startDate, @Query("end_date") String endDate);

}
