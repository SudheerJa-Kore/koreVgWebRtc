# KoreVgWebRtc sample application

This Android Studio project contains a small `app` module and the `korevgwebrtc` Android library as source code. The app consumes the library with `implementation project(':korevgwebrtc')`; it does not wrap or publish a prebuilt AAR.

The sample screen references `AudioCodesSession` to demonstrate that the app is wired to the KoreVG WebRTC module. Call setup is intentionally not configured here; it requires the signaling account and server settings for the target environment.

The app uses legacy native-library packaging with AGP 8.1.4 for 16 KB page-size compatibility. Open this project folder in Android Studio to run the sample.
