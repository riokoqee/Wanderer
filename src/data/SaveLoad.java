package data;

import main.GamePanel;

import java.io.*;

public class SaveLoad {

    GamePanel gp;

    public SaveLoad(GamePanel gp) {
        this.gp = gp;
    }
    public void save() {

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("save.dat")));

            DataStorage ds = new DataStorage();

            ds.level = gp.player.level;
            ds.maxLife = gp.player.maxLife;
            ds.life = gp.player.life;
            ds.strength = gp.player.strength;
            ds.dexterity = gp.player.dexterity;
            ds.exp = gp.player.exp;
            ds.nextLevelExp = gp.player.nextLevelExp;
            ds.coin = gp.player.coin;

            // PLAYER INVENTORY
            for (int i = 0; i < gp.player.inventory.size(); i++) {
                ds.itemNames.add(gp.player.inventory.get(i).name);
//                ds.itemAmounts.add(gp.player.inventory.get(i).amount);
            }
            // PLAYER EQUIPMENT
//            ds.currentWeaponSlot = gp.player.getCurrentWeaponSlot();
//            ds.currentShieldSlot = gp.player.getCurrentShieldSlot();

//            // OBJECTS ON MAP
//            ds.mapObjectNames = new String[gp.maxMap][gp.obj[1].length];
//            ds.mapObjectWorldX = new int[gp.maxMap][gp.obj[1].length];
//            ds.mapObjectWorldY = new int[gp.maxMap][gp.obj[1].length];


            // Write the DataStorage object
            oos.writeObject(ds);
        }
        catch (Exception e) {
            System.out.println("Save Exception!");
        }
    }

    public void load() {

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("save.dat")));

            // Read the DataStorage object
            DataStorage ds = (DataStorage)ois.readObject();

            gp.player.level = ds.level;
            gp.player.maxLife = ds.maxLife;
            gp.player.life = ds.life;
            gp.player.strength = ds.strength;
            gp.player.dexterity = ds.dexterity;
            gp.player.exp = ds.exp;
            gp.player.nextLevelExp = ds.nextLevelExp;
            gp.player.coin = ds.coin;
        }
        catch (Exception e) {
            System.out.println("Load Exception!");
        }
    }
}
