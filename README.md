# AstronomyPictureoftheDay
Android app that displays content from nasa's apod service <br />
<br />
The application follows MVVM architecture <br />
A single activity pattern is used for flexible UI <br />
Dagger 2 is used for handling dependencies <br />
RxJava 2 is used for backround tasks <br />
JSON data is fetched from NASA's APOD Service <br />
Picasso is used for image loading <br />
Room is used for persistent data storage which allows for offline use <br />
RecyclerView with a LinearLayoutManager is used to show the list of images <br />
Firebase JobDispatcher is used for recurring background tasks <br />
<br />
The main screen shows the latest images from the APOD service: <br />
![Alt text](screenshots/main_screen.png "Main Screen") <br />
<br />
The detail screen shows a brief explanation written by astronomy professors: <br />
![Alt text](screenshots/detail_screen.png "Detail Screen") <br />
<br />
ViewPaper allows for horizontal scrolling: <br />
![Alt text](screenshots/detail_screen_transition.png "Detail Screen Transition") <br />
<br />
The Settings Screen allows users to toggle notifications and daily wallpaper updates <br />
![Alt text](screenshots/settings_screen.png "Settings Screen") <br />
Clicking on the image opens a screen for detailed image viewing which allows zooming in/out: <br />
![Alt text](screenshots/picture_detail_screen.png "Picture Detail Screen") <br />
<br />
On this detail screen, users can share the image or choose to : <br />
![Alt text](screenshots/share_screen.png "Share Screen") <br />
<br />
Users can also set the image as wallpaper on the homescreen or the lockscreen <br />
![Alt text](screenshots/set_wallpaper_screen.png "Set Wallpaper Screen") <br />
<br />
![Alt text](screenshots/home_wallpaper.png "Wallpaper Set") <br />
<br />
Users can also choose to save the image to external storage and have Google Photos scan the image <br />
![Alt text](screenshots/saved_photo.png "Saved Photo") <br />
<br />
If you would like to try out the app, 
sign up for an API key at: https://api.nasa.gov/index.html#apply-for-an-api-key, 
then enter the key at network/RetrofitService
<br />
Thank you for reading! <br />
Any suggestions will be greatly appreciated! <br />
