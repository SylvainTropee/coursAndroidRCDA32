package com.example.mod7demo1.ui.theme

import com.example.mod7demo1.Joke

class JokeRepository(private val jokeService: JokeService) {

    suspend fun getJoke(): Joke {

        return jokeService.getRandomJoke()
    }

}