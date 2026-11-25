package fr.btsciel;

import fr.btsciel.clavier.In;

/**
 * Classe d'interface utilisateur pour l'application.
 */
public class Ihm {
    static void main(String[] args) {
        final String[] MENU = {
                "Lister les pays par ordre croissant du nom",
                "Lister les pays par ordre croissant de la capitale",
                "Lister les pays par ordre croissant du nombre d’habitants",
                "Lister les pays par ordre croissant de la superficie",
                "Lister les pays par ordre croissant de la densité",
                "Le pays le plus peuplé",
                "Le pays ayant la plus grande superficie",
                "Afficher la superficie totale de l'Union Européenne",
                "Afficher le nombre d'habitants de l'Union Européenne",
                "Afficher le nombre d'habitants au mètre carré de l'Union Européenne",
                "Lister les adhésions par année"
        };

        for (int i = 0; i < MENU.length; i++) {
            System.out.println("[" + (i + 1) + "] " + MENU[i]);
        }
        System.out.print("\nChoix : ");
        switch (In.readInteger()) {
            case 1:
                showTab(Europe.getPaysSortName());
                break;
            case 2:
                showTab(Europe.getPaysSortCapital());
                break;
            case 3:
                showTab(Europe.getPaysSortHabitant());
                break;
            case 4:
                showTab(Europe.getPaysSortSuperficie());
                break;
            case 5:
                showTab(Europe.getPaysSortDensite());
                break;
            case 6:
                PaysEU[] getMostPeupledPays = {Europe.getMostPeupledPays()};
                showTab(getMostPeupledPays);
                break;
            case 7:
                PaysEU[] mostSuperficialPays = {Europe.getMostSuperficialPays()};
                showTab(mostSuperficialPays);
                break;
            case 8:
                System.out.println("La superficie totale de l'Union Européenne est de " + Europe.getTotalSuperficie() + " km².");
                break;
            case 9:
                System.out.println("Le nombre d'habitants de l'Union Européenne est de " + Europe.getTotalHabitant() + " habitants.");
                break;
            case 10:
                System.out.println("Le nombre d'habitants au mètre carré de l'Union Européenne est de " + Europe.getGlobalDensity() + " habitants/km².");
                break;
            case 11:
                showTab(Europe.getPaysSortYears());
                break;
        }
    }

    /**
     * Affiche un tableau de pays.
     *
     * @param tab le tableau de pays à afficher
     */
    static void showTab(PaysEU[] tab) {
        System.out.println("+----------------------".repeat(6) + "+");
        System.out.println("|  Nom du pays         |  Nom de la capitale  |  Nombre d'habitants  |  Superficie      " +
                "    |  Densité             |  Année d'adhésion    |");
        System.out.println("+----------------------".repeat(6) + "+");
        for (PaysEU pays : tab) {
            System.out.printf("|  %-20s|  %-20s|  %-20d|  %-20s|  %-20s|  %-20s|\n", pays.getName(),
                    pays.getCapital(),
                    pays.getHabitant(), pays.getSuperficie() + " km²", pays.getDensite() + " hab/km²", pays.getAdhesionYear());
            System.out.println("+----------------------".repeat(6) + "+");
        }
    }
}
