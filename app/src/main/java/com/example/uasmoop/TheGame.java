package com.example.uasmoop;

import com.example.uasmoop.Army.*;

import java.util.ArrayList;

    public class TheGame {
        public ArrayList<player> pList = new ArrayList<>();

        public TheGame() {

            castle c1 = new castle("Iron Wall", "WOOD");
            player p1 = new player("P1", c1);
            c1.addSoldier(new archer());
            c1.addSoldier(new archer());
            c1.addSoldier(new archer());
            c1.addHero(new heroArch());
            c1.addHero(new heroArch());
            c1.addHero(new heroArch());
            c1.addHero(new heroArch());
            c1.addHero(new heroArch());
            c1.addHero(new heroArch());


            castle c2 = new castle("Death Merchant", "STONE");
            player p2 = new player("P2", c2);
            c2.addSoldier(new infantry());
            c2.addSoldier(new catapult());
            c2.addSoldier(new catapult());
            c2.addHero(new heroInf());
            c2.addHero(new heroInf());
            c2.addHero(new heroCat());
            c2.addHero(new heroCat());
            c2.addHero(new heroInf());
            c2.addHero(new heroInf());

            pList.add(p1);
            pList.add(p2);
        }
            public int linkStart(){
                pList.get(0).getCastletype().castlestat();
                if (pList.get(0).getCastletype().getCastleStat() > pList.get(1).getCastletype().getCastleStat()){
                    return 1;
                }
                else {
                    return 2;
                }
            }
}
