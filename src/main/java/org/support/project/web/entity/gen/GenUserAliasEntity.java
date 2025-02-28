package org.support.project.web.entity.gen;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.support.project.common.bean.ValidateError;
import org.support.project.common.validate.Validator;
import org.support.project.common.validate.ValidatorFactory;
import org.support.project.di.Container;
import org.support.project.di.DI;
import org.support.project.di.Instance;

/**
 * ユーザのエイリアス
 */
@DI(instance = Instance.Prototype)
public class GenUserAliasEntity implements Serializable {

    /** SerialVersion */
    private static final long serialVersionUID = 1L;

    /**
     * Get instance from DI container.
     * @return instance
     */
    public static GenUserAliasEntity get() {
        return Container.getComp(GenUserAliasEntity.class);
    }

    /**
     * Constructor.
     */
    public GenUserAliasEntity() {
        super();
    }

    /**
     * Constructor
     * @param authKey 認証設定キー
     * @param userId ユーザID
     */

    public GenUserAliasEntity(String authKey, Integer userId) {
        super();
        this.authKey = authKey;
        this.userId = userId;
    }
    /** ユーザID */
    private Integer userId;
    /** 認証設定キー */
    private String authKey;
    /** エイリアスのキー */
    private String aliasKey;
    /** エイリアスの表示名 */
    private String aliasName;
    /** メールアドレス */
    private String aliasMail;
    /** アカウント情報更新フラグ */
    private Integer userInfoUpdate;
    /** 行ID */
    private String rowId;
    /** 登録ユーザ */
    private Integer insertUser;
    /** 登録日時 */
    private Timestamp insertDatetime;
    /** 更新ユーザ */
    private Integer updateUser;
    /** 更新日時 */
    private Timestamp updateDatetime;
    /** 削除フラグ */
    private Integer deleteFlag;

    /**
     * Get ユーザID.
     * @return ユーザID
     */
    public Integer getUserId() {
        return this.userId;
    }
    /**
     * Set ユーザID.
     * @param userId ユーザID
     * @return this object     */
    public GenUserAliasEntity setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Get 認証設定キー.
     * @return 認証設定キー
     */
    public String getAuthKey() {
        return this.authKey;
    }
    /**
     * Set 認証設定キー.
     * @param authKey 認証設定キー
     * @return this object     */
    public GenUserAliasEntity setAuthKey(String authKey) {
        this.authKey = authKey;
        return this;
    }

    /**
     * Get エイリアスのキー.
     * @return エイリアスのキー
     */
    public String getAliasKey() {
        return this.aliasKey;
    }
    /**
     * Set エイリアスのキー.
     * @param aliasKey エイリアスのキー
     * @return this object     */
    public GenUserAliasEntity setAliasKey(String aliasKey) {
        this.aliasKey = aliasKey;
        return this;
    }

