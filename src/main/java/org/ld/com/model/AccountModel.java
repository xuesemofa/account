package org.ld.com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * .name：字段名
 * .unique：是否唯一
 * .nullable：是否可以为空
 * .inserttable：是否可以插入
 * .updateable：是否可以更新
 * .columnDefinition: 定义建表时创建此列的DDL
 * .secondaryTable: 从表名。如果此列不建在主表上（默认建在主表），该属性定义该列所在从表的名字。
 * length:长度(String),不写就标识默认值
 * precision=12, scale=2(double,长度12，保留2位小数)
 * <p>
 * //@Temporal(TemporalType.DATE)//设置为时间类型
 * //@OrderBy(name = "group_name ASC, name DESC") 默认排序
 * //@GeneratedValue(strategy=GenerationType.IDENTITY)//主键自增，
 * 注意，这种方式依赖于具体的数据库，如果数据库不支持自增主键，那么这个类型是没法用的
 * 最恶心的关联关系
 * //@ManyToMany
 * //@JoinTable(name = "TMANY1_TMANY2", joinColumns = {//@JoinColumn(name = "MANYA_ID", referencedColumnName = "MANYA_ID")},
 * inverseJoinColumns = {//@JoinColumn(name = "MANYB_ID", referencedColumnName = "MANYB_ID")})
 * //@Transient说明此字段不用再数据库种创建 由于习惯开放数据库字段，不在数据库对字段做过多的限制，所以此处只有字段对应
 */
@Entity
@Table(name = "account_table")
public class AccountModel implements Serializable {
    //    主键
    @Id
    private String uuid;
    //    账号
    @Column(columnDefinition = "账户")
    private String account;
    //    密码
    @Column(columnDefinition = "密码")
    private String password;
    //    账号类型
//    1:客户  2：客户升级为商家  3：后台用户 -1:超级管理员
    @Column(columnDefinition = "账户类型 1：客户，2：客户升级为商家，3：后台用户，-1：超级管理员")
    private int acctype = 1;
    //    来源
    @Column(columnDefinition = "来源")
    private String source = "pc平台注册";
    //    第三方授权
    @Column(columnDefinition = "第三方授权")
    private String authorization;
    //    时间
//    @Temporal(TemporalType.DATE)
    @Column(columnDefinition = "注册时间")
    private long times;
    //    客户级别
//   级别越低数字越小
    @Column(columnDefinition = "客户级别，数字越小级别越低")
    private String level = "0";

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAcctype() {
        return acctype;
    }

    public void setAcctype(int acctype) {
        this.acctype = acctype;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getAuthorization() {
        return authorization;
    }

    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }

    public long getTimes() {
        return times;
    }

    public void setTimes(long times) {
        this.times = times;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public AccountModel() {
        super();
    }

    public AccountModel(String uuid, String account, String password, int acctype, String source, String authorization, long times, String level) {
        this.uuid = uuid;
        this.account = account;
        this.password = password;
        this.acctype = acctype;
        this.source = source;
        this.authorization = authorization;
        this.times = times;
        this.level = level;
    }

    @Override
    public String toString() {
        return "AccountModel{" +
                "uuid='" + uuid + '\'' +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", acctype=" + acctype +
                ", source='" + source + '\'' +
                ", authorization='" + authorization + '\'' +
                ", times=" + times +
                ", level='" + level + '\'' +
                '}';
    }
}
