package com.example.practiceproject.ui.user;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0014\u0010\u0015\u001a\u00020\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\bR \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\u0004R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R#\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010\u00a8\u0006\u0017"}, d2 = {"Lcom/example/practiceproject/ui/user/UserViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/practiceproject/data/repositores/user/UserDataRepository;", "(Lcom/example/practiceproject/data/repositores/user/UserDataRepository;)V", "_usersResource", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/practiceproject/resource/Resource;", "", "Lcom/example/practiceproject/data/model/User;", "getRepository", "()Lcom/example/practiceproject/data/repositores/user/UserDataRepository;", "setRepository", "users", "Landroidx/lifecycle/LiveData;", "getUsers", "()Landroidx/lifecycle/LiveData;", "usersResource", "getUsersResource", "fetchData", "", "insertAll", "userList", "app_debug"})
public final class UserViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.example.practiceproject.resource.Resource<java.util.List<com.example.practiceproject.data.model.User>>> _usersResource = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.practiceproject.data.model.User>> users = null;
    @org.jetbrains.annotations.NotNull()
    private com.example.practiceproject.data.repositores.user.UserDataRepository repository;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.practiceproject.resource.Resource<java.util.List<com.example.practiceproject.data.model.User>>> getUsersResource() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.practiceproject.data.model.User>> getUsers() {
        return null;
    }
    
    private final void fetchData() {
    }
    
    public final void insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.practiceproject.data.model.User> userList) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.practiceproject.data.repositores.user.UserDataRepository getRepository() {
        return null;
    }
    
    public final void setRepository(@org.jetbrains.annotations.NotNull()
    com.example.practiceproject.data.repositores.user.UserDataRepository p0) {
    }
    
    public UserViewModel(@org.jetbrains.annotations.NotNull()
    com.example.practiceproject.data.repositores.user.UserDataRepository repository) {
        super();
    }
}