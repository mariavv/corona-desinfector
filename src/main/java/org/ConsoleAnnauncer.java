package org;

public class ConsoleAnnauncer implements Annauncer {
    @Override
    public void announce(String message) {
        System.out.println(message);
    }
}
