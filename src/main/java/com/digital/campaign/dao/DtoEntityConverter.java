package com.digital.campaign.dao;

import org.springframework.stereotype.Component;

/**
 * This is the DAO(Data Access Object) layer interface for the conversion of DTO
 * objects to their respective entity object and vice versa.
 *
 * @param <T>
 *            dtoObject to be convert into entity object.
 * @param <E>
 *            entity object.
 * 
 */
@Component
public interface DtoEntityConverter<T, E> {
    /**
     * Convert dtoObject to entityObject.
     * 
     * @param dtoObject
     *            DTO object to convert from
     * @param entityObject
     *            Entity object to convert to
     */
    E dtoToEntityConvert(final T dto);

    /**
     * Convert dtoObject to entityObject.
     * 
     * @param dtoObject
     *            DTO object to convert from
     * @param entityObject
     *            Entity object to convert to
     */
    T entityToDtoConvert(final E entity);
}
