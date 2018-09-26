package com.java.jikexueyuan.bridgems.bridge;

import com.java.jikexueyuan.bridgems.control.LGControl;
import com.java.jikexueyuan.bridgems.control.SharpControl;
import com.java.jikexueyuan.bridgems.control.SonyControl;


public class MainTest {
	public static void main(String[] args) {
		TvControl mLGTvControl;
		TvControl mSonyTvControl;
		mSonyTvControl=new TvControl(new SonyControl());
		mLGTvControl=new TvControl(new LGControl());
		mLGTvControl.Onoff();
		mLGTvControl.nextChannel();
		mLGTvControl.nextChannel();
		mLGTvControl.preChannel();
		mLGTvControl.Onoff();
		
		mSonyTvControl.Onoff();
		mSonyTvControl.preChannel();
		mSonyTvControl.preChannel();
		mSonyTvControl.preChannel();
		mSonyTvControl.Onoff();
		
		newTvControl mSharpTvControl;
		mSharpTvControl=new newTvControl(new SharpControl());
		mSharpTvControl.Onoff();
		mSharpTvControl.nextChannel();
		mSharpTvControl.setChannel(9);
		mSharpTvControl.setChannel(28);
		mSharpTvControl.Back();
		mSharpTvControl.Onoff();
		
	}


}
