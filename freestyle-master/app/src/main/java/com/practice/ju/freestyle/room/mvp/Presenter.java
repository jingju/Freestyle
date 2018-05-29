package com.practice.ju.freestyle.room.mvp;

/**
 * Created by guangju on 2018/5/24.
 */

public interface Presenter<V> {
    void onViewAttached(V view);
    void onViewDettached();
    void onDestroy();
}
