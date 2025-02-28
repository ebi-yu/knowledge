package org.support.project.knowledge.entity;

import org.support.project.di.Container;
import org.support.project.di.DI;
import org.support.project.di.Instance;
import org.support.project.knowledge.entity.gen.GenParticipantsEntity;


/**
 * 参加者
 */
@DI(instance = Instance.Prototype)
public class ParticipantsEntity extends GenParticipantsEntity {

    /** SerialVersion */
    private static final long serialVersionUID = 1L;

    /**
     * Get instance from DI container.
     * @return instance
     */
    public static ParticipantsEntity get() {
        return Container.getComp(ParticipantsEntity.class);
    }

    /**
     * Constructor.
     */
    public ParticipantsEntity() {
        super();
    }

    /**
     * Constructor
     * @param knowledgeId ナレッジID
     * @param userId ユーザID
     */

    public ParticipantsEntity(Long knowledgeId, Integer userId) {
        super( knowledgeId,  userId);
    }

}
