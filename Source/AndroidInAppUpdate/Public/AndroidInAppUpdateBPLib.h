#pragma once
#include "Kismet/BlueprintFunctionLibrary.h"
#include "AndroidInAppUpdateBPLib.generated.h"

UCLASS()
class ANDROIDINAPPUPDATE_API UAndroidInAppUpdateBPLib : public UBlueprintFunctionLibrary
{
	GENERATED_BODY()

public:
	UFUNCTION(BlueprintCallable, Category="Android | AndroidInAppUpdates")
		static void TryRunImmediateUpdate();
};