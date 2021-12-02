# UE4 AndroidInAppUpdates
Unreal Engine 4 plugin that allow you to integrate in-app updates into your game.

![example](https://sun9-10.userapi.com/c858428/v858428440/10718d/nq8erL2a5Ng.jpg)

# Important notes
This plugin implements [Google Play In-App updates](https://developer.android.com/guide/app-bundle/in-app-updates) feature into UE4. For now Flexible type of update NOT SUPPORTED, only Immediate.
Plugin designed to work on 4.23.1 but probably will launch without any errors on earlier or later versions of Unreal.

Also note:
- Google in-app updates work only for Android 5+ devices 
- Google in-app updates does not work with internal test
- Update message can appear after some time when app was just published by system

# Installation
1. Download latest version of plugin
2. Unzip acrhive to /Plugins/
3. (for C++ usage) Open /Source/ProjectName/ProjectName.build.cs file and add AndroidInAppUpdate to dependency list.
4. Right Mouse Click to ProjectName.uproject -> Generate Project Files 

# Usage
After installation you need to call blueprint node named: TryRunImmediateUpdate. You can call it whatever place you want (like BeginPlay in LevelBlueprint). Make sure node get hit via breakpoint.

![example_bp_node](https://sun9-65.userapi.com/c857616/v857616643/107772/ogADTMDQk-8.jpg)

If you want call code via C++ you can do it via: UAndroidInAppUpdateBPLib::TryRunImmediateUpdate();
Don't forget, you also need to include "AndroidInAppUpdateBPLib.h" to file. 

# Troubleshoot
For troubleshoot please check this page of Google Documentation: [Troubleshoot](https://developer.android.com/guide/app-bundle/in-app-updates#troubleshoot).
If that will not help, please left your problem in Issue section of repository.

# Support
Feel free to do PR into this repository. Also feel free to use this plugin in you're own developer needs. If you having some troubles with plugin or want some feature use Issues section.

You can support this project by giving it a star.
