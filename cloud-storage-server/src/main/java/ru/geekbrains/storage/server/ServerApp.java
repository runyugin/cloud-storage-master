package ru.geekbrains.storage.server;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ServerApp {

    public static void main(String[] args) {
        new Server().start();
    }
}
