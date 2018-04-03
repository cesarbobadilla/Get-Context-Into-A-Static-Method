# Get-Context-Into-A-Static-Method

In this example, we use a static class “AsyncWeb” who allows you to perform background operations and publish results on the UI thread without having to manipulate threads and/or handlers. 

The “AsyncWeb” class shows by toast method a first message using the class “getContext”, after that, the class “createFile” gets the JSON message from the cloud and save it in a file named “tempFile”, finally the class “readFile” reads the created file before (tempFile), and the content again is show it by the method “Toast” the default message “from cloud” and the response from the cloud.

Finally it is really important to update our “AndroidManifest.xml” to use this Application subclass, for instance in this example:
<h1>AndroidManifest.xml</h1>

&lt;application<br>
    android:allowBackup="true"<br>
    android:icon="@mipmap/ic_launcher"<br>
    android:label="@string/app_name"<br>
    android:roundIcon="@mipmap/ic_launcher_round"<br>
    android:supportsRtl="true"<br>
    android:theme="@style/AppTheme"<br>
    android:name=".getContext"<br>
    &gt;

Any question c.bobadilla@ideltas.com or cesarbobadillamedina@gmail.com

<h1>How to use it</h1>
"main" it is the file, inside "nameprojectapp/app/src"<br>
"demo" it is the file to upload into the apache server to use as a cloud.<br>

<h1>Contribution</h1>

1. Fork the code<br>
2. Suggest improvements by email to c.bobadilla@ideltas.com
