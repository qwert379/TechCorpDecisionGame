package com.university.techcorp.events;

import com.university.techcorp.domain.Company;

public class MarketSlowdownEvent implements GameEvent {
    public void apply(Company company) {
        company.reduceCash(5000);
        System.out.println("Rynek zwolnił! Stracono 5000 gotówki.");
    }
}
