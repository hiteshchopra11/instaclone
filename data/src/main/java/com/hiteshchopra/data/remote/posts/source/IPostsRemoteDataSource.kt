package com.hiteshchopra.data.remote.posts.source

import com.hiteshchopra.data.ApiSafeResult
import com.hiteshchopra.data.local.posts.entity.PostsEntity
import com.hiteshchopra.data.remote.posts.model.PostList

interface IPostsRemoteDataSource {
    suspend fun getPosts(): PostList
}