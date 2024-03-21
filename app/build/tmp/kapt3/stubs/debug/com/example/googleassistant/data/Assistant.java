package com.example.googleassistant.data;

import java.lang.System;

@androidx.room.Entity(tableName = "assistant_messages_table")
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0005H\u00d6\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000f\u00a8\u0006\u001c"}, d2 = {"Lcom/example/googleassistant/data/Assistant;", "", "assistantId", "", "assistant_message", "", "human_message", "(JLjava/lang/String;Ljava/lang/String;)V", "getAssistantId", "()J", "setAssistantId", "(J)V", "getAssistant_message", "()Ljava/lang/String;", "setAssistant_message", "(Ljava/lang/String;)V", "getHuman_message", "setHuman_message", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class Assistant {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private long assistantId;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "assistant_message")
    private java.lang.String assistant_message;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "human_message")
    private java.lang.String human_message;
    
    public final long getAssistantId() {
        return 0L;
    }
    
    public final void setAssistantId(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAssistant_message() {
        return null;
    }
    
    public final void setAssistant_message(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHuman_message() {
        return null;
    }
    
    public final void setHuman_message(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public Assistant(long assistantId, @org.jetbrains.annotations.NotNull()
    java.lang.String assistant_message, @org.jetbrains.annotations.NotNull()
    java.lang.String human_message) {
        super();
    }
    
    public Assistant() {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.googleassistant.data.Assistant copy(long assistantId, @org.jetbrains.annotations.NotNull()
    java.lang.String assistant_message, @org.jetbrains.annotations.NotNull()
    java.lang.String human_message) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}