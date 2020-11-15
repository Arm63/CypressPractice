package com.example.practiceproject.data.db.user;

import java.lang.System;

@androidx.room.Database(entities = {com.example.practiceproject.data.model.User.class, com.example.practiceproject.data.model.Album.class, com.example.practiceproject.data.model.Photo.class}, version = 2, exportSchema = false)
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/example/practiceproject/data/db/user/UserDatabase;", "Landroidx/room/RoomDatabase;", "()V", "albumDao", "Lcom/example/practiceproject/data/db/dao/AlbumDao;", "photoDao", "Lcom/example/practiceproject/data/db/dao/PhotoDao;", "userDao", "Lcom/example/practiceproject/data/db/user/UserDao;", "app_debug"})
public abstract class UserDatabase extends androidx.room.RoomDatabase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.practiceproject.data.db.user.UserDao userDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.practiceproject.data.db.dao.AlbumDao albumDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.practiceproject.data.db.dao.PhotoDao photoDao();
    
    public UserDatabase() {
        super();
    }
}