package md57dad3e1b5cf844c334583f774f0faf9f;


public class MainActivity_UsbDeviceDetachedReceiver
	extends android.content.BroadcastReceiver
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onReceive:(Landroid/content/Context;Landroid/content/Intent;)V:GetOnReceive_Landroid_content_Context_Landroid_content_Intent_Handler\n" +
			"";
		mono.android.Runtime.register ("UsbSerialExampleApp.MainActivity+UsbDeviceDetachedReceiver, UsbSerialExampleApp, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", MainActivity_UsbDeviceDetachedReceiver.class, __md_methods);
	}


	public MainActivity_UsbDeviceDetachedReceiver () throws java.lang.Throwable
	{
		super ();
		if (getClass () == MainActivity_UsbDeviceDetachedReceiver.class)
			mono.android.TypeManager.Activate ("UsbSerialExampleApp.MainActivity+UsbDeviceDetachedReceiver, UsbSerialExampleApp, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

	public MainActivity_UsbDeviceDetachedReceiver (md57dad3e1b5cf844c334583f774f0faf9f.MainActivity p0) throws java.lang.Throwable
	{
		super ();
		if (getClass () == MainActivity_UsbDeviceDetachedReceiver.class)
			mono.android.TypeManager.Activate ("UsbSerialExampleApp.MainActivity+UsbDeviceDetachedReceiver, UsbSerialExampleApp, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "UsbSerialExampleApp.MainActivity, UsbSerialExampleApp, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", this, new java.lang.Object[] { p0 });
	}


	public void onReceive (android.content.Context p0, android.content.Intent p1)
	{
		n_onReceive (p0, p1);
	}

	private native void n_onReceive (android.content.Context p0, android.content.Intent p1);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
