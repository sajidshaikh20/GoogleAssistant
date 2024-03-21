package com.example.googleassistant.assistant;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0019\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010,\u001a\u00020-H\u0002J\b\u0010.\u001a\u00020-H\u0002J\b\u0010/\u001a\u00020-H\u0002J\b\u00100\u001a\u00020-H\u0002J\u0006\u00101\u001a\u00020-J\u0006\u00102\u001a\u00020-J\b\u00103\u001a\u00020-H\u0002J\u0006\u00104\u001a\u00020-J\u0010\u00105\u001a\u00020\u00042\u0006\u00106\u001a\u00020\u0004H\u0002J\u0010\u00107\u001a\u00020-2\u0006\u00108\u001a\u000209H\u0002J\u0006\u0010:\u001a\u00020-J\b\u0010;\u001a\u00020-H\u0002J\b\u0010<\u001a\u00020-H\u0002J\b\u0010=\u001a\u00020-H\u0002J\b\u0010>\u001a\u00020-H\u0002J\"\u0010?\u001a\u00020-2\u0006\u0010@\u001a\u00020\u00042\u0006\u0010A\u001a\u00020\u00042\b\u0010B\u001a\u0004\u0018\u00010%H\u0014J\b\u0010C\u001a\u00020-H\u0016J\u0012\u0010D\u001a\u00020-2\b\u0010E\u001a\u0004\u0018\u00010FH\u0015J\b\u0010G\u001a\u00020-H\u0014J-\u0010H\u001a\u00020-2\u0006\u0010@\u001a\u00020\u00042\u000e\u0010I\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140J2\u0006\u0010K\u001a\u00020LH\u0016\u00a2\u0006\u0002\u0010MJ\b\u0010N\u001a\u00020-H\u0002J\b\u0010O\u001a\u00020-H\u0002J\b\u0010P\u001a\u00020-H\u0002J\b\u0010Q\u001a\u00020-H\u0002J\b\u0010R\u001a\u00020-H\u0002J\b\u0010S\u001a\u00020-H\u0002J\b\u0010T\u001a\u00020-H\u0002J\b\u0010U\u001a\u00020-H\u0002J\b\u0010V\u001a\u00020-H\u0002J\b\u0010W\u001a\u00020-H\u0002J\b\u0010X\u001a\u00020-H\u0002J\b\u0010Y\u001a\u00020-H\u0002J\u000e\u0010Z\u001a\u00020-2\u0006\u0010[\u001a\u00020\u0014J\u0010\u0010\\\u001a\u00020-2\u0006\u0010]\u001a\u00020\u001fH\u0002J\b\u0010^\u001a\u00020-H\u0002J\u0012\u0010_\u001a\u0004\u0018\u00010\u00142\u0006\u0010[\u001a\u00020\u0014H\u0002J\b\u0010`\u001a\u00020-H\u0002J\b\u0010a\u001a\u00020-H\u0002J\b\u0010b\u001a\u00020-H\u0002J\b\u0010c\u001a\u00020-H\u0002J\b\u0010d\u001a\u00020-H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u001c\u0010\u0002R\u000e\u0010\u001d\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0014X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0014X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0014X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\'X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006e"}, d2 = {"Lcom/example/googleassistant/assistant/AssistantActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "CAPTUREPHOTO", "", "READCONTACTS", "READSMS", "REQUESTCALL", "REQUEST_CODE_SELECT_DOC", "REQUEST_ENABLE_BT", "SENDSMS", "SHAREAFILE", "SHAREATEXTFILE", "assistantViewModel", "Lcom/example/googleassistant/assistant/AssistantViewModel;", "binding", "Lcom/example/googleassistant/databinding/ActivityAssistantBinding;", "bluetoothAdapter", "Landroid/bluetooth/BluetoothAdapter;", "cameraID", "", "cameraManager", "Landroid/hardware/camera2/CameraManager;", "clipboardManager", "Landroid/content/ClipboardManager;", "helper", "Lcom/kwabenaberko/openweathermaplib/implementation/OpenWeatherMapHelper;", "imageDirectory", "getImageDirectory$annotations", "imageIndex", "imgUri", "Landroid/net/Uri;", "keeper", "logkeeper", "logsr", "logtts", "recognizerIntent", "Landroid/content/Intent;", "ringtone", "Landroid/media/Ringtone;", "speechRecognizer", "Landroid/speech/SpeechRecognizer;", "textToSpeech", "Landroid/speech/tts/TextToSpeech;", "callContact", "", "capturePhoto", "checkIfSpeechRecognizerAvailable", "circularRevealActivity", "clipBoardCopy", "clipBoardSpeak", "getAllPairedDevices", "getDate", "getDips", "dps", "getTextFromBitmap", "bitmap", "Landroid/graphics/Bitmap;", "getTime", "horoscope", "joke", "makeAPhoneCall", "medicalApplication", "onActivityResult", "requestCode", "resultCode", "data", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "openFacebook", "openGmail", "openMessages", "openWhatsapp", "playRingtone", "question", "readMe", "readSMS", "sendSMS", "setAlarm", "shareAFile", "shareATextMessage", "speak", "text", "startCrop", "imageUri", "stopRingtone", "summariseText", "turnOffBluetooth", "turnOffFlash", "turnOnBluetooth", "turnOnFlash", "weather", "app_debug"})
public final class AssistantActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.example.googleassistant.databinding.ActivityAssistantBinding binding;
    private com.example.googleassistant.assistant.AssistantViewModel assistantViewModel;
    private final java.lang.String logtts = "TTS";
    private final java.lang.String logsr = "SR";
    private final java.lang.String logkeeper = "keeper";
    private android.speech.tts.TextToSpeech textToSpeech;
    private android.speech.SpeechRecognizer speechRecognizer;
    private android.content.Intent recognizerIntent;
    private java.lang.String keeper;
    private final int REQUEST_CODE_SELECT_DOC = 100;
    private final int REQUEST_ENABLE_BT = 1000;
    private int REQUESTCALL = 1;
    private int SENDSMS = 2;
    private int READSMS = 3;
    private int SHAREAFILE = 4;
    private int SHAREATEXTFILE = 5;
    private int READCONTACTS = 6;
    private int CAPTUREPHOTO = 7;
    private android.bluetooth.BluetoothAdapter bluetoothAdapter;
    private android.hardware.camera2.CameraManager cameraManager;
    private android.content.ClipboardManager clipboardManager;
    private java.lang.String cameraID;
    private android.media.Ringtone ringtone;
    private int imageIndex = 0;
    private android.net.Uri imgUri;
    private com.kwabenaberko.openweathermaplib.implementation.OpenWeatherMapHelper helper;
    private final java.lang.String imageDirectory = null;
    
    @kotlin.Suppress(names = {"DEPRECATION"})
    @java.lang.Deprecated()
    private static void getImageDirectory$annotations() {
    }
    
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void checkIfSpeechRecognizerAvailable() {
    }
    
    public final void speak(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    public final void getTime() {
    }
    
    public final void getDate() {
    }
    
    private final void makeAPhoneCall() {
    }
    
    private final void sendSMS() {
    }
    
    private final void readSMS() {
    }
    
    private final void openMessages() {
    }
    
    private final void openFacebook() {
    }
    
    private final void openWhatsapp() {
    }
    
    private final void openGmail() {
    }
    
    private final void shareAFile() {
    }
    
    private final void shareATextMessage() {
    }
    
    private final void callContact() {
    }
    
    private final void turnOnBluetooth() {
    }
    
    private final void turnOffBluetooth() {
    }
    
    private final void getAllPairedDevices() {
    }
    
    private final void turnOnFlash() {
    }
    
    private final void turnOffFlash() {
    }
    
    public final void clipBoardCopy() {
    }
    
    public final void clipBoardSpeak() {
    }
    
    private final void capturePhoto() {
    }
    
    private final void playRingtone() {
    }
    
    private final void stopRingtone() {
    }
    
    private final void readMe() {
    }
    
    private final void getTextFromBitmap(android.graphics.Bitmap bitmap) {
    }
    
    private final java.lang.String summariseText(java.lang.String text) {
        return null;
    }
    
    private final void setAlarm() {
    }
    
    private final void medicalApplication() {
    }
    
    private final void weather() {
    }
    
    private final void horoscope() {
    }
    
    private final void joke() {
    }
    
    private final void question() {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void startCrop(android.net.Uri imageUri) {
    }
    
    private final void circularRevealActivity() {
    }
    
    private final int getDips(int dps) {
        return 0;
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    public AssistantActivity() {
        super();
    }
}