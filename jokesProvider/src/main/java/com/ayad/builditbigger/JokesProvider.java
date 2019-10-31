package com.ayad.builditbigger;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class JokesProvider {
    private static List<String> jokeList
            = Arrays.asList(
            "I can’t believe I forgot to go to the gym today. That’s 7 years in a row now.",
            "Doctor: “Can you describe the snake that bit you?”\n" +
                    "-\n" +
                    "Patient: “Yes. It looked like an angry rope. “",
            "What is grey and can't fly?\n" +
                    "-\n" +
                    "A fat pigeon",
            "Doctor says to his patient: \"You have cancer and Alzheimer.\"\n" +
                    "-\n" +
                    "Patient: \"At least I don't have cancer.\"",
            "Secretary: “Doctor the invisible man has come. He says he has an appointment.”\n" +
                    " \n" +
                    "Doctor: “Tell him I can't see him."
    );

    public static Joke getJoke(int index) {

        Joke joke = new Joke();
        joke.setJoke(jokeList.get(index));

        return joke;
    }

    public static Joke getRandomJoke() {
        int index = generateRandomInteger(0, jokeList.size());
        return getJoke(index);
    }

    private static int generateRandomInteger(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max);
    }
}
