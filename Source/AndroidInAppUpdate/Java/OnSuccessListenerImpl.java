package com.epicgames.ue4;

import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.install.model.AppUpdateType;
import com.google.android.play.core.install.model.UpdateAvailability;

public class OnSuccessListenerImpl implements com.google.android.play.core.tasks.OnSuccessListener<AppUpdateInfo>
{
	public GameActivity gameActivity;
	public boolean bIsOnResume = false;
	public static final int IMMEDIATE_UPDATE_REQUEST_CODE = 916;

	@Override
	public void onSuccess(AppUpdateInfo appUpdateInfo)
	{
		if ((!bIsOnResume && appUpdateInfo.updateAvailability() == UpdateAvailability.UPDATE_AVAILABLE) ||
				appUpdateInfo.updateAvailability() == UpdateAvailability.DEVELOPER_TRIGGERED_UPDATE_IN_PROGRESS)
		{
			try 
			{
				gameActivity.appUpdateManager.startUpdateFlowForResult(appUpdateInfo, AppUpdateType.IMMEDIATE, gameActivity, IMMEDIATE_UPDATE_REQUEST_CODE);
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}