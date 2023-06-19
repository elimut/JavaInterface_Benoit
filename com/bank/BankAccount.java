package com.bank;

import com.actions.*; //importe moi tout ce qu'il y a dans action
import com.actions.Readable;

public class BankAccount extends TestAbstract implements CardBankable, Writable, Readable {

    public BankAccount(String money) {
        super(money);
    }

    protected String money;

    public void makeMoney(int x) { // implemente methode abstraite
        System.out.println("Salut tu as " + x);
    }

    public void getMoney(int amount) { // implemente methode interface
        System.out.println("Vous avez retiré " + amount + " euros");
    }

    public void getInfo(String data) {
        System.out.println(data);
    };

}

// interface BankCard --> IBankCard I pour interface dans quelques autres
// langages
// Write --> Writable convention en java nom d'interface fini par able
// Read --> Readable
// BanCard --> CardBankable

// méthodes comparable
// interface obligatoirement public et si on ne l'indique pas il est public par
// default
