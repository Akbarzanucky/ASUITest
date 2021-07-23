package com.example.uasmoop;

import com.example.uasmoop.Army.*;

import java.util.ArrayList;

    public class TheGame {
        public ArrayList<player> pList = new ArrayList<>();

        public TheGame() {
            castle c1 = new castle("Iron Wall", "WOOD");
            player p1 = new player("P1", c1);
            c1.addSoldier(new archer(100000));
            c1.addSoldier(new archer(50000));
            c1.addSoldier(new infantry(50000));
            c1.addHero(new heroArch());
            c1.addHero(new heroArch());
            c1.addHero(new heroArch());
            c1.addHero(new heroArch());
            c1.addHero(new heroArch());
            c1.addHero(new heroArch());

            castle c2 = new castle("Death Merchant", "STONE");
            player p2 = new player("P2", c2);
            c2.addSoldier(new infantry(100000));
            c2.addSoldier(new catapult(50000));
            c2.addSoldier(new catapult(50000));
            c2.addHero(new heroInf());
            c2.addHero(new heroInf());
            c2.addHero(new heroCat());
            c2.addHero(new heroCat());
            c2.addHero(new heroInf());
            c2.addHero(new heroInf());

            castle c3 = new castle("Earth Shaker", "STEEL");
            player p3 = new player("P3", c3);
            c3.addSoldier(new infantry(100000));
            c3.addSoldier(new catapult(50000));
            c3.addSoldier(new cavalry(50000));
            c3.addHero(new heroInf());
            c3.addHero(new heroInf());
            c3.addHero(new heroInf());
            c3.addHero(new heroCav());
            c3.addHero(new heroCav());
            c3.addHero(new heroCav());

            castle c4 = new castle("Sand Raiders", "HORSE");
            player p4 = new player("P4", c4);
            c4.addSoldier(new infantry(100000));
            c4.addSoldier(new cavalry(50000));
            c4.addSoldier(new cavalry(50000));
            c4.addHero(new heroInf());
            c4.addHero(new heroInf());
            c4.addHero(new heroInf());
            c4.addHero(new heroCav());
            c4.addHero(new heroCav());
            c4.addHero(new heroCav());

            pList.add(p1);
            pList.add(p2);
            pList.add(p3);
            pList.add(p4);
        }

        public int linkStart() {
            pList.get(0).getCastletype().castlestat();
            pList.get(1).getCastletype().castlestat();
            if (pList.get(0).getCastletype().getCastleStat() > pList.get(1).getCastletype().getCastleStat()) {
                return 1;
            } else {
                return 2;
            }
        }

        public int linkStart2() {
            pList.get(2).getCastletype().castlestat();
            pList.get(3).getCastletype().castlestat();
            if (pList.get(2).getCastletype().getCastleStat() > pList.get(3).getCastletype().getCastleStat()) {
                return 1;
            } else {
                return 2;
            }
        }
    }


