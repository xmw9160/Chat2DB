package com.alibaba.dataops.server.web.api.controller.connection.request;


import javax.validation.constraints.NotNull;

import lombok.Data;

/**
 * @author moji
 * @version ConnectionCreateRequest.java, v 0.1 2022年09月16日 14:23 moji Exp $
 * @date 2022/09/16
 */
@Data
public class ConnectionTestRequest {

    /**
     * 连接别名
     */
    private String alias;

    /**
     * 连接地址
     */
    @NotNull
    private String url;

    /**
     * 连接用户
     */
    private String name;

    /**
     * 密码
     */
    @NotNull
    private String password;

    /**
     * 连接类型
     * @see com.alibaba.dataops.server.tools.base.enums.ConnectionTypeEnum
     */
    @NotNull
    private String type;
}
