package fr.btsciel;

public class PaysEU {
    private String name;
    private String capitale;
    private int habitant;
    private int superficie;
    private int adhesionYear;

    public PaysEU(String nom, String capitale, int habitant, int superficie, int adhesionYear) {
        setName(nom);
        setCapital(capitale);
        setHabitant(habitant);
        setSuperficie(superficie);
        setAdhesionYear(adhesionYear);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return this.capitale;
    }

    public void setCapital(String capital) {
        this.capitale = capital;
    }

    public int getHabitant() {
        return this.habitant;
    }

    public void setHabitant(int habitant) {
        this.habitant = habitant;
    }

    public int getSuperficie() {
        return this.superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    public int getDensite() {
        return this.habitant / this.superficie;
    }

    public int getAdhesionYear() {
        return adhesionYear;
    }

    public void setAdhesionYear(int adhesionYear) {
        this.adhesionYear = adhesionYear;
    }
}
