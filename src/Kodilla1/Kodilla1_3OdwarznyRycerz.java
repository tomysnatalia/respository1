interface Quest {
    void process();
}

class DeadIslandQuest implements Quest {
    public void process() {
        System.out.println("Misja na DeadIsland okazała się trudnym wyzwaniem");
    }
}

class EliteKnightQuest implements Quest {
    public void process() {
        System.out.println("Misja EliteKnight to długa i męcząca przeprawa");
    }
}

class Knight {

    private Quest quest;

    public Knight(Quest quest) {
        this.quest = quest;
    }

    public void process() {
        System.out.println("Rycerz otwrzymał nowe zadanie");
        this.quest.process();
        System.out.println("Odważny Rycerz poradził sobie z przeciwnościami. Mission compled");
    }
}

class Aplikcja {

    public static void main (String args[]) {

        Quest eliteknightquest = new EliteKnightQuest();
        Knight knight = new Knight(eliteknightquest);
        knight.process();
    }
}