    /**
     * Get エイリアスの表示名.
     * @return エイリアスの表示名
     */
    public String getAliasName() {
        return this.aliasName;
    }
    /**
     * Set エイリアスの表示名.
     * @param aliasName エイリアスの表示名
     * @return this object     */
    public GenUserAliasEntity setAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }

    /**
     * Get メールアドレス.
     * @return メールアドレス
     */
    public String getAliasMail() {
        return this.aliasMail;
    }
    /**
     * Set メールアドレス.
     * @param aliasMail メールアドレス
     * @return this object     */
    public GenUserAliasEntity setAliasMail(String aliasMail) {
        this.aliasMail = aliasMail;
        return this;
    }

    /**
     * Get アカウント情報更新フラグ.
     * @return アカウント情報更新フラグ
     */
    public Integer getUserInfoUpdate() {
        return this.userInfoUpdate;
    }
    /**
     * Set アカウント情報更新フラグ.
     * @param userInfoUpdate アカウント情報更新フラグ
     * @return this object     */
    public GenUserAliasEntity setUserInfoUpdate(Integer userInfoUpdate) {
        this.userInfoUpdate = userInfoUpdate;
        return this;
    }

    /**
     * Get 行ID.
     * @return 行ID
     */
    public String getRowId() {
        return this.rowId;
    }
    /**
     * Set 行ID.
     * @param rowId 行ID
     * @return this object     */
    public GenUserAliasEntity setRowId(String rowId) {
        this.rowId = rowId;
        return this;
    }

    /**
     * Get 登録ユーザ.
     * @return 登録ユーザ
     */
    public Integer getInsertUser() {
        return this.insertUser;
    }
    /**
     * Set 登録ユーザ.
     * @param insertUser 登録ユーザ
     * @return this object     */
    public GenUserAliasEntity setInsertUser(Integer insertUser) {
        this.insertUser = insertUser;
        return this;
    }

    /**
     * Get 登録日時.
     * @return 登録日時
     */
    public Timestamp getInsertDatetime() {
        return this.insertDatetime;
    }
    /**
     * Set 登録日時.
     * @param insertDatetime 登録日時
     * @return this object     */
    public GenUserAliasEntity setInsertDatetime(Timestamp insertDatetime) {
        this.insertDatetime = insertDatetime;
        return this;
    }

    /**
     * Get 更新ユーザ.
     * @return 更新ユーザ
     */
    public Integer getUpdateUser() {
        return this.updateUser;
    }
    /**
     * Set 更新ユーザ.
     * @param updateUser 更新ユーザ
     * @return this object     */
    public GenUserAliasEntity setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
        return this;
    }

    /**
     * Get 更新日時.
     * @return 更新日時
     */
    public Timestamp getUpdateDatetime() {
        return this.updateDatetime;
    }
    /**
     * Set 更新日時.
     * @param updateDatetime 更新日時
     * @return this object     */
    public GenUserAliasEntity setUpdateDatetime(Timestamp updateDatetime) {
        this.updateDatetime = updateDatetime;
        return this;
    }

    /**
     * Get 削除フラグ.
     * @return 削除フラグ
     */
    public Integer getDeleteFlag() {
        return this.deleteFlag;
    }
    /**
     * Set 削除フラグ.
     * @param deleteFlag 削除フラグ
     * @return this object     */
    public GenUserAliasEntity setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
        return this;
    }

    /**
     * Get key values 
     * @return values 
     */
    public Object[] getKeyValues() {
        Object[] keyValues = new Object[2];
        keyValues[0] = this.authKey;
        keyValues[1] = this.userId;
        return keyValues;
    }
    /**
     * Set key values 
     * @param authKey 認証設定キー
     * @param userId ユーザID
     */
    public void setKeyValues(String authKey, Integer userId) {
        this.authKey = authKey;
        this.userId = userId;
    }
    /**
     * compare on key 
     * @param entity entity 
     * @return result 
     */
    public boolean equalsOnKey(GenUserAliasEntity entity) {
        Object[] keyValues1 = getKeyValues();
        Object[] keyValues2 = entity.getKeyValues();
        for (int i = 0; i < keyValues1.length; i++) {
            Object val1 = keyValues1[i];
            Object val2 = keyValues2[i];
            if (val1 == null && val2 != null) {
                return false;
            }
            if (val1 != null && val2 == null) {
                return false;
            }
            if (val1 != null && val2 != null) {
                if (!val1.equals(val2)) {
                    return false;
                }
            }
            
        }
        return true;
    }
    /**
     * ToString 
     * @return string 
     */
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("authKey = ").append(authKey).append("\n");
        builder.append("userId = ").append(userId).append("\n");
        builder.append("aliasKey = ").append(aliasKey).append("\n");
        builder.append("aliasName = ").append(aliasName).append("\n");
        builder.append("aliasMail = ").append(aliasMail).append("\n");
        builder.append("userInfoUpdate = ").append(userInfoUpdate).append("\n");
        builder.append("rowId = ").append(rowId).append("\n");
        builder.append("insertUser = ").append(insertUser).append("\n");
        builder.append("insertDatetime = ").append(insertDatetime).append("\n");
        builder.append("updateUser = ").append(updateUser).append("\n");
        builder.append("updateDatetime = ").append(updateDatetime).append("\n");
        builder.append("deleteFlag = ").append(deleteFlag).append("\n");
        return builder.toString();
    }
    /**
     * Convert label to display 
     * @param label label
     * @return convert label 
     */
    protected String convLabelName(String label) {
        return label;
    }
    /**
     * validate 
     * @return validate error list 
     */
    public List<ValidateError> validate() {
        List<ValidateError> errors = new ArrayList<>();
        Validator validator;
        ValidateError error;
        validator = ValidatorFactory.getInstance(Validator.REQUIRED);
        error = validator.validate(this.userId, convLabelName("User Id"));
        if (error != null) {
            errors.add(error);
        }
        validator = ValidatorFactory.getInstance(Validator.INTEGER);
        error = validator.validate(this.userId, convLabelName("User Id"));
        if (error != null) {
            errors.add(error);
        }
        validator = ValidatorFactory.getInstance(Validator.REQUIRED);
        error = validator.validate(this.authKey, convLabelName("Auth Key"));
        if (error != null) {
            errors.add(error);
        }
        validator = ValidatorFactory.getInstance(Validator.MAX_LENGTH);
        error = validator.validate(this.authKey, convLabelName("Auth Key"), 64);
        if (error != null) {
            errors.add(error);
        }
        validator = ValidatorFactory.getInstance(Validator.REQUIRED);
        error = validator.validate(this.aliasKey, convLabelName("Alias Key"));
        if (error != null) {
            errors.add(error);
        }
        validator = ValidatorFactory.getInstance(Validator.MAX_LENGTH);
        error = validator.validate(this.aliasKey, convLabelName("Alias Key"), 256);
        if (error != null) {
            errors.add(error);
        }
        validator = ValidatorFactory.getInstance(Validator.REQUIRED);
        error = validator.validate(this.aliasName, convLabelName("Alias Name"));
        if (error != null) {
            errors.add(error);
        }
        validator = ValidatorFactory.getInstance(Validator.MAX_LENGTH);
        error = validator.validate(this.aliasName, convLabelName("Alias Name"), 256);
        if (error != null) {
            errors.add(error);
        }
        validator = ValidatorFactory.getInstance(Validator.MAX_LENGTH);
        error = validator.validate(this.aliasMail, convLabelName("Alias Mail"), 256);
        if (error != null) {
            errors.add(error);
        }
        validator = ValidatorFactory.getInstance(Validator.INTEGER);
        error = validator.validate(this.userInfoUpdate, convLabelName("User Info Update"));
        if (error != null) {
            errors.add(error);
        }
        validator = ValidatorFactory.getInstance(Validator.MAX_LENGTH);
        error = validator.validate(this.rowId, convLabelName("Row Id"), 64);
        if (error != null) {
            errors.add(error);
        }
        validator = ValidatorFactory.getInstance(Validator.INTEGER);
        error = validator.validate(this.insertUser, convLabelName("Insert User"));
        if (error != null) {
            errors.add(error);
        }
        validator = ValidatorFactory.getInstance(Validator.INTEGER);
        error = validator.validate(this.updateUser, convLabelName("Update User"));
        if (error != null) {
            errors.add(error);
        }
        validator = ValidatorFactory.getInstance(Validator.INTEGER);
        error = validator.validate(this.deleteFlag, convLabelName("Delete Flag"));
        if (error != null) {
            errors.add(error);
        }
        return errors;
    }
    /**
     * validate 
     * @param values value map 
     * @return validate error list 
     */
    public List<ValidateError> validate(Map<String, String> values) {
        List<ValidateError> errors = new ArrayList<>();
        Validator validator;
        ValidateError error;
        validator = ValidatorFactory.getInstance(Validator.REQUIRED);
        error = validator.validate(values.get("userId"), convLabelName("User Id"));
        if (error != null) {
            errors.add(error);
        }
        validator = ValidatorFactory.getInstance(Validator.INTEGER);
        error = validator.validate(values.get("userId"), convLabelName("User Id"));
        if (error != null) {
            errors.add(error);
        }
        validator = ValidatorFactory.getInstance(Validator.REQUIRED);
        error = validator.validate(values.get("authKey"), convLabelName("Auth Key"));
        if (error != null) {
            errors.add(error);
        }
        validator = ValidatorFactory.getInstance(Validator.MAX_LENGTH);
        error = validator.validate(values.get("authKey"), convLabelName("Auth Key"), 64);
        if (error != null) {
            errors.add(error);
        }
        validator = ValidatorFactory.getInstance(Validator.REQUIRED);
        error = validator.validate(values.get("aliasKey"), convLabelName("Alias Key"));
        if (error != null) {
            errors.add(error);
        }
        validator = ValidatorFactory.getInstance(Validator.MAX_LENGTH);
        error = validator.validate(values.get("aliasKey"), convLabelName("Alias Key"), 256);
        if (error != null) {
            errors.add(error);
        }
        validator = ValidatorFactory.getInstance(Validator.REQUIRED);
        error = validator.validate(values.get("aliasName"), convLabelName("Alias Name"));
        if (error != null) {
            errors.add(error);
        }
        validator = ValidatorFactory.getInstance(Validator.MAX_LENGTH);
        error = validator.validate(values.get("aliasName"), convLabelName("Alias Name"), 256);
        if (error != null) {
            errors.add(error);
        }
        validator = ValidatorFactory.getInstance(Validator.MAX_LENGTH);
        error = validator.validate(values.get("aliasMail"), convLabelName("Alias Mail"), 256);
        if (error != null) {
            errors.add(error);
        }
        validator = ValidatorFactory.getInstance(Validator.INTEGER);
        error = validator.validate(values.get("userInfoUpdate"), convLabelName("User Info Update"));
        if (error != null) {
            errors.add(error);
        }
        validator = ValidatorFactory.getInstance(Validator.MAX_LENGTH);
        error = validator.validate(values.get("rowId"), convLabelName("Row Id"), 64);
        if (error != null) {
            errors.add(error);
        }
        validator = ValidatorFactory.getInstance(Validator.INTEGER);
        error = validator.validate(values.get("insertUser"), convLabelName("Insert User"));
        if (error != null) {
            errors.add(error);
        }
        validator = ValidatorFactory.getInstance(Validator.INTEGER);
        error = validator.validate(values.get("updateUser"), convLabelName("Update User"));
        if (error != null) {
            errors.add(error);
        }
        validator = ValidatorFactory.getInstance(Validator.INTEGER);
        error = validator.validate(values.get("deleteFlag"), convLabelName("Delete Flag"));
        if (error != null) {
            errors.add(error);
        }
        return errors;
    }

}
