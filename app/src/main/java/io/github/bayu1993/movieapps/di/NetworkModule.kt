package io.github.bayu1993.movieapps.di

import io.github.bayu1993.movieapps.network.MovieClient
import org.koin.dsl.module.module

/**
 * Created by Bayu teguh pamuji on 12/4/18.
 * email : bayuteguhpamuji@gmail.com.
 */

val networkModule = module{
    //singleton using single
    single {
        MovieClient().create()
    }
}