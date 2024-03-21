package com.example.googleassistant.data;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\'J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\tH\'J\n\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\'J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0005H\'J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0005H\'\u00a8\u0006\u000f"}, d2 = {"Lcom/example/googleassistant/data/AssistantDao;", "", "clear", "", "get", "Lcom/example/googleassistant/data/Assistant;", "key", "", "getAllMessages", "Landroidx/lifecycle/LiveData;", "", "getCurrentMessage", "insert", "assistant", "update", "app_debug"})
public abstract interface AssistantDao {
    
    @androidx.room.Insert()
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.example.googleassistant.data.Assistant assistant);
    
    @androidx.room.Update()
    public abstract void update(@org.jetbrains.annotations.NotNull()
    com.example.googleassistant.data.Assistant assistant);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * from assistant_messages_table WHERE assistantId = :key")
    public abstract com.example.googleassistant.data.Assistant get(long key);
    
    @androidx.room.Query(value = "DELETE FROM assistant_messages_table")
    public abstract void clear();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM assistant_messages_table ORDER BY assistantId DESC")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.googleassistant.data.Assistant>> getAllMessages();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM assistant_messages_table ORDER BY assistantId DESC LIMIT 1")
    public abstract com.example.googleassistant.data.Assistant getCurrentMessage();
}