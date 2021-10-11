package org;

public class CoronaDesinfector {

    private Annauncer announcer = new ConsoleAnnauncer();
    private Policeman policeman = new PolicemanImpl();

    public void start(Room room) {
        announcer.announce("всем выйти из комнаты");
        policeman.makePeopleLeaveRoom();
        desinfect(room);
        announcer.announce("можно вернуться в комнату");
    }

    private void desinfect(Room room) {
        System.out.println("прошла дезинфекция");
    }
}
