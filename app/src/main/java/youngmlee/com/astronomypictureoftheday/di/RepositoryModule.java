package youngmlee.com.astronomypictureoftheday.di;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import youngmlee.com.astronomypictureoftheday.data.Repository;
import youngmlee.com.astronomypictureoftheday.data.database.AppDao;
import youngmlee.com.astronomypictureoftheday.network.RetrofitService;


@Module
public class RepositoryModule {

    @Provides
    @Singleton
    public Repository provideRepository(RetrofitService retrofitService, AppDao appDao){
        Repository repository = new Repository(retrofitService, appDao);
        return repository;
    }

}
