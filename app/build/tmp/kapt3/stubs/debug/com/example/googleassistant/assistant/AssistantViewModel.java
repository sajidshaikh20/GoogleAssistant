package com.example.googleassistant.assistant;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0015\u001a\u00020\u0016H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u0004\u0018\u00010\tH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\b\u0010\u0019\u001a\u00020\u0016H\u0002J\u0019\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\tH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\u0006\u0010\u001d\u001a\u00020\u0016J\b\u0010\u001e\u001a\u00020\u0016H\u0014J\u0016\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!J\u0019\u0010#\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\tH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cR\u0016\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006$"}, d2 = {"Lcom/example/googleassistant/assistant/AssistantViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "database", "Lcom/example/googleassistant/data/AssistantDao;", "application", "Landroid/app/Application;", "(Lcom/example/googleassistant/data/AssistantDao;Landroid/app/Application;)V", "currentMessage", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/googleassistant/data/Assistant;", "getDatabase", "()Lcom/example/googleassistant/data/AssistantDao;", "messages", "Landroidx/lifecycle/LiveData;", "", "getMessages", "()Landroidx/lifecycle/LiveData;", "uiScope", "Lkotlinx/coroutines/CoroutineScope;", "viewModelJob", "Lkotlinx/coroutines/CompletableJob;", "clear", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCurrentMessageFromDatabase", "initializeCurrentMessage", "insert", "message", "(Lcom/example/googleassistant/data/Assistant;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onClear", "onCleared", "sendMessageToDatabase", "assistantMessage", "", "humanMessage", "update", "app_debug"})
public final class AssistantViewModel extends androidx.lifecycle.AndroidViewModel {
    private kotlinx.coroutines.CompletableJob viewModelJob;
    private final kotlinx.coroutines.CoroutineScope uiScope = null;
    private androidx.lifecycle.MutableLiveData<com.example.googleassistant.data.Assistant> currentMessage;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.googleassistant.data.Assistant>> messages = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.googleassistant.data.AssistantDao database = null;
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.googleassistant.data.Assistant>> getMessages() {
        return null;
    }
    
    private final void initializeCurrentMessage() {
    }
    
    public final void sendMessageToDatabase(@org.jetbrains.annotations.NotNull()
    java.lang.String assistantMessage, @org.jetbrains.annotations.NotNull()
    java.lang.String humanMessage) {
    }
    
    public final void onClear() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.googleassistant.data.AssistantDao getDatabase() {
        return null;
    }
    
    public AssistantViewModel(@org.jetbrains.annotations.NotNull()
    com.example.googleassistant.data.AssistantDao database, @org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}