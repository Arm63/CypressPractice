package com.example.practiceproject.data.db.user;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.example.practiceproject.data.db.dao.AlbumDao;
import com.example.practiceproject.data.db.dao.AlbumDao_Impl;
import com.example.practiceproject.data.db.dao.PhotoDao;
import com.example.practiceproject.data.db.dao.PhotoDao_Impl;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class UserDatabase_Impl extends UserDatabase {
  private volatile UserDao _userDao;

  private volatile AlbumDao _albumDao;

  private volatile PhotoDao _photoDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(2) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `USER_TABLE` (`id` INTEGER NOT NULL, `username` TEXT NOT NULL, `email` TEXT NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `ALBUM_TABLE` (`id` INTEGER NOT NULL, `title` TEXT NOT NULL, `userId` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `PHOTO_TABLE` (`albumId` INTEGER NOT NULL, `id` INTEGER NOT NULL, `title` TEXT NOT NULL, `url` TEXT NOT NULL, `thumbnailUrl` TEXT NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '541973e5423350d37973d97d2547244f')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `USER_TABLE`");
        _db.execSQL("DROP TABLE IF EXISTS `ALBUM_TABLE`");
        _db.execSQL("DROP TABLE IF EXISTS `PHOTO_TABLE`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsUSERTABLE = new HashMap<String, TableInfo.Column>(3);
        _columnsUSERTABLE.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUSERTABLE.put("username", new TableInfo.Column("username", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUSERTABLE.put("email", new TableInfo.Column("email", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysUSERTABLE = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesUSERTABLE = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoUSERTABLE = new TableInfo("USER_TABLE", _columnsUSERTABLE, _foreignKeysUSERTABLE, _indicesUSERTABLE);
        final TableInfo _existingUSERTABLE = TableInfo.read(_db, "USER_TABLE");
        if (! _infoUSERTABLE.equals(_existingUSERTABLE)) {
          return new RoomOpenHelper.ValidationResult(false, "USER_TABLE(com.example.practiceproject.data.model.User).\n"
                  + " Expected:\n" + _infoUSERTABLE + "\n"
                  + " Found:\n" + _existingUSERTABLE);
        }
        final HashMap<String, TableInfo.Column> _columnsALBUMTABLE = new HashMap<String, TableInfo.Column>(3);
        _columnsALBUMTABLE.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsALBUMTABLE.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsALBUMTABLE.put("userId", new TableInfo.Column("userId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysALBUMTABLE = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesALBUMTABLE = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoALBUMTABLE = new TableInfo("ALBUM_TABLE", _columnsALBUMTABLE, _foreignKeysALBUMTABLE, _indicesALBUMTABLE);
        final TableInfo _existingALBUMTABLE = TableInfo.read(_db, "ALBUM_TABLE");
        if (! _infoALBUMTABLE.equals(_existingALBUMTABLE)) {
          return new RoomOpenHelper.ValidationResult(false, "ALBUM_TABLE(com.example.practiceproject.data.model.Album).\n"
                  + " Expected:\n" + _infoALBUMTABLE + "\n"
                  + " Found:\n" + _existingALBUMTABLE);
        }
        final HashMap<String, TableInfo.Column> _columnsPHOTOTABLE = new HashMap<String, TableInfo.Column>(5);
        _columnsPHOTOTABLE.put("albumId", new TableInfo.Column("albumId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPHOTOTABLE.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPHOTOTABLE.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPHOTOTABLE.put("url", new TableInfo.Column("url", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPHOTOTABLE.put("thumbnailUrl", new TableInfo.Column("thumbnailUrl", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysPHOTOTABLE = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesPHOTOTABLE = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoPHOTOTABLE = new TableInfo("PHOTO_TABLE", _columnsPHOTOTABLE, _foreignKeysPHOTOTABLE, _indicesPHOTOTABLE);
        final TableInfo _existingPHOTOTABLE = TableInfo.read(_db, "PHOTO_TABLE");
        if (! _infoPHOTOTABLE.equals(_existingPHOTOTABLE)) {
          return new RoomOpenHelper.ValidationResult(false, "PHOTO_TABLE(com.example.practiceproject.data.model.Photo).\n"
                  + " Expected:\n" + _infoPHOTOTABLE + "\n"
                  + " Found:\n" + _existingPHOTOTABLE);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "541973e5423350d37973d97d2547244f", "72228a09596ae5cb6bd6bd8e32cb843c");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "USER_TABLE","ALBUM_TABLE","PHOTO_TABLE");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `USER_TABLE`");
      _db.execSQL("DELETE FROM `ALBUM_TABLE`");
      _db.execSQL("DELETE FROM `PHOTO_TABLE`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public UserDao userDao() {
    if (_userDao != null) {
      return _userDao;
    } else {
      synchronized(this) {
        if(_userDao == null) {
          _userDao = new UserDao_Impl(this);
        }
        return _userDao;
      }
    }
  }

  @Override
  public AlbumDao albumDao() {
    if (_albumDao != null) {
      return _albumDao;
    } else {
      synchronized(this) {
        if(_albumDao == null) {
          _albumDao = new AlbumDao_Impl(this);
        }
        return _albumDao;
      }
    }
  }

  @Override
  public PhotoDao photoDao() {
    if (_photoDao != null) {
      return _photoDao;
    } else {
      synchronized(this) {
        if(_photoDao == null) {
          _photoDao = new PhotoDao_Impl(this);
        }
        return _photoDao;
      }
    }
  }
}
