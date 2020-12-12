package com.fandow.oa.domain.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * ${Description}
 *
 * @author <a href="mailto::liruizhao0302@dingtalk.com">李锐钊</a>
 * @since  2020/12/12
 * @version ${Version}
 */
@TableName(value = "oa_activity_log")
public class OaActivityLog implements Serializable {
    @TableId(value = "id", type = IdType.INPUT)
    private Integer id;

    /**
     * 操作人ID
     */
    @TableField(value = "createrid")
    private Integer createrid;

    /**
     * 操作人姓名
     */
    @TableField(value = "creater")
    private String creater;

    /**
     * 部门ID
     */
    @TableField(value = "applyDeptId")
    private Integer applydeptid;

    /**
     * 部门名称
     */
    @TableField(value = "applyDept")
    private String applydept;

    /**
     * 创建时间
     */
    @TableField(value = "createtime")
    private Integer createtime;

    /**
     * 控制器名
     */
    @TableField(value = "controller")
    private String controller;

    /**
     * 动作名
     */
    @TableField(value = "`action`")
    private String action;

    /**
     * 完整的URL
     */
    @TableField(value = "url")
    private String url;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_CREATERID = "createrid";

    public static final String COL_CREATER = "creater";

    public static final String COL_APPLYDEPTID = "applyDeptId";

    public static final String COL_APPLYDEPT = "applyDept";

    public static final String COL_CREATETIME = "createtime";

    public static final String COL_CONTROLLER = "controller";

    public static final String COL_ACTION = "action";

    public static final String COL_URL = "url";

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取操作人ID
     *
     * @return createrid - 操作人ID
     */
    public Integer getCreaterid() {
        return createrid;
    }

    /**
     * 设置操作人ID
     *
     * @param createrid 操作人ID
     */
    public void setCreaterid(Integer createrid) {
        this.createrid = createrid;
    }

    /**
     * 获取操作人姓名
     *
     * @return creater - 操作人姓名
     */
    public String getCreater() {
        return creater;
    }

    /**
     * 设置操作人姓名
     *
     * @param creater 操作人姓名
     */
    public void setCreater(String creater) {
        this.creater = creater;
    }

    /**
     * 获取部门ID
     *
     * @return applyDeptId - 部门ID
     */
    public Integer getApplydeptid() {
        return applydeptid;
    }

    /**
     * 设置部门ID
     *
     * @param applydeptid 部门ID
     */
    public void setApplydeptid(Integer applydeptid) {
        this.applydeptid = applydeptid;
    }

    /**
     * 获取部门名称
     *
     * @return applyDept - 部门名称
     */
    public String getApplydept() {
        return applydept;
    }

    /**
     * 设置部门名称
     *
     * @param applydept 部门名称
     */
    public void setApplydept(String applydept) {
        this.applydept = applydept;
    }

    /**
     * 获取创建时间
     *
     * @return createtime - 创建时间
     */
    public Integer getCreatetime() {
        return createtime;
    }

    /**
     * 设置创建时间
     *
     * @param createtime 创建时间
     */
    public void setCreatetime(Integer createtime) {
        this.createtime = createtime;
    }

    /**
     * 获取控制器名
     *
     * @return controller - 控制器名
     */
    public String getController() {
        return controller;
    }

    /**
     * 设置控制器名
     *
     * @param controller 控制器名
     */
    public void setController(String controller) {
        this.controller = controller;
    }

    /**
     * 获取动作名
     *
     * @return action - 动作名
     */
    public String getAction() {
        return action;
    }

    /**
     * 设置动作名
     *
     * @param action 动作名
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * 获取完整的URL
     *
     * @return url - 完整的URL
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置完整的URL
     *
     * @param url 完整的URL
     */
    public void setUrl(String url) {
        this.url = url;
    }
}