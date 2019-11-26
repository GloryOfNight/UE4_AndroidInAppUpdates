# UE4_AndroidInAppUpdates
Unreal Engine 4 plugin that allow you to integrate in-app updates into you're game.

![example](https://sun9-10.userapi.com/c858428/v858428440/10718d/nq8erL2a5Ng.jpg)

# Important notes
This plugin implements [Google Play In-App updates](https://developer.android.com/guide/app-bundle/in-app-updates) feature into UE4. For now Flexible type of update NOT SUPPORTED in that plugin, only Immediate.
Plugin designed to work on 4.23.1 but probably will launch without any errors on earlier or latest version of Unreal.

# Installation
1. Download latest version of plugin
2. Unzip acrhive to ProjectFolder/Plugins/
3. (for C++ usage) Open ProjectFolder/Source/ProjectName/ProjectName.build.cs file and add AndroidInAppUpdate to dependency list.
4. Right Mouse Click to ProjectName.uproject -> Generate Project Files 

# Usage
After you install plugin for make it work you need to call blueprint node named: RunCheckForImmediateUpdate. You can call it whatever place you want (like BeginPlay on LevelBlueprint). Make sure node get hit via breakpoint.

If you want call node via C++ code you can do it via: UAndroidInAppUpdateBPLib::RunCheckForImmediateUpdate(); 
Don't forget, you also need to include "AndroidInAppUpdateBPLib.h" to file. 

# Troubleshoot
For troubleshoot please check this page of Google Documentation: [Troubleshoot](https://developer.android.com/guide/app-bundle/in-app-updates#troubleshoot)
