package com.example.mod7demo1

class JokeRepository(private val jokeService: JokeService) {

    suspend fun getJoke(): Joke {

        return jokeService.getRandomJoke()
    }

}