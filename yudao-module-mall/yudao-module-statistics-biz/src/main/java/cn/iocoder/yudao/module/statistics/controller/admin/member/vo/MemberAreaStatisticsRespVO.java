package cn.iocoder.yudao.module.statistics.controller.admin.member.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Schema(description = "管理后台 - 会员地区统计 Response VO")
@Data
public class MemberAreaStatisticsRespVO {

    @Schema(description = "省份编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
    private Integer areaId;
    @Schema(description = "省份名称", requiredMode = Schema.RequiredMode.REQUIRED, example = "浙江省")
    private String areaName;

    @Schema(description = "会员数量", requiredMode = Schema.RequiredMode.REQUIRED, example = "1024")
    private Integer userCount;

    // TODO @疯狂：要不 orderCreateUserCount 和 orderPayUserCount 貌似更统一一些；
    @Schema(description = "订单创建数量", requiredMode = Schema.RequiredMode.REQUIRED, example = "1024")
    private Integer orderCreateCount;
    @Schema(description = "订单支付数量", requiredMode = Schema.RequiredMode.REQUIRED, example = "512")
    private Integer orderPayCount;

    @Schema(description = "订单支付金额，单位：分", requiredMode = Schema.RequiredMode.REQUIRED, example = "622")
    private Integer orderPayPrice;

}
