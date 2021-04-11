package com.company;

import com.company.weapon.Rifle;
import com.company.weapon.Rpg;
import com.company.weapon.WaterGun;
import com.company.weapon.Weapon;

import java.util.Scanner;

public class Task {

    public static void main(String[] args) {
        Player player = new Player(new Weapon[]{
                new WaterGun(), new Rifle(), new Rpg()
        });
        System.out.format(
                "У игрока %d слотов с оружием, введите номер, чтобы выстрелить, -1 чтобы выйти\n",
                player.getSlotsCount()
        );
        int slot;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            slot = Integer.parseInt(scanner.nextLine());
            if (slot == -1) {
                break;
            }
            player.shotWithWeapon(slot - 1);
        }
    }
}