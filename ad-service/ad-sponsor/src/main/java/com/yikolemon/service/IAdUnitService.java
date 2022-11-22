package com.yikolemon.service;

import com.yikolemon.exception.AdException;
import com.yikolemon.vo.AdUnitDistrictRequest;
import com.yikolemon.vo.AdUnitDistrictResponse;
import com.yikolemon.vo.AdUnitItRequest;
import com.yikolemon.vo.AdUnitItResponse;
import com.yikolemon.vo.AdUnitKeywordRequest;
import com.yikolemon.vo.AdUnitKeywordResponse;
import com.yikolemon.vo.AdUnitRequest;
import com.yikolemon.vo.AdUnitResponse;
import com.yikolemon.vo.CreativeUnitRequest;
import com.yikolemon.vo.CreativeUnitResponse;

/**
 * yikolemon
 */
public interface IAdUnitService {

    AdUnitResponse createUnit(AdUnitRequest request) throws AdException;

    AdUnitKeywordResponse createUnitKeyword(AdUnitKeywordRequest request)
        throws AdException;

    AdUnitItResponse createUnitIt(AdUnitItRequest request)
        throws AdException;

    AdUnitDistrictResponse createUnitDistrict(AdUnitDistrictRequest request)
        throws AdException;

    CreativeUnitResponse createCreativeUnit(CreativeUnitRequest request)
        throws AdException;
}
