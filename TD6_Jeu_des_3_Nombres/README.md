# Premier Exercice Interface

Cette interface permet à l'utilisateur de cliquer sur un bouton "TIRAGE"

On tire ensuite 3 nombres "random" compris entre 0 et 9, et on les affiche dans trois cases (champs texte).

Ensuite le programme affiche :

"GAGNE" si la somme des trois nombres > 10

Sinon il affiche "PERDU".

# Etapes

1) Créer le cadre JFrame
2) Accès au contenu du cadre : getContentPanel
3) Créer le panel : JPanel
4) Créer 3 zones de texte : JTextField
5) Associer ces zones de texte au panel 1
6) Créer le panel2 : JPanel
7) Créer un bouton TIRAGE : JButton
8) Créer un JLabel RESULTAT
9) Créer un TextFiel RESULTAT
10) Associer 7, 8, 9 au panel 2
11) Associer au bouton tirage un écouteur : ActionListener
12) Ecrire la méthode actionPerformed associée au bouton TIRAGE

1 à 11 : partie VUE

12 : Partie CONTROLLEUR
