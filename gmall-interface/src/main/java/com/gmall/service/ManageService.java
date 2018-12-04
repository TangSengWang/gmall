package com.gmall.service;

import com.gmall.bean.*;

import java.util.List;

public interface ManageService {

    public List<BaseCatalog1> getCatalog1();

    public List<BaseCatalog2> getCatalog2(String catalog1Id);

    public List<BaseCatalog3> getCatalog3(String catalog2Id);

    public List<BaseAttrInfo> getAttrList(String catalog3Id);

    void saveAttrInfo(BaseAttrInfo baseAttrInfo);

    BaseAttrInfo getAttrInfo(String attrId);

    void delAttrInfo(String attrInfoId);

    List<SpuInfo> getSpuInfoList(SpuInfo spuInfo);

    List<BaseSaleAttr> getBaseSaleAttrList();

    void saveSpuInfo(SpuInfo spuInfo);

    public void saveSkuInfo(SkuInfo skuInfo);

    List<BaseAttrInfo> getAttrListByCatalog3Id(String catalog3Id);

    List<SpuSaleAttr> getSpuSaleAttrList(String spuId);

    List<SpuImage> getSpuImageList(String spuId);

    SkuInfo getSkuInfo(String skuId);

    List<SpuSaleAttr> selectSpuSaleAttrListCheckBySku(SkuInfo skuInfo);

    public List<SkuSaleAttrValue> getSkuSaleAttrValueListBySpu(String spuId);

    List<BaseAttrInfo> getAttrList(List<String> attrValueIdList);
}
