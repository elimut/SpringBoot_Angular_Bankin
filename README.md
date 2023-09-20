# Application Bankin

Suite tuto Udemy:

Fullstack SpringBoot Angular, dossier SprinBoot Angular Fullstack

## Introduction au projet

On va développer une application bancaire qui permet de créer un compte, effectuer un virement, ...
En ligne.
User/admin

### Concevoir le diagramme de classe (UML)

Après avoir défini le besoin et écrit un cahier des charges, on passe à la conception UML:
plusieurs phases
structure base de données

création d'un compte bancaire, qui va créer ce compte?
utilisateur
deux objets user et compte
faire virement, dépôt, ... = transaction, deux types effectuer un virement ou dépôt d'argent
relations entre ces entités?

un user a un compte, et un compte n'a qu'un seul user: one to one qui peut être bidirectionnelle
la création d'un user implique forcèment la création d'un compte

un user peut effectuer des transactions d'un user vers un autre, vers un autre compte
user aucune  à plusieurs transactions et une transaction appartient à un et un seul user

une transaction peut impliquer la création d'un contact

transaction et account, un user lorsqu'il veut faire une transaction on peut indiquer quel est le compte qu'on veut utiliser

admin table rôle unidirectionnelle one to one

![UML](images/SpringBoot_AppBancaire.drawio.png)

[UML](https://app.diagrams.net/#G1PauvmcU0DnYJ39csDpcpWW08FOW-AREq)

## Mise en place du projet

### Créer un nouveau projet avec les dépendances nécessaires

Spting initializr

Spring Web WEB
Build web, including RESTful, applications using Spring MVC. Uses Apache Tomcat as the default embedded container.
Lombok DEVELOPER TOOLS
Java annotation library which helps to reduce boilerplate code.
Spring Data JPA SQL
Persist data in SQL stores with Java Persistence API using Spring Data and Hibernate.
PostgreSQL Driver SQL
A JDBC and R2DBC driver that allows Java programs to connect to a PostgreSQL database using standard, database independent Java code.
Spring Security SECURITY
Highly customizable authentication and access-control framework for Spring applications.

### Démarrer et tester l'application

Import projet avec Maven: 
settings build Bundled (Maven 3)

application.properties => .yaml

## Spring Data et connexion à la base de données

### Configurer la base de données




## Sources

[Udemy](https://www.udemy.com/course/devenir-fullstack-spring-boot-angular-par-la-pratique/learn/lecture/33844830#reviews)