package com.gmall.manage.mapper;


import com.gmall.bean.BaseAttrInfo;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface BaseAttrInfoMapper extends Mapper<BaseAttrInfo> {

    public List<BaseAttrInfo> selectAttrInfoList(long catalog3Id);

    List<BaseAttrInfo> selectAttrInfoListByIds(@Param("valueIds") String attrValueIds);
}
