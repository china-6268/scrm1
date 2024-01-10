package com.easy.marketgo.web.model.bo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.util.List;

/**
 * @author : kevinwang
 * @version : 1.0
 * @data : 6/21/22 7:49 PM
 * Describe:
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@ApiModel(description = "CDP的人群信息")
public class CdpUserGroupRule {

    @ApiModelProperty(value = "分群的list")
    private List<CrowdMessage> crowds;

    @ApiModelProperty(value = "CDP厂商类型 SENSORS 神策, ANALYSYS 易观, LINKFLOW " +
            "LinkFlow, CONVERTLAB ConvertLab, HYPERS hypers, GROWINGIO " +
            "GrowingIO, ALICLOUD 阿里云, TENCENTCLOUD 腾讯云 ")
    private String cdpType;

    @Data
    public static class CrowdMessage {
        /**
         * 分群code 在查询需要用到分群时都通过code来筛选
         */
        @ApiModelProperty(value = "分群code")
        private String code;

        /**
         * 分群名称
         */
        @ApiModelProperty(value = "分群名称")
        private String name;

        /**
         * 动态分群 1为动态分群 0为静态分群
         */
        @ApiModelProperty(value = "动态分群.1为动态分群 0为静态分群")
        private String dynamic;

        /**
         * 当前分群的用户数，全部用户默认不计算
         */
        @ApiModelProperty(value = "当前分群的用户数.")
        private Integer userCount;
    }
}
