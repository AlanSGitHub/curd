package com.max.curd.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * 系统信息实体类
 * JsonIgnoreProperties注解作用是将本对象转json的时候有空字符串时忽略报错
 * @author Max.
 * @date 2019-4-10
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "tb_system_info")
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class SystemInfo{
    /**
     * 主键
     */
    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid",strategy = "uuid")
    @Column(name="id",length=32)
    private String id;
    /**
     * 应用名称
     */
    @Column(name = "applicationName", nullable = false, columnDefinition = "longtext")
    private String applicationName;
    /**
     * 描述
     */
    @Column(name = "description",columnDefinition = "longtext")
    private String description;
    /**
     * 应用类型
     */
    @Column(columnDefinition = "varchar(32) comment '应用类型'")
    private String applicationType;
    /**
     * 使用状态
     */
    @Column
    private String userMode;
    /**
     * 部署环境
     */
    @Column
    private String deploymentEnvironment;
    /**
     * 所在网络
     */
    @Column
    private String network;
    /**
     * 业务域
     */
    @Column
    private String businessDomain;
    /**
     * 局域网ip
     */
    @Column
    private String lanIp;
    /**
     * 局域网域名
     */
    @Column
    private String lanDomain;
    /**
     * 公网ip
     */
    @Column
    private String internetIp;
    /**
     * 公网域名
     */
    @Column
    private String internetDomain;
    /**
     * 承建单位
     */
    @Column
    private String unitConstruction;
    /**
     * 维护单位
     */
    @Column
    private String maintenanceOfTheUnit;
    /**
     * 验收时间
     */
    @Column
    private String receptionTime;
    /**
     * 维护人员
     */
    @Column
    private String maintainer;
    /**
     * 维护人员联系方式
     */
    @Column
    private String maintainerContact;
    /**
     * 系统结构
     */
    @Column
    private String systemOrganization;
    /**
     * 开发语言
     */
    @Column
    private String developmentLanguage;
    /**
     * 框架插件
     */
    @Column(columnDefinition = "longtext")
    private String frameworkPlugins;
    /**
     * 是否移交源代码
     */
    @Column
    private String whetherToHandOverSourceCode;
    /**
     * 中间件
     */
    @Column
    private String middleware;
    /**
     * 是否接入统一平台
     */
    @Column
    private String whetherToAccessTheUnifiedPlatform;
    /**
     * 是否应用统一权限
     */
    @Column
    private String whetherUniformPermissionsApply;
    /**
     * 端口号
     */
    @Column
    private String port;
    /**
     * 端口描述
     */
    @Column(columnDefinition = "longtext")
    private String portDescription;
    /**
     * 应用程序路径
     */
    @Column(columnDefinition = "longtext")
    private String applicationPath;
    /**
     * 管理界面或后台地址
     */
    @Column(columnDefinition = "longtext")
    private String manageInterfaceOrBackgroundAddress;
    /**
     * 管理员账号
     */
    @Column(columnDefinition = "longtext")
    private String administratorAccount;
    /**
     * 管理员密码
     */
    @Column(columnDefinition = "longtext")
    private String administratorPassword;
    /**
     * 远程数据库
     */
    @Column(columnDefinition = "longtext")
    private String remoteDatabase;
    /**
     * 本地数据库类型
     */
    @Column
    private String localDatabaseType;
    /**
     * 数据库路径
     */
    @Column
    private String databasePath;
    /**
     * 数据库账号密码
     */
    @Column(columnDefinition = "longtext")
    private String databaseAccountAndPassword;
    /**
     * 附件路径
     */
    @Column(columnDefinition = "longtext")
    private String attachmentPath;
    /**
     * 是否注册系统自启动服务
     */
    @Column
    private String whetherToRegisterTheSystemToStartTheService;
    /**
     * 服务器重启后操作步骤
     */
    @Column(columnDefinition = "longtext")
    private String operationStepsAfterServerRestart;
    /**
     * 其他软件
     */
    @Column(columnDefinition = "longtext")
    private String otherSoftware;
    /**
     * 维护模式
     */
    @Column(columnDefinition = "longtext")
    private String maintenanceMode;
}
