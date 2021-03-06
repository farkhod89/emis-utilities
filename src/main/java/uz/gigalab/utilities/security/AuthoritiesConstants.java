package uz.gigalab.utilities.security;

import java.util.Set;

/**
 * Constants for Spring Security authorities.
 */
public final class AuthoritiesConstants {

    public static final String ROLE_SYSTEM = "ROLE_SYSTEM";
    public static final String ROLE_ADMIN = "ROLE_ADMIN";
    public static final String ROLE_USER = "ROLE_USER";
    public static final String ROLE_ANONYMOUS = "ROLE_ANONYMOUS";
    // Заведующий
    public static final String ROLE_MANAGER = "ROLE_MANAGER";
    public static final String ROLE_REGION_IKT = "ROLE_REGION_IKT";
    public static final String ROLE_DISTRICT_IKT = "ROLE_DISTRICT_IKT";


    //region Управление справочником
    public static final String ROLE_SETTING_DICTIONARY_VIEW = "ROLE_SETTING_DICTIONARY_VIEW";
    public static final String ROLE_SETTING_DICTIONARY_EDIT = "ROLE_SETTING_DICTIONARY_EDIT";
    public static final String ROLE_SETTING_DICTIONARY_DELETE = "ROLE_SETTING_DICTIONARY_DELETE";
    //endregion

    //region Организация
    public static final String ROLE_ORGANIZATION_ALL_VIEW = "ROLE_ORGANIZATION_ALL_VIEW";
    public static final String ROLE_ORGANIZATION_REGION_VIEW = "ROLE_ORGANIZATION_REGION_VIEW";
    public static final String ROLE_ORGANIZATION_DISTRICT_VIEW = "ROLE_ORGANIZATION_DISTRICT_VIEW";
    public static final String ROLE_ORGANIZATION_CURRENT_VIEW = "ROLE_ORGANIZATION_CURRENT_VIEW";

    public static final String ROLE_ORGANIZATION_ALL_EDIT = "ROLE_ORGANIZATION_ALL_EDIT";
    public static final String ROLE_ORGANIZATION_REGION_EDIT = "ROLE_ORGANIZATION_REGION_EDIT";
    public static final String ROLE_ORGANIZATION_DISTRICT_EDIT = "ROLE_ORGANIZATION_DISTRICT_EDIT";
    public static final String ROLE_ORGANIZATION_CURRENT_EDIT = "ROLE_ORGANIZATION_CURRENT_EDIT";
    //endregion

    //region Кадры
    public static final String ROLE_EMPLOYEE_ALL_VIEW = "ROLE_EMPLOYEE_ALL_VIEW";
    public static final String ROLE_EMPLOYEE_REGION_VIEW = "ROLE_EMPLOYEE_REGION_VIEW";
    public static final String ROLE_EMPLOYEE_DISTRICT_VIEW = "ROLE_EMPLOYEE_DISTRICT_VIEW";
    public static final String ROLE_EMPLOYEE_CURRENT_VIEW = "ROLE_EMPLOYEE_CURRENT_VIEW";

    public static final String ROLE_EMPLOYEE_ALL_EDIT = "ROLE_EMPLOYEE_ALL_EDIT";
    public static final String ROLE_EMPLOYEE_REGION_EDIT = "ROLE_EMPLOYEE_REGION_EDIT";
    public static final String ROLE_EMPLOYEE_DISTRICT_EDIT = "ROLE_EMPLOYEE_DISTRICT_EDIT";
    public static final String ROLE_EMPLOYEE_CURRENT_EDIT = "ROLE_EMPLOYEE_CURRENT_EDIT";


    //endregion

    //region Воспитанники
    public static final String ROLE_PUPIL_ALL_VIEW = "ROLE_PUPIL_ALL_VIEW";
    public static final String ROLE_PUPIL_REGION_VIEW = "ROLE_PUPIL_REGION_VIEW";
    public static final String ROLE_PUPIL_DISTRICT_VIEW = "ROLE_PUPIL_DISTRICT_VIEW";
    public static final String ROLE_PUPIL_CURRENT_VIEW = "ROLE_PUPIL_CURRENT_VIEW";

    public static final String ROLE_PUPIL_ALL_EDIT = "ROLE_PUPIL_ALL_EDIT";
    public static final String ROLE_PUPIL_REGION_EDIT = "ROLE_PUPIL_REGION_EDIT";
    public static final String ROLE_PUPIL_DISTRICT_EDIT = "ROLE_PUPIL_DISTRICT_EDIT";
    public static final String ROLE_PUPIL_CURRENT_EDIT = "ROLE_PUPIL_CURRENT_EDIT";

    /**
     * Принятие воспитанников по направлению
     */
    public static final String ROLE_PUPIL_ALL_APPROVED = "ROLE_PUPIL_ALL_APPROVED";
    public static final String ROLE_PUPIL_REGION_APPROVED = "ROLE_PUPIL_REGION_APPROVED";
    public static final String ROLE_PUPIL_DISTRICT_APPROVED = "ROLE_PUPIL_DISTRICT_APPROVED";
    public static final String ROLE_PUPIL_CURRENT_APPROVED = "ROLE_PUPIL_CURRENT_APPROVED";

    /**
     * Отчисление воспитанников
     */
    public static final String ROLE_PUPIL_ALL_DISMISS = "ROLE_PUPIL_ALL_DISMISS";
    public static final String ROLE_PUPIL_REGION_DISMISS = "ROLE_PUPIL_REGION_DISMISS";
    public static final String ROLE_PUPIL_DISTRICT_DISMISS = "ROLE_PUPIL_DISTRICT_DISMISS";
    public static final String ROLE_PUPIL_CURRENT_DISMISS = "ROLE_PUPIL_CURRENT_DISMISS";
    //endregion

    //region Группы
    public static final String ROLE_EDUCATION_GROUP_ALL_VIEW = "ROLE_EDUCATION_GROUP_ALL_VIEW";
    public static final String ROLE_EDUCATION_GROUP_REGION_VIEW = "ROLE_EDUCATION_GROUP_REGION_VIEW";
    public static final String ROLE_EDUCATION_GROUP_DISTRICT_VIEW = "ROLE_EDUCATION_GROUP_DISTRICT_VIEW";
    public static final String ROLE_EDUCATION_GROUP_CURRENT_VIEW = "ROLE_EDUCATION_GROUP_CURRENT_VIEW";

    public static final String ROLE_EDUCATION_GROUP_ALL_EDIT = "ROLE_EDUCATION_GROUP_ALL_EDIT";
    public static final String ROLE_EDUCATION_GROUP_REGION_EDIT = "ROLE_EDUCATION_GROUP_REGION_EDIT";
    public static final String ROLE_EDUCATION_GROUP_DISTRICT_EDIT = "ROLE_EDUCATION_GROUP_DISTRICT_EDIT";
    public static final String ROLE_EDUCATION_GROUP_CURRENT_EDIT = "ROLE_EDUCATION_GROUP_CURRENT_EDIT";
    //endregion


    public static Set<String> protectedRoles = Set.of(
        ROLE_ADMIN, ROLE_SYSTEM, ROLE_MANAGER, ROLE_REGION_IKT, ROLE_DISTRICT_IKT
    );

}
