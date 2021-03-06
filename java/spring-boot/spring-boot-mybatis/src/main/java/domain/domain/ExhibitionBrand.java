package domain.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * 展位与品牌关系表
 * @author 宁亚超 2018-02-07
 */
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ExhibitionBrand implements Serializable {

    /**
     * 主键
     */
    private int  id;

    /**
     * '租赁合同号'
     */
    private int leaseContract;

    /**
     * 展位号
     */
    private String exhibitionName;

    /**
     * 品牌主键
     */
    private int brandId;

    /**
     * 状态，0未签约  1 预租  2已签约
     */
    private int state;
}
