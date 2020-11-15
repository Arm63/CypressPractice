package com.example.practiceproject.ui.album;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0014B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u001c\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0016R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006\u00a8\u0006\u0015"}, d2 = {"Lcom/example/practiceproject/ui/album/AlbumSubAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/practiceproject/ui/album/AlbumSubAdapter$AlbumSubHolder;", "photoList", "", "Lcom/example/practiceproject/data/model/Photo;", "(Ljava/util/List;)V", "getPhotoList", "()Ljava/util/List;", "setPhotoList", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "AlbumSubHolder", "app_debug"})
public final class AlbumSubAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.practiceproject.ui.album.AlbumSubAdapter.AlbumSubHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.example.practiceproject.data.model.Photo> photoList;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.practiceproject.ui.album.AlbumSubAdapter.AlbumSubHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.practiceproject.ui.album.AlbumSubAdapter.AlbumSubHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.practiceproject.data.model.Photo> getPhotoList() {
        return null;
    }
    
    public final void setPhotoList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.practiceproject.data.model.Photo> p0) {
    }
    
    public AlbumSubAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.practiceproject.data.model.Photo> photoList) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/practiceproject/ui/album/AlbumSubAdapter$AlbumSubHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/example/practiceproject/ui/album/AlbumSubAdapter;Landroid/view/View;)V", "requestOption", "Lcom/bumptech/glide/request/RequestOptions;", "bind", "", "photo", "Lcom/example/practiceproject/data/model/Photo;", "app_debug"})
    public final class AlbumSubHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.bumptech.glide.request.RequestOptions requestOption = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.practiceproject.data.model.Photo photo) {
        }
        
        public AlbumSubHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}