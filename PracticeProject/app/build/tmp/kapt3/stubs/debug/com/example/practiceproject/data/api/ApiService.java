package com.example.practiceproject.data.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/example/practiceproject/data/api/ApiService;", "", "getAlbums", "", "Lcom/example/practiceproject/data/model/Album;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPhotos", "Lcom/example/practiceproject/data/model/Photo;", "getUsers", "Lcom/example/practiceproject/data/model/User;", "app_debug"})
public abstract interface ApiService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "users")
    public abstract java.lang.Object getUsers(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.practiceproject.data.model.User>> p0);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "albums")
    public abstract java.lang.Object getAlbums(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.practiceproject.data.model.Album>> p0);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "photos")
    public abstract java.lang.Object getPhotos(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.practiceproject.data.model.Photo>> p0);
}