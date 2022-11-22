package com.yikolemon.service;

import com.yikolemon.exception.AdException;
import com.yikolemon.vo.CreateUserRequest;
import com.yikolemon.vo.CreateUserResponse;

/**
 * yikolemon
 */
public interface IUserService {

    /**
     * <h2>创建用户</h2>
     * */
    CreateUserResponse createUser(CreateUserRequest request)
            throws AdException;
}
