package com.yikolemon.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * yikolemon
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdUnitItRequest {

    private List<UnitIt> unitIts;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class UnitIt {

        private Long unitId;
        private String itTag;
    }
}
