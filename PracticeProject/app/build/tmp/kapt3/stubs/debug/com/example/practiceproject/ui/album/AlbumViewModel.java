package com.example.practiceproject.ui.album;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0014\u0010\u0017\u001a\u00020\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0014\u0010\u0019\u001a\u00020\u00162\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\bR \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR#\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\b0\u00070\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0004\u00a8\u0006\u001b"}, d2 = {"Lcom/example/practiceproject/ui/album/AlbumViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/practiceproject/data/repositores/album/AlbumDataRepository;", "(Lcom/example/practiceproject/data/repositores/album/AlbumDataRepository;)V", "_albumsResource", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/practiceproject/resource/Resource;", "", "Lcom/example/practiceproject/data/model/Album;", "_photosResource", "Lcom/example/practiceproject/data/model/Photo;", "albumsResource", "Landroidx/lifecycle/LiveData;", "getAlbumsResource", "()Landroidx/lifecycle/LiveData;", "photosResource", "getPhotosResource", "getRepository", "()Lcom/example/practiceproject/data/repositores/album/AlbumDataRepository;", "setRepository", "fetchData", "", "insertAllAlbums", "albumList", "insertAllPhotos", "photoList", "app_debug"})
public final class AlbumViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.example.practiceproject.resource.Resource<java.util.List<com.example.practiceproject.data.model.Album>>> _albumsResource = null;
    private final androidx.lifecycle.MutableLiveData<com.example.practiceproject.resource.Resource<java.util.List<com.example.practiceproject.data.model.Photo>>> _photosResource = null;
    @org.jetbrains.annotations.NotNull()
    private com.example.practiceproject.data.repositores.album.AlbumDataRepository repository;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.practiceproject.resource.Resource<java.util.List<com.example.practiceproject.data.model.Album>>> getAlbumsResource() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.practiceproject.resource.Resource<java.util.List<com.example.practiceproject.data.model.Photo>>> getPhotosResource() {
        return null;
    }
    
    private final void fetchData() {
    }
    
    public final void insertAllPhotos(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.practiceproject.data.model.Photo> photoList) {
    }
    
    public final void insertAllAlbums(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.practiceproject.data.model.Album> albumList) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.practiceproject.data.repositores.album.AlbumDataRepository getRepository() {
        return null;
    }
    
    public final void setRepository(@org.jetbrains.annotations.NotNull()
    com.example.practiceproject.data.repositores.album.AlbumDataRepository p0) {
    }
    
    public AlbumViewModel(@org.jetbrains.annotations.NotNull()
    com.example.practiceproject.data.repositores.album.AlbumDataRepository repository) {
        super();
    }
}