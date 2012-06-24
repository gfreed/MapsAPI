package com.google.android.maps;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;

public interface IRegisterReceiver {

	Intent registerReceiver(BroadcastReceiver receiver, IntentFilter filter);

	void unregisterReceiver(BroadcastReceiver receiver);
}
