package com.gmall.service;

import com.gmall.bean.UserAddress;
import com.gmall.bean.UserInfo;

import java.util.List;

public interface UserInfoService {
    public List<UserInfo> getUserInfoList();
    List<UserAddress> getUserAddressList(String Id);
}
