package org.support.project.knowledge.entity;

import org.support.project.di.Container;
import org.support.project.di.DI;
import org.support.project.di.Instance;
import org.support.project.knowledge.entity.gen.GenMailLocaleTemplatesEntity;


/**
 * ロケール毎のメールテンプレート
 */
@DI(instance = Instance.Prototype)
public class MailLocaleTemplatesEntity extends GenMailLocaleTemplatesEntity {

    /** SerialVersion */
    private static final long serialVersionUID = 1L;

    /**
     * Get instance from DI container.
     * @return instance
     */
    public static MailLocaleTemplatesEntity get() {
        return Container.getComp(MailLocaleTemplatesEntity.class);
    }

    /**
     * Constructor.
     */
    public MailLocaleTemplatesEntity() {
        super();
    }

    /**
     * Constructor
     * @param key キー
     * @param templateId テンプレートID
     */

    public MailLocaleTemplatesEntity(String key, String templateId) {
        super( key,  templateId);
    }

}
