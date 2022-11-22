package com.yikolemon.service.impl;

import com.yikolemon.dao.CreativeRepository;
import com.yikolemon.entity.Creative;
import com.yikolemon.service.ICreativeService;
import com.yikolemon.vo.CreativeRequest;
import com.yikolemon.vo.CreativeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * yikolemon
 */
@Service
public class CreativeServiceImpl implements ICreativeService {

    private final CreativeRepository creativeRepository;

    @Autowired
    public CreativeServiceImpl(CreativeRepository creativeRepository) {
        this.creativeRepository = creativeRepository;
    }

    @Override
    public CreativeResponse createCreative(CreativeRequest request) {

        Creative creative = creativeRepository.save(
                request.convertToEntity()
        );

        return new CreativeResponse(creative.getId(), creative.getName());
    }
}
