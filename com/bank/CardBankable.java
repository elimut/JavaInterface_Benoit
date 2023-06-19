package com.bank;

public interface CardBankable {

    public void getMoney(int amount);

    // conseillé-convention // pas de getter et de setter
    // pour partager une variable dans un package -> protected

}
