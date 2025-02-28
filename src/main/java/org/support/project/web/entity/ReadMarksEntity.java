package org.support.project.web.entity;

import org.support.project.di.Container;
import org.support.project.di.DI;
import org.support.project.di.Instance;
import org.support.project.web.entity.gen.GenReadMarksEntity;


/**
 * 既読
 */
@DI(instance = Instance.Prototype)
public class ReadMarksEntity extends GenReadMarksEntity {

    /** SerialVersion */
    private static final long serialVersionUID = 1L;

    /**
     * Get instance from DI container.
     * @return instance
     */
    public static ReadMarksEntity get() {
        return Container.getComp(ReadMarksEntity.class);
    }

    /**
     * Constructor.
     */
    public ReadMarksEntity() {
        super();
    }

    /**
     * Constructor
     * @param no NO
     * @param userId ユーザID
     */

    public ReadMarksEntity(Integer no, Integer userId) {
        super( no,  userId);
    }

}
