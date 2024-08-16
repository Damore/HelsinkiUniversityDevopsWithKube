package br.com.gabriel;

import java.time.Instant;
import java.util.UUID;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        final var uuid = UUID.randomUUID();
        do {
            System.out.println(Instant.now() + ": " + uuid);
            Thread.sleep(5000);
        } while (true);

    }
}