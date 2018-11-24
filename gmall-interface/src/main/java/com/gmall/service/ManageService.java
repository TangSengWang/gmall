package com.gmall.service;

import com.gmall.bean.BaseAttrInfo;
import com.gmall.bean.BaseCatalog1;
import com.gmall.bean.BaseCatalog2;
import com.gmall.bean.BaseCatalog3;

import java.util.List;

public interface ManageService {

    public List<BaseCatalog1> getCatalog1();

    public List<BaseCatalog2> getCatalog2(String catalog1Id);

    public List<BaseCatalog3> getCatalog3(String catalog2Id);

    public List<BaseAttrInfo> getAttrList(String catalog3Id);

    void saveAttrInfo(BaseAttrInfo baseAttrInfo);

    BaseAttrInfo getAttrInfo(String attrId);

    void delAttrInfo(String attrInfoId);
}
