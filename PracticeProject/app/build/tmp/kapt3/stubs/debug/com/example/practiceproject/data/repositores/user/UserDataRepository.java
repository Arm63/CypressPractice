package com.example.practiceproject.data.repositores.user;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bJ\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001f\u0010\u000f\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/example/practiceproject/data/repositores/user/UserDataRepository;", "", "remote", "Lcom/example/practiceproject/data/repositores/user/UserRemoteDataSource;", "locale", "Lcom/example/practiceproject/data/repositores/user/UserLocalDataSource;", "(Lcom/example/practiceproject/data/repositores/user/UserRemoteDataSource;Lcom/example/practiceproject/data/repositores/user/UserLocalDataSource;)V", "deleteAll", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getData", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/practiceproject/data/model/User;", "getUsers", "insertData", "users", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class UserDataRepository {
    private final com.example.practiceproject.data.repositores.user.UserRemoteDataSource remote = null;
    private com.example.practiceproject.data.repositores.user.UserLocalDataSource locale;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.practiceproject.data.model.User> users, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getUsers(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.practiceproject.data.model.User>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteAll(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.practiceproject.data.model.User>> getData() {
        return null;
    }
    
    public UserDataRepository(@org.jetbrains.annotations.NotNull()
    com.example.practiceproject.data.repositores.user.UserRemoteDataSource remote, @org.jetbrains.annotations.NotNull()
    com.example.practiceproject.data.repositores.user.UserLocalDataSource locale) {
        super();
    }
}