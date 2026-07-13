# ⚔️ Wanderer

A 2D top-down action-RPG built in **Java (Swing / Java2D)**. Explore a tile-based world, fight monsters in real time, chop trees and mine rocks, collect loot, trade with a merchant, and manage your inventory and equipment.

## ✨ Features

- 🗺️ **Tile-based world** — multiple maps/areas connected together (`TileManager`, `Tile`, `maxMap`)
- ⚔️ **Real-time combat** — swing swords/axes, cast fireballs, throw rocks at enemies (`OBJ_Sword_Normal`, `OBJ_Axe`, `OBJ_Fireball`, `OBJ_Rock`, `Projectile`)
- 👾 **Monsters** — enemies with their own AI and behavior (`MON_GreenSlime`)
- 🧑‍🤝‍🧑 **NPCs** — a merchant to trade with and an old man to talk to (`NPC_Merchant`, `NPC_OldMan`)
- 🎒 **Items & equipment** — weapons, shields, boots, potions, keys, coins, mana crystals, chests (`src/object/`)
- 🌳 **Interactive world objects** — choppable dry trees and tree trunks (`IT_DryTree`, `IT_Trunk`, `InteractiveTile`)
- ❤️ **Health & mana system** — heart/mana crystal HUD (`heart_full/half/blank`, `manacrystal_full/blank`)
- ✨ **Particle effects** — visual feedback for actions (`Particle`)
- 💾 **Save / Load system** — persistent game state (`SaveLoad`, `DataStorage`)
- ⚙️ **Settings** — fullscreen toggle, music/SFX volume, saved to `config.txt` (`Config`)
- 🔊 **Music & sound effects** — background tracks and combat/UI sounds (`Sound`)

## 🛠 Tech Stack

| Category | Technology |
|---|---|
| Language | Java |
| Rendering | Java2D / Swing (`JPanel`, custom game loop) |
| Project | IntelliJ IDEA project (no Maven/Gradle — plain `.iml`) |
| Assets | Custom/tutorial-style tiles, sprites, and sound in `res/` |

## 📁 Project Structure

```
src/
├── main/               # Game loop, UI, config, collisions, asset placement
│   ├── Main.java             # Entry point
│   ├── GamePanel.java        # Core game loop and rendering
│   ├── UI.java                # HUD, menus, dialogue windows
│   ├── Config.java            # Settings (fullscreen, volume) persistence
│   ├── CollisionChecker.java  # Tile/entity/object collision
│   ├── AssetSetter.java       # Places objects/monsters/NPCs on the map
│   ├── EventHandler.java / EventRect.java # Map trigger events
│   └── KeyHandler.java / Sound.java / UtilityTool.java
├── entity/             # Player, NPCs, projectiles, particles
│   ├── Player.java
│   ├── NPC_Merchant.java / NPC_OldMan.java
│   ├── Projectile.java
│   └── Particle.java
├── monster/            # Monster classes
│   └── MON_GreenSlime.java
├── object/             # Pickable items, weapons, equipment
├── tile/               # Tile & TileManager (world rendering)
├── tile_interactive/   # Interactive world objects (choppable trees, etc.)
├── data/               # Save/Load, data storage
└── test/               # Basic tests

res/                    # Tiles, sprites, sound, fonts, maps
```

## 🚀 Getting Started

### Requirements
- JDK 8+ (or compatible)
- IntelliJ IDEA (recommended — project ships as a `.iml` IntelliJ project)

### Run from source

```bash
git clone https://github.com/riokoqee/Wanderer.git
cd Wanderer
```

Open the folder in IntelliJ IDEA, let it index the `.iml` project, then run `src/main/Main.java`.

Alternatively, compile manually:

```bash
javac -d out $(find src -name "*.java")
java -cp out:res main.Main
```

## 🙏 Acknowledgements

Built by following **RyiSnow**'s Java 2D RPG tutorial series ("Blue Boy Adventure") on YouTube.

## 📄 License

Not specified.

---

# ⚔️ Wanderer (Русский)

Двухмерная экшен-RPG с видом сверху, написанная на **Java (Swing / Java2D)**. Исследуйте тайловый мир, сражайтесь с монстрами в реальном времени, рубите деревья и добывайте камень, собирайте лут, торгуйте с торговцем и управляйте инвентарём и экипировкой.

