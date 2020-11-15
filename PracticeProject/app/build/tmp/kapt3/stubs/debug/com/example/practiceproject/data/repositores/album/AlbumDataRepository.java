package com.example.practiceproject.data.repositores.album;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0011\u0010\n\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001a\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\f0\u000f2\u0006\u0010\u0015\u001a\u00020\u0011J\u001f\u0010\u0016\u001a\u00020\b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001b"}, d2 = {"Lcom/example/practiceproject/data/repositores/album/AlbumDataRepository;", "", "remote", "Lcom/example/practiceproject/data/repositores/album/AlbumRemoteDataSource;", "locale", "Lcom/example/practiceproject/data/repositores/album/AlbumLocalDataSource;", "(Lcom/example/practiceproject/data/repositores/album/AlbumRemoteDataSource;Lcom/example/practiceproject/data/repositores/album/AlbumLocalDataSource;)V", "deleteAllAlbums", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAllPhoto", "getAlbums", "", "Lcom/example/practiceproject/data/model/Album;", "getAlbumsData", "Landroidx/lifecycle/LiveData;", "userId", "", "getPhotos", "Lcom/example/practiceproject/data/model/Photo;", "getPhotosById", "albumId", "insertAlbum", "albums", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertPhoto", "photo", "app_debug"})
public final class AlbumDataRepository {
    private final com.example.practiceproject.data.repositores.album.AlbumRemoteDataSource remote = null;
    private com.example.practiceproject.data.repositores.album.AlbumLocalDataSource locale;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertAlbum(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.practiceproject.data.model.Album> albums, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAlbums(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.practiceproject.data.model.Album>> p0) {
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
    public final java.lang.Object insertPhoto(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.practiceproject.data.model.Photo> photo, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getPhotos(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.practiceproject.data.model.Photo>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteAllPhoto(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.practiceproject.data.model.Photo>> getPhotosById(int albumId) {
        return null;
    }
    
    public AlbumDataRepository(@org.jetbrains.annotations.NotNull()
    com.example.practiceproject.data.repositores.album.AlbumRemoteDataSource remote, @org.jetbrains.annotations.NotNull()
    com.example.practiceproject.data.repositores.album.AlbumLocalDataSource locale) {
        super();
    }
}