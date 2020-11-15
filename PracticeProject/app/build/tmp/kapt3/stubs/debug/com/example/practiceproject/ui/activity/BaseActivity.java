package com.example.practiceproject.ui.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u0011H$J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\u0012\u0010\u0013\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\u001e\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u001bJ\u0012\u0010\u001c\u001a\u00020\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\u001e\u001a\u00020\u000fH\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u001f"}, d2 = {"Lcom/example/practiceproject/ui/activity/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "LOG_TAG", "", "kotlin.jvm.PlatformType", "mTabLayout", "Lcom/google/android/material/tabs/TabLayout;", "mToolbar", "Landroidx/appcompat/widget/Toolbar;", "getMToolbar", "()Landroidx/appcompat/widget/Toolbar;", "setMToolbar", "(Landroidx/appcompat/widget/Toolbar;)V", "findViews", "", "getLayoutResource", "", "hideActionBarIcon", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "openScreen", "fragment", "Landroidx/fragment/app/Fragment;", "item", "addToBackStack", "", "setActionBarTitle", "title", "showActionBarIcon", "app_debug"})
public abstract class BaseActivity extends androidx.appcompat.app.AppCompatActivity {
    private final java.lang.String LOG_TAG = null;
    @org.jetbrains.annotations.Nullable()
    private androidx.appcompat.widget.Toolbar mToolbar;
    private com.google.android.material.tabs.TabLayout mTabLayout;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.appcompat.widget.Toolbar getMToolbar() {
        return null;
    }
    
    public final void setMToolbar(@org.jetbrains.annotations.Nullable()
    androidx.appcompat.widget.Toolbar p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void findViews() {
    }
    
    protected abstract int getLayoutResource();
    
    public void setActionBarTitle(@org.jetbrains.annotations.Nullable()
    java.lang.String title) {
    }
    
    public void hideActionBarIcon() {
    }
    
    public void showActionBarIcon() {
    }
    
    public final void openScreen(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, int item, boolean addToBackStack) {
    }
    
    public BaseActivity() {
        super();
    }
}