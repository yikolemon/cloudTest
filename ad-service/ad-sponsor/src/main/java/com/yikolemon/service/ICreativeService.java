package com.yikolemon.service;

import com.yikolemon.vo.CreativeRequest;
import com.yikolemon.vo.CreativeResponse;

/**
 * yikolemon
 */
public interface ICreativeService {

    CreativeResponse createCreative(CreativeRequest request);
}
