package com.spring.uber.service;

import com.spring.uber.domain.Message;
import com.sun.istack.internal.NotNull;

/**
 * Created by zoe on 5/27/17.
 */
public class HelloWorldService {

    public Message createMessage(@NotNull final String name, @NotNull final String text) {
        return new Message(name, text);
    }
}
