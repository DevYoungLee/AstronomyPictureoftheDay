package youngmlee.com.astronomypictureoftheday.data;

public interface RepositoryCallbacks {

    void onResponse(String message);

    void onFailure(Throwable throwable);
}
