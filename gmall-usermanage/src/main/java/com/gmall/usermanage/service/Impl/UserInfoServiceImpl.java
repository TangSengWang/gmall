package com.gmall.usermanage.service.Impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.gmall.bean.UserAddress;
import com.gmall.bean.UserInfo;
import com.gmall.service.UserInfoService;
import com.gmall.usermanage.mapper.UserAddressMapper;
import com.gmall.usermanage.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;
    @Autowired
    private UserAddressMapper userAddressMapper;
    @Override
    public List<UserInfo> getUserInfoList() {
        return userInfoMapper.selectAll();
    }

    @Override
    public List<UserAddress> getUserAddressList(String Id) {
        UserAddress userAddress = new UserAddress();
        userAddress.setUserId(Id);
        return userAddressMapper.select(userAddress);
    }
}
