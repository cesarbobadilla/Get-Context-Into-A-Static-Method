# Get-Context-Into-A-Static-Method

In this example, we use a static class “AsyncWeb” who allows you to perform background operations and publish results on the UI thread without having to manipulate threads and/or handlers. 

The “AsyncWeb” class shows by toast method a first message using the class “getContext”, after that, the class “createFile” gets the JSON message from the cloud and save it in a file named “tempFile”, finally the class “readFile” reads the created file before (tempFile), and the content again is show it by the method “Toast” the default message “from cloud” and the response from the cloud.

Finally it is really important to update our “AndroidManifest.xml” to use this Application subclass, for instance in this example:
<h1>test</h1>

&lt;application
    android:allowBackup="true"
    android:icon="@mipmap/ic_launcher"
    android:label="@string/app_name"
    android:roundIcon="@mipmap/ic_launcher_round"
    android:supportsRtl="true"
    android:theme="@style/AppTheme"
    android:name=".getContext"
    &gt;
	

