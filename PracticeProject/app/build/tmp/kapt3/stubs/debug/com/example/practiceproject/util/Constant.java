package com.example.practiceproject.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/example/practiceproject/util/Constant;", "", "()V", "ALBUM_DATABASE", "", "ALBUM_TABLE", "BASE_URL", "GET_STARTED", "HIDE", "", "INVALID_DATA", "LOGGED", "LOGGED_IN", "PASSED", "PHOTO_DATABASE", "PHOTO_TABLE", "REGEX_SYMBOLS", "SHOW", "SPECIAL_CHARACTERS", "USER_DATABASE", "USER_ID", "USER_TABLE", "app_debug"})
public final class Constant {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BASE_URL = "https://jsonplaceholder.typicode.com/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String USER_DATABASE = "USER_DATABASE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String USER_TABLE = "USER_TABLE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PHOTO_DATABASE = "PHOTO_DATABASE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PHOTO_TABLE = "PHOTO_TABLE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ALBUM_DATABASE = "ALBUM_DATABASE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ALBUM_TABLE = "ALBUM_TABLE";
    public static final int SHOW = 129;
    public static final int HIDE = 1;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SPECIAL_CHARACTERS = "-@%\\[\\}+\'!/#$^?:;,\\(\"\\)~`.*=&\\{>\\]<_";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REGEX_SYMBOLS = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[-@%\\[\\}+\'!/#$^?:;,\\(\"\\)~`.*=&\\{>\\]<_])(?=\\S+$).{8,30}$";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LOGGED_IN = "Logged in";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GET_STARTED = "Logged Get started";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PASSED = "Passed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LOGGED = "Logged";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INVALID_DATA = "Invalid data";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String USER_ID = "USER_ID";
    public static final com.example.practiceproject.util.Constant INSTANCE = null;
    
    private Constant() {
        super();
    }
}