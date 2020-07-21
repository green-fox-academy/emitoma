 USE movies;
 SELECT * FROM movie;

-- Exercise 1
SELECT title FROM movie WHERE director = "Steven Spielberg";



-- Exercise 2

SELECT DISTINCT movie.year FROM movie LEFT JOIN rating ON movie.mID = rating.mID 
WHERE rating.stars BETWEEN 4 AND 5 
ORDER BY movie.year ASC;


-- Exercise 3

SELECT movie.title FROM movie LEFT JOIN rating ON movie.mID = rating.mID
WHERE rating.stars IS NULL;

-- Exercise 4
SELECT reviewer.name FROM reviewer INNER JOIN rating ON reviewer.rID = rating.rID
WHERE ratingDate IS NULL;

-- Exercise 5

SELECT DISTINCT reviewer.name, movie.title, rating.stars, rating.ratingDate
FROM reviewer, movie, rating
ORDER BY reviewer.name , movie.title , rating.stars ASC;

-- Exercise 6todo
