package com.wefox.challenge.vo;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Builder;
import lombok.Data;


@Builder
@Data
public class ProductVO {
    private Long id;
    private String name;
    private String description;
    private Integer stock;
    private BigDecimal price;
    private Date created;
    private Date updated;
}
