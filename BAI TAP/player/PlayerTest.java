/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package player;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author GIA KINH
 */
public class PlayerTest {

    public static Scanner scanner = new Scanner(System.in);
    public static int choose;
    public static ArrayList<PlayerIncome> players = new ArrayList<PlayerIncome>();
    public static ArrayList<TournamentIncome> tournamentIncomes = new ArrayList<TournamentIncome>();

    public static void menu() {
        System.out.println("1.Nhap thong tin cau thu moi");
        System.out.println("2.Tinh thu nhap chua co thuong");
        System.out.println("3.Cap nhat diem thi dau cua cau thu");
        System.out.println("4.Tinh tien thuong");
        System.out.println("5.Thoat");
        System.out.print("Enter number: ");
        choose = scanner.nextInt();
        scanner.nextLine();
    }

    public static void enterPlayer() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter income: ");
        double income = scanner.nextDouble();
        PlayerIncome playerIncome = new PlayerIncome(income, name);
        players.add(playerIncome);
        TournamentIncome tournamentIncome = new TournamentIncome(playerIncome.getIncome(), playerIncome.getName());
        tournamentIncomes.add(tournamentIncome);
    }

    public static void cacularIncome() {
        for (PlayerIncome playerIncome : players) {
            playerIncome.displayDetails();
        }
    }

    public static void enterPointPlayer() {
        boolean isPlayer = false;
        String name;
        int vt=0;
        do {
            System.out.print("Enter name player: ");
            name = scanner.nextLine();
            int d=0;
            for(PlayerIncome playerIncome: players){
                if(playerIncome.getName().equals(name)){
                    vt=d;
                    isPlayer = true;
                    break;
                }
                d++;
            }
        } while (isPlayer==false);
        System.out.print("Enter total matches: ");
        int totalMatches = scanner.nextInt();
        System.out.print("Enter battle: ");
        int battle = scanner.nextInt();
        double point[] = new double[battle];
        for (int i = 0; i < battle; i++) {
            System.out.print("Enter point in battle " + (i+1) +": ");
            point[i] = scanner.nextDouble();
        }
        TournamentIncome tournamentIncome = new TournamentIncome(totalMatches, battle, point, players.get(vt).getIncome(), players.get(vt).getName());
        tournamentIncomes.set(vt, tournamentIncome);
    }
    
    public static void cacularTournamentIncome() {
        for (TournamentIncome tournamentIncome : tournamentIncomes) {
            tournamentIncome.displayDetails();
        }
    }

    public static void main(String[] args) {
        do {
            menu();
            switch (choose) {
                case 1:
                    enterPlayer();
                    break;
                case 2:
                    cacularIncome();
                    break;
                case 3:
                    enterPointPlayer();
                    break;
                case 4:
                    cacularTournamentIncome();
                    break;
                case 5:
                    break;
            }
        } while (choose != 5);

    }
}
