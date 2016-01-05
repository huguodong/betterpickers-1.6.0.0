package md5bd2d22a16ac93dfa55230601d49eeaa5;


public class ChoiceListFragment
	extends android.support.v4.app.ListFragment
	implements
		mono.android.IGCUserPeer
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onActivityCreated:(Landroid/os/Bundle;)V:GetOnActivityCreated_Landroid_os_Bundle_Handler\n" +
			"";
		mono.android.Runtime.register ("BetterPickersSample.ChoiceListFragment, BetterPickersSample, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", ChoiceListFragment.class, __md_methods);
	}


	public ChoiceListFragment () throws java.lang.Throwable
	{
		super ();
		if (getClass () == ChoiceListFragment.class)
			mono.android.TypeManager.Activate ("BetterPickersSample.ChoiceListFragment, BetterPickersSample, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onActivityCreated (android.os.Bundle p0)
	{
		n_onActivityCreated (p0);
	}

	private native void n_onActivityCreated (android.os.Bundle p0);

	java.util.ArrayList refList;
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
