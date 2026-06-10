package com.university.techcorp.ui;

import com.university.techcorp.domain.Company;
import java.util.Scanner;

public class ConsoleUI {
    private Scanner scanner = new Scanner(System.in);

    public void showTurn(int turn) {
        System.out.println("\n=== TURA " + turn + " ===");
    }

    public void showCompanyStatus(Company company) {
        System.out.println("Firma: " + company.getName());
        System.out.println("Gotówka: " + company.getCash());
    }

    public void showMenu() {
        System.out.println("1. Pracuj przez turę");
        System.out.println("0. Wyjdź");
        System.out.print("Wybór: ");
    }

    public int readChoice() {
        return scanner.nextInt();
    }
}
