package com.example.practiceproject.ui.album;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0018B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u001c\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016J\u0014\u0010\u0015\u001a\u00020\u000e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u0014\u0010\u0017\u001a\u00020\u000e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0005R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/example/practiceproject/ui/album/AlbumMainAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/practiceproject/ui/album/AlbumMainAdapter$AlbumMainHolder;", "()V", "albumList", "", "Lcom/example/practiceproject/data/model/Album;", "photoList", "Lcom/example/practiceproject/data/model/Photo;", "viewPool", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "newList", "setPhotoData", "AlbumMainHolder", "app_debug"})
public final class AlbumMainAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.practiceproject.ui.album.AlbumMainAdapter.AlbumMainHolder> {
    private java.util.List<com.example.practiceproject.data.model.Album> albumList;
    private java.util.List<com.example.practiceproject.data.model.Photo> photoList;
    private final androidx.recyclerview.widget.RecyclerView.RecycledViewPool viewPool = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.practiceproject.ui.album.AlbumMainAdapter.AlbumMainHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.practiceproject.ui.album.AlbumMainAdapter.AlbumMainHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.practiceproject.data.model.Album> newList) {
    }
    
    public final void setPhotoData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.practiceproject.data.model.Photo> newList) {
    }
    
    public AlbumMainAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcom/example/practiceproject/ui/album/AlbumMainAdapter$AlbumMainHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/example/practiceproject/ui/album/AlbumMainAdapter;Landroid/view/View;)V", "bind", "", "item", "Lcom/example/practiceproject/data/model/Album;", "app_debug"})
    public final class AlbumMainHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.practiceproject.data.model.Album item) {
        }
        
        public AlbumMainHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}