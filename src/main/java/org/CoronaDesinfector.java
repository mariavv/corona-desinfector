package org;

public class CoronaDesinfector {

    private Annauncer announcer = ObjectFactory.getInstance().createObject(Annauncer.class);
    private Policeman policeman = ObjectFactory.getInstance().createObject(Policeman.class);

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
