package fr.btsciel;

public class Europe {
    private static final PaysEU[] PAYS = {
            new PaysEU("Allemagne", "Berlin", 83467117, 357569, 1958),
            new PaysEU("France", "Paris", 69112309, 638475, 1958)
    };

    /**
     * @return PaysEU[] renvoie la liste des pays de l'Europe
     */
    public static PaysEU[] getPays() {
        return PAYS;
    }

    /**
     * @return PaysEU[] renvoie la liste des pays de l'Europe triés par ordre alphabétique
     */
    public static PaysEU[] getPaysSortName() {
        PaysEU[] temp = PAYS;
        for (int i = 0; i < PAYS.length; i++) {
            for (int j = i + 1; j < PAYS.length; j++) {
                if (PAYS[i].getName().compareTo(PAYS[j].getName()) > 0) {
                    PaysEU tempPays = PAYS[i];
                    PAYS[i] = PAYS[j];
                    PAYS[j] = tempPays;
                }
            }
        }
        return temp;
    }

    public static PaysEU[] getPaysSortCapital() {
        PaysEU[] temp = PAYS;
        for (int i = 0; i < PAYS.length; i++) {
            for (int j = i + 1; j < PAYS.length; j++) {
                if (PAYS[i].getCapital().compareTo(PAYS[j].getCapital()) > 0) {
                    PaysEU tempPays = PAYS[i];
                    PAYS[i] = PAYS[j];
                    PAYS[j] = tempPays;
                }
            }
        }
        return temp;
    }

    public static PaysEU[] getPaysSortHabitant() {
        PaysEU[] temp = PAYS;
        for (int i = 0; i < PAYS.length; i++) {
            for (int j = i + 1; j < PAYS.length; j++) {
                if (PAYS[i].getHabitant() > PAYS[j].getHabitant()) {
                    PaysEU tempPays = PAYS[i];
                    PAYS[i] = PAYS[j];
                    PAYS[j] = tempPays;
                }
            }
        }
        return temp;
    }

    public static PaysEU[] getPaysSortSuperficie() {
        PaysEU[] temp = PAYS;
        for (int i = 0; i < PAYS.length; i++) {
            for (int j = i + 1; j < PAYS.length; j++) {
                if (PAYS[i].getSuperficie() > PAYS[j].getSuperficie()) {
                    PaysEU tempPays = PAYS[i];
                    PAYS[i] = PAYS[j];
                    PAYS[j] = tempPays;
                }
            }
        }
        return temp;
    }

    public static PaysEU[] getPaysSortDensite() {
        PaysEU[] temp = PAYS;
        for (int i = 0; i < PAYS.length; i++) {
            for (int j = i + 1; j < PAYS.length; j++) {
                if (PAYS[i].getDensite() > PAYS[j].getDensite()) {
                    PaysEU tempPays = PAYS[i];
                    PAYS[i] = PAYS[j];
                    PAYS[j] = tempPays;
                }
            }
        }
        return temp;
    }

    public static PaysEU getMostPeupledPays() {
        return getPaysSortHabitant()[0];
    }

    public static PaysEU getMostSuperficialPays() {
        return getPaysSortSuperficie()[0];
    }

    public static int getTotalSuperficie() {
        int total = 0;
        for (PaysEU pays : PAYS) {
            total += pays.getSuperficie();
        }
        return total;
    }

    public static int getTotalHabitant() {
        int total = 0;
        for (PaysEU pays : PAYS) {
            total += pays.getHabitant();
        }
        return total;
    }

    public static int getGlobalDensity() {
        return getTotalHabitant() / getTotalSuperficie();
    }

    public static PaysEU[] getPaysSortYears() {
        PaysEU[] temp = PAYS;
        for (int i = 0; i < PAYS.length; i++) {
            for (int j = i + 1; j < PAYS.length; j++) {
                if (PAYS[i].getAdhesionYear() > PAYS[j].getAdhesionYear()) {
                    PaysEU tempPays = PAYS[i];
                    PAYS[i] = PAYS[j];
                    PAYS[j] = tempPays;
                }
            }
        }
        return temp;
    }
}
