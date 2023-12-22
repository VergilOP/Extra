# HULLBREAKER COMPANY
<img src="https://i.imgur.com/5P5LR89.png" width="1280px" />

#### Making it more challenging to work for the company 💀. 

The design was drawn by `lilboi__`

# INSTRUCTION 
This mod can only be installed on the host client.

Unpack the `venterok-hullbreaker_company-X.X.X.zip` archive into your game folder. Make sure to install [BepInEx](https://github.com/BepInEx/BepInEx) before. 

After the first landing on the moon, a config `\BepInEx\config\HullBreakerCompany.cfg` file will be created where you can configure the chances of events appearing, value 0 – disabled the event.
And number of events can be chosen in the config file

How to create a custom event you can read here [GitHub instruction](https://github.com/Venterok/HullBreakerCompany#creating-custom-event)
# FEATURES

<details>
<summary><b>Difficulty changes</b></summary>

- Increased enemy spawn rate and difficulty.

- Increasing quota per completed profit.

</details>

<details>
<summary><b>Notes about moon, mechanics mod</b></summary>

- Upon landing on a moon, a few random events are selected and printed in the chat. This is referred to as `"Notes about moon"📜`.

- The notes contain information about the challenge, inhabitants of the planet, and cautionary messages.

- Different event modes: Increase event amount per day / Const events for moon can be changed in config
</details>

<details>
  <summary><b>HullBreaker event list</b></summary>

- If you don’t like any of the events, you can always disable it in the config by setting the weight to 0

| Config event names    | Config description                                                 |
|-----------------------|--------------------------------------------------------------------|
| Arachnophobia         | Increased chance of spider spawning                                |
| Grandma's cellar      | Only jars of pickles spawn on the moon                             |
| Devochka Pizdec       | Increased chance of phantom girl spawn                             |
| Enemy Bounty          | Company pays money for killing the enemies / 60 per enemy          |
| FlowerMan             | Increased chance of flowerman spawn                                |
| Hacked Turrets        | Turrets don't work on the moon                                     |
| Hell                  | Increased chance of spawning Jester and more enemies               |
| Hoarder Bug           | Increased chance of hoarder bug spawn                              |
| LandMine              | Increased chance of landmines spawning                             |
| Lizards               | Increased chance of puffers spawn                                  |
| Nothing               | Nothing happens                                                    |
| On A Powder Keg       | Landmines can detonate at any time                                 |
| One For All           | The ship will fly into orbit in an hour if one of the workers dies |
| Open The Noor         | All big doors are locked in the level                              |
| Out Side Enemy Day    | Increased amount of enemies on the surface during the daytime      |
| Slime                 | Increased chance of slime spawn                                    |
| SpringMan             | Increased chance of spring man spawning (coil-head)                |
| Turret                | Increased chance of turrets spawning                               |
| Bee                   | Increased chance of bee hives spawning                             |
| HullBreak             | Getting money for visiting this moon                               |
| Nutcracker            | Increased chance of NutCracker spawn                               |
</details>

Creating custom events! [GitHub's instruction](https://github.com/Venterok/HullBreakerCompany#creating-custom-event).

### Notes about moon [ Events ]
<img src="https://i.imgur.com/YxaGVS5.png" width="1280px" />

### Flexible configurable 
<img src="https://i.imgur.com/KNfpz7c.png" width="1280px" />

# CHANGELOG

### * v1.2.0 Custom events for everyone & more
[[Send suggestion or issue here]](https://github.com/Venterok/HullBreakerCompany/issues)
- added **two** new events
- **now supports creating custom events**
- company building now won't generate events
- added event mode, when events amount increases per day [[Suggestion]](https://github.com/Venterok/HullBreakerCompany/issues/3)
- added event description in hullbreaker config [[Suggestion]](https://github.com/Venterok/HullBreakerCompany/issues/3)
- added config value for Landmine and Turret event [[Suggestion]](https://github.com/Venterok/HullBreakerCompany/issues/5)
- added config value for increasing the number of enemies [[Suggestion]](https://github.com/Venterok/HullBreakerCompany/issues/5)
- added option in settings to replace event messages with new short variants, it creates a surprise effect and adds more difficulty
- migrate from enum to hullEvent at the code level, but the game remained unchanged
- adjusted events weights `[ If you have troubles, delete cfg pls ]`
- automatic config manager for new and custom events

### * v1.2.5 Major config changes
[[Send suggestion or issue here]](https://github.com/Venterok/HullBreakerCompany/issues)
- almost all game values can now be changed in cfg (scrap, enemies, quota) [[Suggestion]](https://github.com/Venterok/HullBreakerCompany/issues/9)
- can turn off Hullbreaker settings and use default 
- changed thunderstore page
- fixed outside enemies spawn

### * v1.3.0 Quality of life
[[Send suggestion or issue here]](https://github.com/Venterok/HullBreakerCompany/issues)
- fixed when flying to the same moon, the values are now reset, the effect of an endless snowball when it is impossible to play after a couple of hours has been [[Issue]](https://github.com/Venterok/HullBreakerCompany/issues/9)
- returned event `"OutSideEnemyDay"`
- creating plugin instance now in Awake(), `HideManagerGameObject = true`, now work
- settings like `maxScrap` and e.t.c now have default value based on game defaults
- added support for creating events with outside enemies like Eyeless Dog [[Suggestion]](https://github.com/Venterok/HullBreakerCompany/issues/13)
- event `"Turrets"` are temporarily disabled

### * v1.3.5 Quality of life
[[Send suggestion or issue here]](https://github.com/Venterok/HullBreakerCompany/issues)
- added **one** new event
- added event list for Thunderstore page
- adjust event weights
- changed the order of settings in the config
- code reformat for convenient future updates
- custom events are now displayed in white text
- fixed issue with custom events, OutSideEnemies don't work [[Issue]](https://github.com/Venterok/HullBreakerCompany/issues/15)
- fixed wrong named of ForestGiant [[Issue]](https://github.com/Venterok/HullBreakerCompany/issues/14)
- fixed LevelUnits (Turrets and Landmine) [[Issue]](https://github.com/Venterok/HullBreakerCompany/issues/16)

### * v1.3.8 Version 45 update
[[Send suggestion or issue here]](https://github.com/Venterok/HullBreakerCompany/issues)
- added an event with the spawn of a new enemy, `NutCracker`
- the weights of some events have been changed
- hullmanager is no longer internal
- the reset of dayPassed for `increase event per day` when exiting the game has been returned
- added support for nutcracker custom events
- `[soon]` an expansion for HullBreaker will be released soon. This Expansion introduces new mechanics and events that I wouldn't add to the main mod. Also, this Expansion will serve as an open-source guide on how to create your own events for my mod.

### * v1.3.9 Small fixes
[[Send suggestion or issue here]](https://github.com/Venterok/HullBreakerCompany/issues)
- the `OneForAll` event was temporarily disabled, after v45 it broke
- temporary fixes for the spawn of some enemies were removed, it was fixed
- `maskedplayerenemy` was added for custom events, I myself have not tested whether it works or not, any troubles - create an issue on GitHub
- phantom spawn rate addition fixed
- added `NutCracker` to list on ThunderStore page
- the `AddEvent` method has been added to `CustomEventLoader`, if you understand dev mods, you can already create addons