# LateGameUpgrades
***INSTALL THE DEPENDENCIES***  
***ALL CLIENTS NEED THIS MOD INSTALLED***  

*Everything about this mod can be changed via the config "com.malco.lethalcompany.moreshipupgrades.config"*

to install just put the MoreShipUpgrades folder in your BepInEx plugins folder.

Type `lategame` in the terminal to see mod info.  
Type `lategame store` or `lgu` to view current upgrade status and cost.  
Type `info <upgrade>` for dynamic info.

This adds 14 powerful ship upgrades to make lategame last longer and remedy having a bunch of money and nothing to spend it on.

## Hotfix
Night vision invincibility fix.

## V 2.5.0
### **[ New ]**

- Night Vision Changes
    - Purchase the night vision headset in the vanilla store.
    - It has a new model that will arrive in the dropship, pick it up and left click to equip it.
    - By default night vision is lost on death.

- Individual Upgrades
    - The save file is now a dictionary of steam IDs.
    - By default all upgrades will only be applied to the client that purchased them.
    - The config has a setting to make upgrades shared.

- More Config Options
    - You can now configure upgrade tiers via the `Price of each additional upgrade` field.
        - Must be formatted like so `123,321,213`
        - The above example will result in the respective upgrade having three unlockable tiers.
        - The cost of the first will be 123, the second will be 321, and so on.
        - Remove the entry to make it a non tiered upgrade.
        - This might get kinda depreciated as more complex upgrade behaviours emerge.
    - Shared or individual upgrade option.
    - Even more night vision config options.

- Incompatability Coping
    - Previous attempts to get player cap mods fully compatible didn't completely work.
    - If credit desync occurs you can type `syncCredits` to attempt the rpc again.
    - If that fails clients can type `forceCredits 123` to manually sync credits.
    - `load lgu` has been applied and tested to the new system and will reload upgrades that failed to apply.
        - Note that this should also rarely occur now.
    - `reset lgu` has been applied to the new system and now wipes only your clients upgrades.

- New splash type screen that displays only ever once.
    - other small fixes and polishing things like that.

### **[ Upcoming ]**

- More complex / meaningful tiered upgrades.
- Some change / fix to the pager since it's vanilla now.
- More items and Upgrades.

## Community

### Please post bugs, assets, or ideas [on this post](https://discord.com/channels/1168655651455639582/1178407269994594435) after joining [this modding discord.](https://discord.gg/hzEcKFSSDX)

Feel free to [create a pull request](https://github.com/Malcolm-Q/LC-LateGameUpgrades) and help with the mod.

Anyone who contributes in any way is greatly appreciated. People willing to contribute 3D models are needed.

## Compatibility

### This changes and patches a lot so problems may arise.  
- Bigger Lobby and More Company are more or less compatible but credit desync can arise  
- LC Better Saves is currently incompatible but I made a PR and am awaiting the update on thunderstore :)  

## Credit
- GitHub Contributors
    - Dilly_The_Dillster
- Graphics / Art
    - Sad Amazon
- Beta Testers
    - Lann
    - Kapt
    - Rootbeer
    - Glitched

## Upgrades
***Everything is tweakable via the config***
* __Pager - $490__
    * A terminal upgrade for simple communication.
    * Enter `page <msg>` and all clients will see it in their chat.
    * ***This is now in the vanilla game so it will be changed or removed.***

* __Locksmith - $740__
    * Makes noise when picking, makes a lot of noise when failing.
    * Just run into a locked door to start the minigame.
    * Strike the pins in the order they flash to unlock the door.

* __Portable Teleporter - $300__
    * An item that when used teleports you back to the ship.
    * Keeps items.
    * 90% chance to get destroyed on use.

* __Advanced Portable Teleporter - $1750__
    * Same as above.
    * 20% chance to get destroyed on use.

* __Beekeeper - $450__
    * Circuit bees do significantly less damage to you.

* __Bigger Lungs - $700__
    * Increased sprint duration.

* __Running Shoes - $1000__
    * Increased movement speed.

* __Strong Legs - $300__
    * Jump higher.

* __Malware Broadcaster - $650__
    * Instead of disabling turrets and landmines; Destroy them.

* __Light Footed - $350__
    * Enemies have to be closer to hear your footsteps.
    * Applies to both walking and running.

* __Night Vision - $480__
    * Press Left Alt to toggle night vision.
    * Has self regenerating batery.
    * Pick up and lmb to equip.
    * Lose on death.

* __NV Headset Batteries - 300__
    * increases regen speed and decreases depletion speed of NV

* __Discombobulator - $550__
    * Enter `initattack` into the terminal to stun enemies around the ship.
    * Enter `cooldown` to view cooldown (120 seconds).
    * Attracts enemies in a larger radius than loud horn.

* __Better Scanner - $650__
    * Increase distance of Ship and Entrance pings drastically.
    * Increase distance of all other pings.
    * Line of sight is no longer needed for pings.

* __Back Muscles - $835__
    * No longer experience effects from carryweight.


