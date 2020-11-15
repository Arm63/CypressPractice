package com.example.practiceproject.ui.user;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0018\u0019B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u001c\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\rH\u0016J\u0014\u0010\u0016\u001a\u00020\u000f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\nR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/example/practiceproject/ui/user/UserAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/practiceproject/ui/user/UserAdapter$UserHolder;", "onItemClickListener", "Lcom/example/practiceproject/ui/user/UserAdapter$OnItemClickListener;", "(Lcom/example/practiceproject/ui/user/UserAdapter$OnItemClickListener;)V", "getOnItemClickListener", "()Lcom/example/practiceproject/ui/user/UserAdapter$OnItemClickListener;", "setOnItemClickListener", "userList", "", "Lcom/example/practiceproject/data/model/User;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "newList", "OnItemClickListener", "UserHolder", "app_debug"})
public final class UserAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.practiceproject.ui.user.UserAdapter.UserHolder> {
    private java.util.List<com.example.practiceproject.data.model.User> userList;
    @org.jetbrains.annotations.NotNull()
    private com.example.practiceproject.ui.user.UserAdapter.OnItemClickListener onItemClickListener;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.practiceproject.ui.user.UserAdapter.UserHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.practiceproject.ui.user.UserAdapter.UserHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.practiceproject.data.model.User> newList) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.practiceproject.ui.user.UserAdapter.OnItemClickListener getOnItemClickListener() {
        return null;
    }
    
    public final void setOnItemClickListener(@org.jetbrains.annotations.NotNull()
    com.example.practiceproject.ui.user.UserAdapter.OnItemClickListener p0) {
    }
    
    public UserAdapter(@org.jetbrains.annotations.NotNull()
    com.example.practiceproject.ui.user.UserAdapter.OnItemClickListener onItemClickListener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/practiceproject/ui/user/UserAdapter$UserHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "onItemClickListener", "Lcom/example/practiceproject/ui/user/UserAdapter$OnItemClickListener;", "(Lcom/example/practiceproject/ui/user/UserAdapter;Landroid/view/View;Lcom/example/practiceproject/ui/user/UserAdapter$OnItemClickListener;)V", "bind", "", "item", "Lcom/example/practiceproject/data/model/User;", "app_debug"})
    public final class UserHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private com.example.practiceproject.ui.user.UserAdapter.OnItemClickListener onItemClickListener;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.practiceproject.data.model.User item) {
        }
        
        public UserHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView, @org.jetbrains.annotations.NotNull()
        com.example.practiceproject.ui.user.UserAdapter.OnItemClickListener onItemClickListener) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/example/practiceproject/ui/user/UserAdapter$OnItemClickListener;", "", "onItemClick", "", "item", "Lcom/example/practiceproject/data/model/User;", "position", "", "app_debug"})
    public static abstract interface OnItemClickListener {
        
        public abstract void onItemClick(@org.jetbrains.annotations.NotNull()
        com.example.practiceproject.data.model.User item, int position);
    }
}