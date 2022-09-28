# GameSpace
Automatisation de la salle de jeu GameSpace 

## Contexte De Projet
Le salon de jeux vidéo GameSpace souhaite gérer les clients qui viennent d’une manière progressive chaque jour GameSpace Donc on vas créer un programme Java console qui facilite un peu le travail et encadrer organiser les horaires.

Alors, pour faire réussir ce projet,on vas focaliser sur ces grands points :

• Le nombre des postes dans le salon est 9 postes, (4 Xbox, 3 PlayStation5, 2 Nintendo switch) pour les écrans (3 écrans Dell, 1 HP, 3 écrans Asus, 2 Samsung)

• Les jeux sont classés par type, ex : (football : FIFA, PES…), (Guerre : Counter-Strike, Assassin's Creed)

• Les horaires d’ouverture sont (09:00 - 12:00 et 14:00 – 20:00) et il utilise le principe (premier arrivé premier servi), du coup une fois les postes seront occupés, les autres peuvent rester dans la deuxième file d’attente.

• La file d’attente a une capacité maximale de 8 places, du coup le max des joueurs dans le salon est 17.

• Les joueurs peuvent choisir entre les horaires disponible (30 min / 1 heure / 2 heures / 5 heures / joueur de luxe (toute la journée)

• Les tarifs sont (5DH – 10DH – 18DH – 40 DH – 65 DH)

## Workflow :

• Un joueur doit choisir le jeu et combien de temps veut jouer.

• l’Admin de GameSpace entre les informations du joueur (prénom, nom, N° de poste libre, heure de début, période horaire, le jeu choisi), un code de joueur doit être généré automatiquement.

• Le joueur paye le montant nécessaire.

• Le poste choisi est automatiquement démarré, une fois l’heure touche sa fin il faut envoyer un signe pour éteindre le poste.

• Après chaque paiement d’un joueur, le montant sera cumulé, pour avoir la somme totale de la journée.

• L’admin peut voir aussi le total des revenus du mois.

• une réduction d’un pourcentage de 5% pour les gens qui vont jouer FIFA et pendant 2 heures ou plus, et un pourcentage de 2% pour le premier arrivé à la salle des jeux, et 10% pour qui vont choisir jouer plus que 5 heures utilisant le poste PS5 et écran Samsung.
