package fr.btsciel;

public class PaysEU {
    private String name;
    private String capitale;
    private int habitant;
    private int superficie;
    private int adhesionYear;

    /**
     * Crée un nouveau pays avec les informations fournies.
     *
     * @param nom le nom du pays
     * @param capitale la capitale du pays
     * @param habitant le nombre d'habitants du pays
     * @param superficie la superficie du pays
     * @param adhesionYear l'année d'adhésion du pays à l'Union européenne
     */
    public PaysEU(String nom, String capitale, int habitant, int superficie, int adhesionYear) {
        setName(nom);
        setCapital(capitale);
        setHabitant(habitant);
        setSuperficie(superficie);
        setAdhesionYear(adhesionYear);
    }

    /**
     * Renvoie le nom du pays.
     *
     * @return le nom du pays
     */
    public String getName() {
        return this.name;
    }

    /**
     * Définit le nom du pays.
     *
     * @param name le nom du pays
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Renvoie la capitale du pays.
     *
     * @return la capitale du pays
     */
    public String getCapital() {
        return this.capitale;
    }

    /**
     * Définit la capitale du pays.
     *
     * @param capital la capitale du pays
     */
    public void setCapital(String capital) {
        this.capitale = capital;
    }

    /**
     * Renvoie le nombre d'habitants du pays.
     *
     * @return le nombre d'habitants du pays
     */
    public int getHabitant() {
        return this.habitant;
    }

    /**
     * Définit le nombre d'habitants du pays.
     *
     * @param habitant le nombre d'habitants du pays
     */
    public void setHabitant(int habitant) {
        this.habitant = habitant;
    }

    /**
     * Renvoie la superficie du pays.
     *
     * @return la superficie du pays
     */
    public int getSuperficie() {
        return this.superficie;
    }

    /**
     * Définit la superficie du pays.
     *
     * @param superficie la superficie du pays
     */
    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    /**
     * Renvoie la densité du pays.
     *
     * @return la densité du pays
     */
    public int getDensite() {
        return this.habitant / this.superficie;
    }

    /**
     * Renvoie l'année d'adhésion du pays à l'Union européenne.
     *
     * @return l'année d'adhésion du pays à l'Union européenne
     */
    public int getAdhesionYear() {
        return adhesionYear;
    }

    /**
     * Définit l'année d'adhésion du pays à l'Union européenne.
     *
     * @param adhesionYear l'année d'adhésion du pays à l'Union européenne
     */
    public void setAdhesionYear(int adhesionYear) {
        this.adhesionYear = adhesionYear;
    }
}
