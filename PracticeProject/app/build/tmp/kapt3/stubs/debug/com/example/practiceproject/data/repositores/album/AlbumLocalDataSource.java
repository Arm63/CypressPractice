package com.example.practiceproject.data.repositores.album;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0011\u0010\n\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0006\u0010\u000f\u001a\u00020\u0010J\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\r0\f2\u0006\u0010\u0013\u001a\u00020\u0010J\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\r0\fJ\u001f\u0010\u0015\u001a\u00020\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001a"}, d2 = {"Lcom/example/practiceproject/data/repositores/album/AlbumLocalDataSource;", "", "daoAlbum", "Lcom/example/practiceproject/data/db/dao/AlbumDao;", "daoPhoto", "Lcom/example/practiceproject/data/db/dao/PhotoDao;", "(Lcom/example/practiceproject/data/db/dao/AlbumDao;Lcom/example/practiceproject/data/db/dao/PhotoDao;)V", "deleteAllAlbums", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAllPhotos", "getAlbumsData", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/practiceproject/data/model/Album;", "userId", "", "getPhotosById", "Lcom/example/practiceproject/data/model/Photo;", "albumId", "getPhotosData", "insertAlbums", "albums", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertPhotos", "photos", "app_debug"})
public final class AlbumLocalDataSource {
    private final com.example.practiceproject.data.db.dao.AlbumDao daoAlbum = null;
    private final com.example.practiceproject.data.db.dao.PhotoDao daoPhoto = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertAlbums(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.practiceproject.data.model.Album> albums, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteAllAlbums(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.practiceproject.data.model.Album>> getAlbumsData(int userId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertPhotos(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.practiceproject.data.model.Photo> photos, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteAllPhotos(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.practiceproject.data.model.Photo>> getPhotosData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.practiceproject.data.model.Photo>> getPhotosById(int albumId) {
        return null;
    }
    
    public AlbumLocalDataSource(@org.jetbrains.annotations.NotNull()
    com.example.practiceproject.data.db.dao.AlbumDao daoAlbum, @org.jetbrains.annotations.NotNull()
    com.example.practiceproject.data.db.dao.PhotoDao daoPhoto) {
        super();
    }
}