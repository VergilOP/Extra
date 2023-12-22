# NoDeathDespawn
A mod for Lethal Company which prevents scrap from despawning after a round when all players die. This was made to just make the game a little easier.

## Development Setup

- Clone the repo [NoDeathDespawn](https://github.com/RaspberryProgramming/NoDeathDespawn)
- You'll need to install [Visual Studio](https://visualstudio.microsoft.com/) and [.Net Framework 4.7.2](https://dotnet.microsoft.com/en-us/download/dotnet-framework/net472)
- Next, you'll need to create a new folder called Dependencies in the root of the github project folder and copy the following files from your lethal company's folder. common\Lethal Company\Lethal Company_Data\Managed
  - Assembly-CSharp-firstpass.dll
  - Assembly-CSharp.dll
  - Unity.Netcode.Runtime.dll
- Open the project solution in visual studio

## Installation

- Install [BepInEx](https://thunderstore.io/c/lethal-company/p/BepInEx/BepInExPack/)
- Unzip this mod into your `Lethal Company/BepInEx` folder

Or use the thunderstore mod manager to handle the installing for you.