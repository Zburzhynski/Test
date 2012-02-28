package entity;
/**
 * @author Uladzimir_Zburzhynski
 *
 */
public class Manager extends Employee{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private String language;

    private Long experience;

    /**
     * @return the language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * @param language the language to set
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * @return the experience
     */
    public Long getExperience() {
        return experience;
    }

    /**
     * @param experience the experience to set
     */
    public void setExperience(Long experience) {
        this.experience = experience;
    }

}
