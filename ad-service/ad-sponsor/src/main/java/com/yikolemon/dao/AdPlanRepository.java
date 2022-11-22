package com.yikolemon.dao;

import com.yikolemon.eneity.AdPlan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * yikolemon
 */
public interface AdPlanRepository extends JpaRepository<AdPlan, Long> {

    AdPlan findByIdAndUserId(Long id, Long userId);

    List<AdPlan> findAllByIdInAndUserId(List<Long> ids, Long userId);

    AdPlan findByUserIdAndPlanName(Long userId, String planName);

    List<AdPlan> findAllByPlanStatus(Integer status);
}