## ✨ Основные возможности

- 🗺️ **Тайловый мир** — несколько связанных между собой карт/зон (`TileManager`, `Tile`, `maxMap`)
- ⚔️ **Бой в реальном времени** — удары мечом/топором, огненные шары, броски камней во врагов (`OBJ_Sword_Normal`, `OBJ_Axe`, `OBJ_Fireball`, `OBJ_Rock`, `Projectile`)
- 👾 **Монстры** — враги с собственным поведением (`MON_GreenSlime`)
- 🧑‍🤝‍🧑 **NPC** — торговец, у которого можно покупать предметы, и старик, с которым можно поговорить (`NPC_Merchant`, `NPC_OldMan`)
- 🎒 **Предметы и экипировка** — оружие, щиты, ботинки, зелья, ключи, монеты, кристаллы маны, сундуки (`src/object/`)
- 🌳 **Интерактивные объекты мира** — деревья и пни, которые можно срубить (`IT_DryTree`, `IT_Trunk`, `InteractiveTile`)
- ❤️ **Система здоровья и маны** — HUD с сердцами/кристаллами маны (`heart_full/half/blank`, `manacrystal_full/blank`)
- ✨ **Частицы** — визуальные эффекты действий (`Particle`)
- 💾 **Система сохранений** — сохранение состояния игры (`SaveLoad`, `DataStorage`)
- ⚙️ **Настройки** — переключение полноэкранного режима, громкость музыки/звуков, сохраняются в `config.txt` (`Config`)
- 🔊 **Музыка и звуки** — фоновые треки и звуки боя/интерфейса (`Sound`)

## 🛠 Технологический стек

| Категория | Технология |
|---|---|
| Язык | Java |
| Рендеринг | Java2D / Swing (`JPanel`, собственный игровой цикл) |
| Проект | Проект IntelliJ IDEA (без Maven/Gradle — обычный `.iml`) |
| Ассеты | Тайлы, спрайты и звук в `res/` |

## 📁 Структура проекта

```
src/
├── main/               # Игровой цикл, UI, конфиг, коллизии, расстановка объектов
│   ├── Main.java             # Точка входа
│   ├── GamePanel.java        # Основной игровой цикл и рендеринг
│   ├── UI.java                # HUD, меню, диалоговые окна
│   ├── Config.java            # Сохранение настроек (полный экран, громкость)
│   ├── CollisionChecker.java  # Проверка коллизий тайлов/сущностей/объектов
│   ├── AssetSetter.java       # Расстановка объектов/монстров/NPC на карте
│   ├── EventHandler.java / EventRect.java # События-триггеры на карте
│   └── KeyHandler.java / Sound.java / UtilityTool.java
├── entity/             # Игрок, NPC, снаряды, частицы
│   ├── Player.java
│   ├── NPC_Merchant.java / NPC_OldMan.java
│   ├── Projectile.java
│   └── Particle.java
├── monster/            # Классы монстров
│   └── MON_GreenSlime.java
├── object/             # Подбираемые предметы, оружие, экипировка
├── tile/               # Tile и TileManager (рендеринг мира)
├── tile_interactive/   # Интерактивные объекты мира (срубаемые деревья и т.п.)
├── data/               # Сохранение/загрузка, хранилище данных
└── test/               # Базовые тесты

res/                    # Тайлы, спрайты, звук, шрифты, карты
```

## 🚀 Запуск проекта

### Требования
- JDK 8+ (или совместимая версия)
- IntelliJ IDEA (рекомендуется — проект поставляется как `.iml`-проект IntelliJ)

### Запуск из исходников

```bash
git clone https://github.com/riokoqee/Wanderer.git
cd Wanderer
```

Откройте папку в IntelliJ IDEA, дайте ей проиндексировать `.iml`-проект, затем запустите `src/main/Main.java`.

Либо соберите вручную:

```bash
javac -d out $(find src -name "*.java")
java -cp out:res main.Main
```

## 🙏 Благодарности

Проект написан по гайду **RyiSnow** — серии туториалов по созданию 2D RPG на Java ("Blue Boy Adventure") на YouTube.

## 📄 Лицензия

Не указана.
