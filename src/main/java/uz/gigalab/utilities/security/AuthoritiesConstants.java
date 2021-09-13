package uz.gigalab.utilities.security;

/**
 * Constants for Spring Security authorities.
 */
public enum AuthoritiesConstants {

    ROLE_ADMIN,
    ROLE_USER,
    ROLE_ANONYMOUS,

    //region Управление справочником
    ROLE_SETTING_DICTIONARY_VIEW,
    ROLE_SETTING_DICTIONARY_ADD,
    ROLE_SETTING_DICTIONARY_EDIT,
    ROLE_SETTING_DICTIONARY_DELETE,
    //endregion

    //region Организация
    ROLE_ORGANIZATION_ALL_VIEW,
    ROLE_ORGANIZATION_REGION_VIEW,
    ROLE_ORGANIZATION_DISTRICT_VIEW,
    ROLE_ORGANIZATION_CURRENT_VIEW,

    ROLE_ORGANIZATION_ALL_ADD,
    ROLE_ORGANIZATION_REGION_ADD,
    ROLE_ORGANIZATION_DISTRICT_ADD,

    ROLE_ORGANIZATION_ALL_EDIT,
    ROLE_ORGANIZATION_REGION_EDIT,
    ROLE_ORGANIZATION_DISTRICT_EDIT,
    ROLE_ORGANIZATION_CURRENT_EDIT,
    //endregion

    //region Кадры
    ROLE_EMPLOYEE_ALL_VIEW,
    ROLE_EMPLOYEE_REGION_VIEW,
    ROLE_EMPLOYEE_DISTRICT_VIEW,
    ROLE_EMPLOYEE_CURRENT_VIEW,

    ROLE_EMPLOYEE_ALL_ADD,
    ROLE_EMPLOYEE_REGION_ADD,
    ROLE_EMPLOYEE_DISTRICT_ADD,
    ROLE_EMPLOYEE_CURRENT_ADD,

    ROLE_EMPLOYEE_ALL_EDIT,
    ROLE_EMPLOYEE_REGION_EDIT,
    ROLE_EMPLOYEE_DISTRICT_EDIT,
    ROLE_EMPLOYEE_CURRENT_EDIT,
    //endregion

    //region Воспитанники
    ROLE_PUPIL_ALL_VIEW,
    ROLE_PUPIL_REGION_VIEW,
    ROLE_PUPIL_DISTRICT_VIEW,
    ROLE_PUPIL_CURRENT_VIEW,

    ROLE_PUPIL_ALL_ADD,
    ROLE_PUPIL_REGION_ADD,
    ROLE_PUPIL_DISTRICT_ADD,
    ROLE_PUPIL_CURRENT_ADD,

    ROLE_PUPIL_ALL_EDIT,
    ROLE_PUPIL_REGION_EDIT,
    ROLE_PUPIL_DISTRICT_EDIT,
    ROLE_PUPIL_CURRENT_EDIT,

    /**
     * Принятие воспитанников по направлению
     */
    ROLE_PUPIL_ALL_APPROVED,
    ROLE_PUPIL_REGION_APPROVED,
    ROLE_PUPIL_DISTRICT_APPROVED,
    ROLE_PUPIL_CURRENT_APPROVED,

    /**
     * Отчисление воспитанников
     */
    ROLE_PUPIL_ALL_DISMISS,
    ROLE_PUPIL_REGION_DISMISS,
    ROLE_PUPIL_DISTRICT_DISMISS,
    ROLE_PUPIL_CURRENT_DISMISS,
    //endregion

    //region Группы
    ROLE_EDUCATION_GROUP_ALL_VIEW,
    ROLE_EDUCATION_GROUP_REGION_VIEW,
    ROLE_EDUCATION_GROUP_DISTRICT_VIEW,
    ROLE_EDUCATION_GROUP_CURRENT_VIEW,

    ROLE_EDUCATION_GROUP_ALL_ADD,
    ROLE_EDUCATION_GROUP_REGION_ADD,
    ROLE_EDUCATION_GROUP_DISTRICT_ADD,
    ROLE_EDUCATION_GROUP_CURRENT_ADD,

    ROLE_EDUCATION_GROUP_ALL_EDIT,
    ROLE_EDUCATION_GROUP_REGION_EDIT,
    ROLE_EDUCATION_GROUP_DISTRICT_EDIT,
    ROLE_EDUCATION_GROUP_CURRENT_EDIT,
    //endregion


}
