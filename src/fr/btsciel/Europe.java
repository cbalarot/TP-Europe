package fr.btsciel;

public class Europe {
    private static final PaysEU[] PAYS = {
            new PaysEU("Allemagne", "Berlin", 83467117, 357569, 1958),
            new PaysEU("France", "Paris", 69112309, 638475, 1958),
            new PaysEU("Autriche", "Vienne", 9215956, 83882, 1995),
            new PaysEU("Belgique", "Bruxelles", 11955308, 30667, 1958),
            new PaysEU("Bulgarie", "Sofia", 6423207, 110996, 2007),
            new PaysEU("Chypre", "Nicosie", 996571, 9253, 1958),
            new PaysEU("Croatie", "Zagreb", 3876002, 56594, 2013),
            new PaysEU("Danemark", "Copenhague", 6025603, 42925, 1973),
            new PaysEU("Espagne", "Madrid", 49590099, 505983, 1986),
            new PaysEU("Estonie", "Tallinn", 1360745, 45336, 2004),
            new PaysEU("Finlande", "Helsinki", 5652881, 338363, 1995),
            new PaysEU("Grèce", "Athènes", 10366586, 131694, 1981),
            new PaysEU("Hongrie", "Budapest", 9488428, 93012, 2004),
            new PaysEU("Irlande", "Dublin", 5510565, 69947, 1973),
            new PaysEU("Italie", "Rome", 58942828, 302073, 1958),
            new PaysEU("Malte", "La Valette", 588254, 316, 2004),
            new PaysEU("Pays-Bas", "Amsterdam", 18130208, 37391, 1958),
            new PaysEU("Pologne", "Varsovie", 36332765, 311928, 2004),
            new PaysEU("Portugal", "Lisbonne", 11424031, 92226, 1986),
            new PaysEU("Roumanie", "Bucarest", 19041322, 238398, 2007),
            new PaysEU("Slovaquie", "Bratislava", 5409407, 49035, 2004),
            new PaysEU("Suède", "Stockholm", 10605529, 447424, 1995),
            new PaysEU("Tchéquie", "Prague", 10915839, 78871, 2004),
            new PaysEU("Lettonie", "Riga", 1845096, 64594, 2004),
            new PaysEU("Lituanie", "Vilnius ", 2887592, 65284, 2004),
            new PaysEU("Luxembourg", "Luxembourg", 690959, 2595, 1958),
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
