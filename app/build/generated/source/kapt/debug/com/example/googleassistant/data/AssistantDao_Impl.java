package com.example.googleassistant.data;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AssistantDao_Impl implements AssistantDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Assistant> __insertionAdapterOfAssistant;

  private final EntityDeletionOrUpdateAdapter<Assistant> __updateAdapterOfAssistant;

  private final SharedSQLiteStatement __preparedStmtOfClear;

  public AssistantDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfAssistant = new EntityInsertionAdapter<Assistant>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `assistant_messages_table` (`assistantId`,`assistant_message`,`human_message`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Assistant value) {
        stmt.bindLong(1, value.getAssistantId());
        if (value.getAssistant_message() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getAssistant_message());
        }
        if (value.getHuman_message() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getHuman_message());
        }
      }
    };
    this.__updateAdapterOfAssistant = new EntityDeletionOrUpdateAdapter<Assistant>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `assistant_messages_table` SET `assistantId` = ?,`assistant_message` = ?,`human_message` = ? WHERE `assistantId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Assistant value) {
        stmt.bindLong(1, value.getAssistantId());
        if (value.getAssistant_message() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getAssistant_message());
        }
        if (value.getHuman_message() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getHuman_message());
        }
        stmt.bindLong(4, value.getAssistantId());
      }
    };
    this.__preparedStmtOfClear = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM assistant_messages_table";
        return _query;
      }
    };
  }

  @Override
  public void insert(final Assistant assistant) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfAssistant.insert(assistant);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final Assistant assistant) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfAssistant.handle(assistant);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void clear() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfClear.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfClear.release(_stmt);
    }
  }

  @Override
  public Assistant get(final long key) {
    final String _sql = "SELECT * from assistant_messages_table WHERE assistantId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, key);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfAssistantId = CursorUtil.getColumnIndexOrThrow(_cursor, "assistantId");
      final int _cursorIndexOfAssistantMessage = CursorUtil.getColumnIndexOrThrow(_cursor, "assistant_message");
      final int _cursorIndexOfHumanMessage = CursorUtil.getColumnIndexOrThrow(_cursor, "human_message");
      final Assistant _result;
      if(_cursor.moveToFirst()) {
        final long _tmpAssistantId;
        _tmpAssistantId = _cursor.getLong(_cursorIndexOfAssistantId);
        final String _tmpAssistant_message;
        _tmpAssistant_message = _cursor.getString(_cursorIndexOfAssistantMessage);
        final String _tmpHuman_message;
        _tmpHuman_message = _cursor.getString(_cursorIndexOfHumanMessage);
        _result = new Assistant(_tmpAssistantId,_tmpAssistant_message,_tmpHuman_message);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public LiveData<List<Assistant>> getAllMessages() {
    final String _sql = "SELECT * FROM assistant_messages_table ORDER BY assistantId DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"assistant_messages_table"}, false, new Callable<List<Assistant>>() {
      @Override
      public List<Assistant> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfAssistantId = CursorUtil.getColumnIndexOrThrow(_cursor, "assistantId");
          final int _cursorIndexOfAssistantMessage = CursorUtil.getColumnIndexOrThrow(_cursor, "assistant_message");
          final int _cursorIndexOfHumanMessage = CursorUtil.getColumnIndexOrThrow(_cursor, "human_message");
          final List<Assistant> _result = new ArrayList<Assistant>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Assistant _item;
            final long _tmpAssistantId;
            _tmpAssistantId = _cursor.getLong(_cursorIndexOfAssistantId);
            final String _tmpAssistant_message;
            _tmpAssistant_message = _cursor.getString(_cursorIndexOfAssistantMessage);
            final String _tmpHuman_message;
            _tmpHuman_message = _cursor.getString(_cursorIndexOfHumanMessage);
            _item = new Assistant(_tmpAssistantId,_tmpAssistant_message,_tmpHuman_message);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Assistant getCurrentMessage() {
    final String _sql = "SELECT * FROM assistant_messages_table ORDER BY assistantId DESC LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfAssistantId = CursorUtil.getColumnIndexOrThrow(_cursor, "assistantId");
      final int _cursorIndexOfAssistantMessage = CursorUtil.getColumnIndexOrThrow(_cursor, "assistant_message");
      final int _cursorIndexOfHumanMessage = CursorUtil.getColumnIndexOrThrow(_cursor, "human_message");
      final Assistant _result;
      if(_cursor.moveToFirst()) {
        final long _tmpAssistantId;
        _tmpAssistantId = _cursor.getLong(_cursorIndexOfAssistantId);
        final String _tmpAssistant_message;
        _tmpAssistant_message = _cursor.getString(_cursorIndexOfAssistantMessage);
        final String _tmpHuman_message;
        _tmpHuman_message = _cursor.getString(_cursorIndexOfHumanMessage);
        _result = new Assistant(_tmpAssistantId,_tmpAssistant_message,_tmpHuman_message);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
