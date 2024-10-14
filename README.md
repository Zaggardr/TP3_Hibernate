# TP3_Hibernate
Ce projet comprend plusieurs exercices de développement d'applications de gestion en Java avec Hibernate et MySQL. Chaque exercice se concentre sur une thématique spécifique : gestion des produits, gestion des stocks, gestion de projet, et gestion de l’état civil. 

## Prérequis
- **Java Development Kit (JDK)** 8 ou plus récent  
- **NetBeans IDE** ou tout autre IDE Java compatible  
- **MySQL Server** et MySQL Workbench  
- **Hibernate ORM** (bibliothèque JAR)  
- Pilote JDBC MySQL (`mysql-connector-java`)  
- Maven ou Gradle (optionnel)

## Structure du Projet
Le projet est organisé en plusieurs packages, chaque package correspondant à une couche du modèle d'architecture.

### 1. Packages utilisés
- **`ma.projet.entity`** : Contient les entités annotées représentant les tables de la base de données.
- **`ma.projet.config`** : Contient le fichier `hibernate.cfg.xml` pour la configuration de Hibernate.
- **`ma.projet.util`** : Contient la classe `HibernateUtil` pour la création de la session Hibernate.
- **`ma.projet.dao`** : Contient l’interface `IDao` définissant les opérations CRUD.
- **`ma.projet.service`** : Contient les classes de services implémentant les méthodes de l'interface `IDao`.

## Exercice 1 : Gestion des Produits
### Objectif
Créer une application permettant de gérer une liste de produits. 

### Instructions
1. **Créer l’entité Produit** dans le package `ma.projet.entity`.
2. **Configurer Hibernate** avec `hibernate.cfg.xml` dans le package `ma.projet.config`.
3. **Créer la classe `ProduitService`** qui implémente l'interface `IDao`.
4. **Fonctionnalités implémentées** :
   - Ajouter, afficher, modifier et supprimer un produit.
   - Afficher les produits avec un prix > 100 DH.
   - Afficher les produits commandés entre deux dates.
  
## Exercice 2 : Gestion de Stock
### Objectif
Développer une application de gestion de stock pour un magasin de produits informatiques.

### Instructions
1. **Créer les entités** (Produit, Catégorie, Commande, LigneCommande) dans le package `ma.projet.entity`.
2. **Configurer Hibernate** avec le fichier `hibernate.cfg.xml`.
3. **Créer les services** (`ProduitService`, `CategorieService`, `CommandeService`) implémentant `IDao`.
4. **Fonctionnalités supplémentaires** :
   - Afficher la liste des produits par catégorie.
   - Afficher les commandes passées entre deux dates.
## Exercice 3 : Gestion de Projets
### Objectif
Créer une application pour la gestion des projets dans un bureau d'études.

### Instructions
1. **Créer les entités** (Projet, Tâche, Employé) dans le package `ma.projet.entity`.
2. **Configurer Hibernate** avec `hibernate.cfg.xml`.
3. **Fonctionnalités implémentées** :
   - Afficher les projets gérés par un employé donné.
   - Afficher les tâches réalisées pour un projet spécifique.
   - Afficher les tâches dont le coût dépasse 1000 DH.
## Exercice 4 : Gestion de l'État Civil
### Objectif
Développer une application de gestion de l’état civil pour une province.

### Instructions
1. **Créer les entités** (Homme, Femme, Mariage) dans le package `ma.projet.entity`.
2. **Configurer Hibernate** avec le fichier `hibernate.cfg.xml`.
3. **Fonctionnalités implémentées** :
   - Afficher les mariages d'un homme donné.
   - Afficher les femmes mariées au moins deux fois.
   - Compter le nombre d’enfants d'une femme entre deux dates.

## Video
Exercice1 : https://github.com/user-attachments/assets/e61b2606-d5ff-490d-9de7-a69a8b2bbfbc
Exercice2 : https://github.com/user-attachments/assets/9c5abaf9-9fb7-4bf7-a3d1-a5ccdf639bf1
Exercice3 : https://github.com/user-attachments/assets/ff46eb72-ad8b-4a0c-85ba-0148a1fe8b7d
Tar : https://github.com/user-attachments/assets/1a6a3b92-ad0d-44e9-b907-f3fd3e599ee4
## Auteur
Ce projet a été développé par Zaggar Driss.
