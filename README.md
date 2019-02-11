# Bose-SoundTouch-API
Bose SoundTouch API

## Technologies Used :

* [Java](https://www.java.com/en/)
* [Maven](https://maven.apache.org)
* [Bose SoundTouch API](https://developer.bose.com/guides/bose-soundtouch-api/bose-soundtouch-api-reference)
* [OkHttp](https://mvnrepository.com/artifact/com.squareup.okhttp/okhttp/2.7.5)
* [Okio](https://mvnrepository.com/artifact/com.squareup.okio/okio/2.1.0)

## Steps to run the program :

1. Install SoundTouch App on your smartphone if you don't have it already. You'll need this to get the SoundTouch Device's IP Address.
<!-- [![](https://www.globalvillage.ae/wp-content/uploads/2015/01/app-store-icon.png)](https://itunes.apple.com/us/app/bose-soundtouch/id708379313?mt=8) -->
<div>
<a href='https://play.google.com/store/apps/details?id=com.bose.soundtouch&hl=en_US'><img alt='Get it on Google Play' src='assets/google_play.png' height='48px'/></a>
<a href='https://itunes.apple.com/us/app/bose-soundtouch/id708379313?mt=8'><img alt='Get it on the App Store' src='assets/app_store.png' height='48px'/></a>
</div>

<!-- Link to [iOS App](https://itunes.apple.com/us/app/bose-soundtouch/id708379313?mt=8) and link to [Android App](https://play.google.com/store/apps/details?id=com.bose.soundtouch&hl=en_US) -->

2. Connect to your device via the SoundTouch App.
3. Once you've connected to the SoundTouch device via the app, go to setting of the device in the SoundTouch App
4. Go to About section in the menu
5. Get the IP Address of the device. ( We'll need this shortly )
Now go this IP Address on your computer using a browser of your choice and enter it in the address bar along with the port number ```:8090``` as follows :
```
http://<IP Address>:8090

Example :
http://127.0.0.1:8090
```
This will prompt you to enter a network password. Enter the password of the router that the soundtouch device is connected to via the soundtouch app.
6. Now fork / clone this repository
7. Create a text file in the cloned directory, and save the IP Address retrieved in step 5. And save the filename as ```IPAddress.txt```
Save the IP Address in the following format :
```
http://<IP Address>

Example :
http://127.0.0.1
```
8. cd into this directory on your computer terminal and run the command :
```
mvn package
```
This will build the BIG FAT JAR that we'll use to run the program
9. Once the BIG FAT JAR is built successfully run the following command to execute the program :
```
Syntax :

java -jar target/remote-control-1.0-jar-with-dependencies.jar <EndPoint as Argument>

Example :

java -jar target/remote-control-1.0-jar-with-dependencies.jar volume
```

This example command will return the volume of your soundtouch device.

To set the volume enter the following command

```
java -jar target/remote-control-1.0-jar-with-dependencies.jar volume <desired volume level>

java -jar target/remote-control-1.0-jar-with-dependencies.jar volume 20
```

## API Reference :

For more such commands go to [Bose Developer Portal](https://developer.bose.com/guides/bose-soundtouch-api/bose-soundtouch-api-reference) where you'll find a bunch of API calls that you can make calls to, and enter those as the endpoints to the program in place of <EndPoint as Argument>.

