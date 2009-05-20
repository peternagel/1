package com.mekya.interfaces;
import com.mekya.types.FriendInfo;


public interface IUpdateData {
	public void updateData(FriendInfo[] friends, FriendInfo[] unApprovedFriends, String userKey);

}
