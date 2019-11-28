#include "../Public/AndroidInAppUpdateBPLib.h"

#if PLATFORM_ANDROID
#include "Android/AndroidJNI.h"
#include "AndroidApplication.h"
#endif

void UAndroidInAppUpdateBPLib::TryRunImmediateUpdate()
{
#if PLATFORM_ANDROID
	JNIEnv* env = FAndroidApplication::GetJavaEnv();
	jmethodID CheckForUpdate = FJavaWrapper::FindMethod(env,
		FJavaWrapper::GameActivityClassID,
		"AndroidThunkJava_RunInAppUpdateCheck",
		"()V", false);
	FJavaWrapper::CallVoidMethod(env, FJavaWrapper::GameActivityThis, CheckForUpdate);
#endif
}