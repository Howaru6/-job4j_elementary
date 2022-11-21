package ru.job4j.condition;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class DummyBotTest {
    @Test
    public void whenGreetBot() {
        String in = "Hi, Bot.";
        String result = DummyBot.answer(in);
        String expected = "Hi, SmartAss.";
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenByeBot() {
        String in = "Bye.";
        String result = DummyBot.answer(in);
        String expected = "See you later.";
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenUnknownBot() {
        String in = "Can you add two plus two?";
        String result = DummyBot.answer(in);
        String expected = "I don't know. Please, ask another question.";
        Assertions.assertThat(result).isEqualTo(expected);
    }
}