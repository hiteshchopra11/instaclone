package com.hiteshchopra.instagramclone.di.module

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.hiteshchopra.instagramclone.di.scope.ViewModelKey
import com.hiteshchopra.instagramclone.ui.home.HomeVM
import com.hiteshchopra.instagramclone.ui.home.fragment.accountfragment.AccountFragmentVM
import com.hiteshchopra.instagramclone.ui.home.fragment.accountfragment.profile.posts.PostsFragmentVM
import com.hiteshchopra.instagramclone.ui.home.fragment.accountfragment.profile.reels.ProfileReelsFragmentVM
import com.hiteshchopra.instagramclone.ui.home.fragment.accountfragment.profile.tagged.TaggedFragmentVM
import com.hiteshchopra.instagramclone.ui.home.fragment.homefragment.HomeFragmentVM
import com.hiteshchopra.instagramclone.ui.home.fragment.notificationsfragment.NotificationsFragmentVM
import com.hiteshchopra.instagramclone.ui.home.fragment.reelsfragment.ReelsFragmentVM
import com.hiteshchopra.instagramclone.ui.home.fragment.searchfragment.SearchFragmentVM
import com.hiteshchopra.instagramclone.ui.login.LoginVM
import com.hiteshchopra.instagramclone.ui.signup.SignUpVM
import com.hiteshchopra.instagramclone.utils.ViewModelFactory
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview

@Module
abstract class ViewModelFactoryModule {
    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(LoginVM::class)
    abstract fun bindLoginVM(loginVM: LoginVM): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(SignUpVM::class)
    abstract fun bindSignUpVM(signUpVM: SignUpVM): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(HomeVM::class)
    abstract fun bindHomeVM(homeScreenVM: HomeVM): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(HomeFragmentVM::class)
    abstract fun bindHomeScreenVM(homeFragmentVM: HomeFragmentVM): ViewModel

    @ExperimentalCoroutinesApi
    @FlowPreview
    @Binds
    @IntoMap
    @ViewModelKey(SearchFragmentVM::class)
    abstract fun bindSearchFragmentVM(searchScreenVM: SearchFragmentVM): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(ReelsFragmentVM::class)
    abstract fun bindReelsVM(reelsFragmentVM: ReelsFragmentVM): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(NotificationsFragmentVM::class)
    abstract fun bindNotificationsVM(notificationsFragmentVM: NotificationsFragmentVM): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(AccountFragmentVM::class)
    abstract fun bindAccountVM(accountFragmentVM: AccountFragmentVM): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(PostsFragmentVM::class)
    abstract fun bindProfilePostVM(accountFragmentVM: PostsFragmentVM): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(ProfileReelsFragmentVM::class)
    abstract fun bindProfileReelsVM(profileReelsFragmentVM: ProfileReelsFragmentVM): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(TaggedFragmentVM::class)
    abstract fun bindTaggedVM(taggedFragmentVM: TaggedFragmentVM): ViewModel
}