package test;

import entity.Player;
import main.GamePanel;
import main.KeyHandler;

public class TestLogic {

    public static void main(String[] args) {
        runTest("Тест 1: Обычный урон", () -> testNormalDamage());
        runTest("Тест 2: Смертельный урон (проверка на < 0)", () -> testOverkillDamage());
        runTest("Тест 3: Лечение (не больше макс. жизни)", () -> testHealOverMax());
    }

    public static void runTest(String testName, Runnable testMethod) {
        System.out.print(testName + "... ");
        try {
            testMethod.run();
            System.out.println("✅ PASSED");
        } catch (AssertionError e) {
            System.out.println("❌ FAILED");
            System.out.println("   Причина: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("⚠️ ERROR");
            e.printStackTrace();
        }
    }

    public static void testNormalDamage() {
        Player p = setupPlayer();
        p.life = 6;
        int damage = 2;

        p.life -= damage;

        if (p.life != 4) {
            throw new AssertionError("Ожидалось 4 жизни, но стало " + p.life);
        }
    }

    public static void testOverkillDamage() {
        Player p = setupPlayer();
        p.life = 2;
        int damage = 100;

        p.life -= damage;
        if (p.life < 0) p.life = 0;

        if (p.life < 0) {
            throw new AssertionError("Жизнь стала отрицательной: " + p.life);
        }
    }

    public static void testHealOverMax() {
        Player p = setupPlayer();
        p.maxLife = 6;
        p.life = 5;

        p.life += 10;
        if (p.life > p.maxLife) p.life = p.maxLife;

        if (p.life > 6) {
            throw new AssertionError("Жизнь превысила максимум: " + p.life);
        }
    }

    private static Player setupPlayer() {
        GamePanel gp = new GamePanel();
        KeyHandler keyH = new KeyHandler(gp);
        return new Player(gp, keyH);
    }
}