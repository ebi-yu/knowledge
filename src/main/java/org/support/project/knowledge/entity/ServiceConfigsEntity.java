package org.support.project.knowledge.entity;

import org.support.project.di.Container;
import org.support.project.di.DI;
import org.support.project.di.Instance;
import org.support.project.knowledge.entity.gen.GenServiceConfigsEntity;


/**
 * サービスの設定
 */
@DI(instance = Instance.Prototype)
public class ServiceConfigsEntity extends GenServiceConfigsEntity {

    /** SerialVersion */
    private static final long serialVersionUID = 1L;

    /**
     * Get instance from DI container.
     * @return instance
     */
    public static ServiceConfigsEntity get() {
        return Container.getComp(ServiceConfigsEntity.class);
    }

    /**
     * Constructor.
     */
    public ServiceConfigsEntity() {
        super();
    }

    /**
     * Constructor
     * @param serviceName サービス名
     */

    public ServiceConfigsEntity(String serviceName) {
        super( serviceName);
    }

}
