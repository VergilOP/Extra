# Jetpack Warning Mod

A Lethal Company mod that adds visual and audio indicators for when your jetpack may explode.

![warning meter example](https://github.com/klepticat/JetpackWarning/raw/main/assets/example.gif)

## Building

Place Lethal Company's `Assembly-CSharp.dll`, as well as `UnityEngine.CoreModule.dll`, `UnityEngine.UI.dll`, and `Unity.Netcode.Runtime.dll` in the `dlls/` folder.

These can be found in the `Lethal Company/Lethal Company_Data/Managed/` folder.

## Making a Thunderstore Package

Thunderstore packages can be generated on Windows using `make_release.ps1`. This will create a file using the version listed in manifest.json at `releases/JetpackWarningX.Y.Z.zip` containing the latest release build from `bin/Release/netstandard2.1/` as well as all required (and optional) Thunderstore files. You may need to edit the script or your build output folder depending on which IDE you use.

Making a Thunderstore package locally can be useful to import the mod to r2modman and make sure the Thunderstore package will work properly.

Alternatively, you can create the .zip manually.