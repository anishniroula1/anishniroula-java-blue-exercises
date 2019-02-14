-- Write queries to return the following:
-- The following changes are applied to the "dvdstore" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.
INSERT INTO actor (first_name, last_name)
VALUES ('HAMPTON','AVENUE'),('LISA','BYWAY')

-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in
-- ancient Greece", to the film table. The movie was released in 2008 in English.
-- Since its an epic, the run length is 3hrs and 18mins. There are no special
-- features, the film speaks for itself, and doesn't need any gimmicks.   #1002
SELECT * FROM film
where title = 'Euclidean PI'
INSERT INTO film (title, description,release_year, language_id,length)
VALUES ('Euclidean PI', 'The epic story of Euclid as a pizza delivery boy in ancient Greece', 2008,1, 198);

-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly
-- overprotective mother, in the film, "Euclidean PI". Add them to the film. #1002
INSERT INTO film_actor(film_id, actor_id) 
VALUES 
(
(SELECT film_id FROM film WHERE film.title = 'Euclidean PI'),
(SELECT actor_id FROM actor WHERE actor.first_name = 'HAMPTON' AND actor.last_name = 'AVENUE')
),
((SELECT film_id FROM film WHERE film.title = 'Euclidean PI'), 
(SELECT actor_id FROM actor WHERE actor.first_name = 'LISA' AND actor.last_name = 'BYWAY')
);

-- 4. Add Mathmagical to the category table.
INSERT INTO category (name) 
VALUES ('Mathmagical');

-- 5. Assign the Mathmagical category to the following films, "Euclidean PI",
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"
INSERT INTO film_category (film_id, category_id)
VALUES ((SELECT film_id FROM film WHERE film.title = 'Euclidean PI'), 
(SELECT category_id FROM category WHERE category.name = 'Mathmagical'));

INSERT INTO film_category (film_id, category_id)
VALUES ((SELECT film_id FROM film WHERE film.title = 'EGG IGBY'),
(SELECT category_id from category WHERE category.name = 'Mathmagical'));

INSERT INTO film_category (film_id, category_id)
VALUES ((SELECT film_id FROM film WHERE film.title = 'KARATE MOON'),
(SELECT category_id from category WHERE category.name = 'Mathmagical'));

INSERT INTO film_category (film_id, category_id)
VALUES ((SELECT film_id FROM film WHERE film.title = 'RANDOM GO'),
(SELECT category_id from category WHERE category.name = 'Mathmagical'));

INSERT INTO film_category (film_id, category_id)
VALUES ((SELECT film_id FROM film WHERE film.title = 'YOUNG LANGUAGE'),
(SELECT category_id from category WHERE category.name = 'Mathmagical'));

-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films
-- accordingly.
-- (5 rows affected)

UPDATE film SET rating = 'G'
WHERE film_id IN
(SELECT film_id FROM film_category WHERE category_id = 
(SELECT category_id FROM category WHERE category.name =  'Mathmagical'));

-- 7. Add a copy of "Euclidean PI" to all the stores.
INSERT INTO inventory (film_id, store_id)
VALUES ((SELECT film_id from film WHERE film.title = 'Euclidean PI'),1);
INSERT INTO inventory (film_id, store_id)
VALUES ((SELECT film_id from film WHERE film.title = 'Euclidean PI'),2);


-- 8. The Feds have stepped in and have impounded all copies of the pirated film,
-- "Euclidean PI". The film has been seized from all stores, and needs to be
-- deleted from the film table. Delete "Euclidean PI" from the film table.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>

DELETE FROM film WHERE film.title = 'Euclidean PI';

--It didn't succeed because Euclidean PI film in connected to store, actor, category, which violate the foreign key constraints.

-- 9. Delete Mathmagical from the category table.
-- (Did it succeed? Why?)
DELETE FROM category WHERE category.name = 'Mathmagical';
-- It didn't succeed because Mathmagical category is connected to actor, and film title. which violate the foreign key constraints.

-- 10. Delete all links to Mathmagical in the film_category tale.
-- (Did it succeed? Why?)
DELETE FROM film_category 
WHERE film_category.category_id = (SELECT category_id from category WHERE category.name = 'Mathmagical');
-- yes i am able to delete, because there are no constraint

-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI".
-- (Did either deletes succeed? Why?)
DELETE FROM category WHERE category.name = 'Mathmagical';
-- it delete because everything that was connect to Mathmagical has been deleted.

DELETE FROM film WHERE film.title = 'Euclidean PI';
-- it did not delete because film title still connected to actor. 

-- 12. Check database metadata to determine all constraints of the film id, and
-- describe any remaining adjustments needed before the film "Euclidean PI" can
-- be removed from the film table.

SELECT * FROM INFORMATION_SCHEMA.TABLE_CONSTRAINTS;
SELECT * FROM INFORMATION_SCHEMA.CONSTRAINT_COLUMN_USAGE
SELECT * FROM INFORMATION_SCHEMA.REFERENTIAL_CONSTRAINTS
--We have a constraint of foriegn key on the film_actor table. Due to this, we are not
-- being able to delete the film 'EUCLIDEAN PI'. In order to delete the film, we need to 
-- remove the constraint of the foriegn key. (THE CONSTRAINT IS FROM THE FILM_ACTOR TABLE). 